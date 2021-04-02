import { Component, OnInit } from '@angular/core';
import { RestService } from 'src/app/services/rest.service';

@Component({
  selector: 'app-delete-article',
  templateUrl: './delete-article.component.html',
  styleUrls: ['./delete-article.component.css']
})
export class DeleteArticleComponent implements OnInit {

  success: boolean = false
  constructor(private restService: RestService) { }

  ngOnInit(): void {
  }
  delete(deleteArticle:any){
    let data=deleteArticle.value;
    console.log(data.id)
    this.restService.deleteArticle(data.id).subscribe(data => {
      this.success = data;})
  }
}

