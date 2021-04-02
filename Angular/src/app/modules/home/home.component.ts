import { Component, OnInit } from '@angular/core';
import { ArticleService } from 'src/app/article.service';
import { RestService } from 'src/app/services/rest.service';



@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  dataArray: any;

  constructor(private restService: RestService) { }

  ngOnInit(): void{
    this.restService.getAll().subscribe(res =>{
      this.dataArray = res});
  }

}
