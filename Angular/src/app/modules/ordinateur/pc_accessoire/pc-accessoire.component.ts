import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RestService } from 'src/app/services/rest.service';

@Component({
  selector: 'app-pc-accessoire',
  templateUrl: './pc-accessoire.component.html',
  styleUrls: ['./pc-accessoire.component.css']
})
export class PCAccessoireComponent implements OnInit {
  article: any;
  clicked:boolean = false;
  list: any;
  articlesparID: any;

  constructor(private restService: RestService, private router: Router) { }

  ngOnInit(): void{
    this.restService.getAllPcAccessoir().subscribe((res: any) =>{
      this.list = res});
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
