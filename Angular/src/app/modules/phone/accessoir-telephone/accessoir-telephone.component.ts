import { Component, OnInit } from '@angular/core';
import { RestService } from 'src/app/services/rest.service';

@Component({
  selector: 'app-accessoir-telephone',
  templateUrl: './accessoir-telephone.component.html',
  styleUrls: ['./accessoir-telephone.component.css']
})
export class AccessoirTelephoneComponent implements OnInit {
  article: any;
  clicked:boolean = false;
  list: any;
  articlesparID: any = [];
  constructor(private restService: RestService) { }

  ngOnInit(): void {

    this.restService.getAllAccessoireTel().subscribe((res: any) => {
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
