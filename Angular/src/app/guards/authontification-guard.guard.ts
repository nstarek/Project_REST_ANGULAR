import { Injectable } from '@angular/core';
import { CanActivate, Router } from '@angular/router';
import { LoginService } from '../services/login.service';

@Injectable({
  providedIn: 'root'
})
export class AuthontificationGuardGuard implements CanActivate {
  constructor(private authService : LoginService ,private route1: Router){}
  canActivate():boolean{
    if (this.authService.isLoggedIn){
      return true
    }
    else {
      this.route1.navigate(['/connexion'])
      return false
    }
  }

}
