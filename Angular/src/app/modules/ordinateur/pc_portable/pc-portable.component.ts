import { Component, OnInit } from '@angular/core';
import { RestService } from 'src/app/services/rest.service';


@Component({
  selector: 'app-pc-portable',
  templateUrl: './pc-portable.component.html',
  styleUrls: ['./pc-portable.component.css']
})
export class PCPortableComponent implements OnInit {
  article: any;
  clicked:boolean = false;
  list: any;
  articlesparID: any = [];


  constructor(private restService: RestService) { }


  ngOnInit(): void {
    this.restService.getAllPcPortable().subscribe((res: any) => {
      this.list = res
    });
  }
  getArticleParID(idArticle: any): void {
    if(this.clicked ==false){
    this.restService.RecupererArticle(idArticle).subscribe(
      (data) => {
        this.article = data;
        this.clicked = true;
        console.log(data)
      }
    );
    }
    else{
      this.clicked = false;
    }
    

  }
}
