import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

import { LoginService } from 'src/app/services/login.service';



@Component({
  selector: 'app-connexion',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.css']
})
export class ConnexionComponent implements OnInit {
  success: boolean = false

  constructor(private loggin:LoginService,private route1: Router) { }
  email :any
  password :any 
  isLoggedIn!: Observable<boolean>;  

  ngOnInit(): void {
    this.isLoggedIn = this.loggin.isLoggedIn;
  }
  
  connexion(connexionForm:any){
    let data=connexionForm.value;
    this.email=data.email
    this.password= data.password
    this.loggin.login(this.password,this.email)
  }
}
