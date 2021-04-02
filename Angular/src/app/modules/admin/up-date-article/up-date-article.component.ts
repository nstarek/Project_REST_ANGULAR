import { Component, OnInit } from '@angular/core';
import { RestService } from 'src/app/services/rest.service';

@Component({
  selector: 'app-up-date-article',
  templateUrl: './up-date-article.component.html',
  styleUrls: ['./up-date-article.component.css']
})
export class UpDateArticleComponent implements OnInit {
  success: boolean =false;
  constructor(private restService: RestService) { }

  ngOnInit(): void {
  }
  UpDate(UpDateForm :any){
    let data= UpDateForm.value
    console.log(data)


    const body = { 
      id: data.id,
      libelle: data.libelle,
      marque:data.marque,
      categorie: null, 
      prix: data.prix,
      imagepath: data.ImagePath,
      description: data.description
    };

    this.restService.updateArticle(body).subscribe(data => {
        this.success = data;})
  }
    
    
}
