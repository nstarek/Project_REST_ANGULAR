import { Component, OnInit } from '@angular/core';
import { RestService } from 'src/app/services/rest.service';

@Component({
  selector: 'app-create-article',
  templateUrl: './create-article.component.html',
  styleUrls: ['./create-article.component.css']
})
export class CreateArticleComponent implements OnInit {

  success: boolean = false

  categories = [
    { id: "1", name: "PC Portable" },
    { id: "2", name: "PC Bureau" },
    { id: "3", name: "PC Accessoires" },
    { id: "4", name: "Smartphone" },
    { id: "5", name: "Telephone fixe" },
    { id: "6", name: "Accessoire Tel" },
    { id: "7", name: "Disque Dur" },
    { id: "8", name: "Cle USB" },
    { id: "9", name: "Accessoire Stockage" }
  ];
 
  constructor(private restService: RestService) { }
  
  ngOnInit(): void {
    
  }

  add(addForm:any){
    let data=addForm.value;
    console.log(data);

    const body = { 
                  id: -1,
                  libelle: data.libelle,
                  marque:data.marque,
                  categorie: data.categorie.name, 
                  prix: data.prix,
                  imagepath: data.ImagePath,
                  description: data.description
           };
          
    
    this.restService.addArticle(body).subscribe(data => {
                this.success = data;
                
              
              })
    }

}
