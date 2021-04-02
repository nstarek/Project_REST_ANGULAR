import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';



@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  
  isUser:boolean= false;
  
  constructor(private loggin:LoginService) { 
  }

  ngOnInit(): void {
    this.loggin.isLoggedIn.subscribe(res => {
      if (res==true)
        this.isUser = true;
    });
  }
  onLogout(){ 
    this.isUser=false;
    this.loggin.logout(); 
  }

}
