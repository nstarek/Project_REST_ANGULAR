import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { BehaviorSubject } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class LoginService {
  response:boolean=false

  private loggedIn = new BehaviorSubject<boolean>(false);
  
  constructor(private http: HttpClient, private route:Router) { }
  url_logging = "http://localhost:8080/Servers/rest/admin/login/hightech@admin.com/password/hightech/"
  

  get isLoggedIn() {
    return this.loggedIn.asObservable(); 
  }

  
login(pass:string, email: string){
    let loggingUrl="http://localhost:8080/Servers/rest/admin/login/"+email+"/password/"+pass+"/";
    this.http.get(loggingUrl).subscribe((res: any) =>{    
          if(res){
            console.log("Connected:"+this.response);
            this.loggedIn.next(true);
            this.route.navigate(['/Home']);
          }
        }
     
    );
  }

  logout() {                           
    this.loggedIn.next(false);
    this.route.navigate(['/Home']);
  }
 
}
