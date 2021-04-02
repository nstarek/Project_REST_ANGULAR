import { Component, OnInit } from '@angular/core';
import { RestService } from 'src/app/services/rest.service';

@Component({
  selector: 'app-accessoir',
  templateUrl: './accessoir.component.html',
  styleUrls: ['./accessoir.component.css']
})
export class AccessoirComponent implements OnInit {
  article: any;
  clicked:boolean = false;
  list: any;
  articlesparID: any = [];
  constructor(private restService: RestService) { }

  ngOnInit(): void {

    this.restService.getAllAccessoireStockage().subscribe((res: any) => {
      this.list = res
    });
  }

  getArticleParID(idArticle: any): void {
    if(this.clicked ==false){
    this.restService.RecupererArticle(idArticle).subscribe(
      (data) => {
        this.article = data;
        this.clicked = true;
      }
    );
    }
    else{
      this.clicked = false;
    }
  }

  

}
