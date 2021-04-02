import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Articles } from 'src/Articles';

@Injectable({
  providedIn: 'root'
})
export class RestService {
  url = 'http://localhost:8080/Servers/rest/articles';

  url_PcPortable='http://localhost:8080/Servers/rest/categorie/Ordinateurs/SousCategorie/PC Portable/article'
  url_PcBureau='http://localhost:8080/Servers/rest/categorie/Ordinateurs/SousCategorie/PC Bureau/article'
  url_PcAccessoir='http://localhost:8080/Servers/rest/categorie/Ordinateurs/SousCategorie/PC Accessoires/article'

  url_Smartphone = 'http://localhost:8080/Servers/rest/categorie/Telephones/SousCategorie/Smartphone/article'
  url_Telefix = 'http://localhost:8080/Servers/rest/categorie/Telephones/SousCategorie/Telephone fixe/article'
  url_AccessoireTel = 'http://localhost:8080/Servers/rest/categorie/Telephones/SousCategorie/Accessoire Tel/article'

  url_disquedur = 'http://localhost:8080/Servers/rest/categorie/Stockage/SousCategorie/Disque Dur/article'
  url_usb = 'http://localhost:8080/Servers/rest/categorie/Stockage/SousCategorie/Cle USB/article'
  url_AccessoireStockage= 'http://localhost:8080/Servers/rest/categorie/Stockage/SousCategorie/Accessoire Stockage/article'

  url_Article = 'http://localhost:8080/Servers/rest/articles/'




  constructor(private http: HttpClient, private route:Router) { }
  getAll():Observable<Array<Articles>>{
    return this.http.get<Array<Articles>>(this.url);
  }

  getAllPcPortable():Observable<Array<Articles>>{
    return this.http.get<Array<Articles>>(this.url_PcPortable);
  }
  getAllPcBureau():Observable<Array<Articles>>{
    return this.http.get<Array<Articles>>(this.url_PcBureau);
  }
  getAllPcAccessoir():Observable<Array<Articles>>{
    return this.http.get<Array<Articles>>(this.url_PcAccessoir);
  }

  getAllSmartphone():Observable<Array<Articles>>{
    return this.http.get<Array<Articles>>(this.url_Smartphone);
  }

  getAllTelefix():Observable<Array<Articles>>{
    return this.http.get<Array<Articles>>(this.url_Telefix);
  }

  getAllAccessoireTel():Observable<Array<Articles>>{
    return this.http.get<Array<Articles>>(this.url_AccessoireTel);
  }

  getAlldisquedur():Observable<Array<Articles>>{
    return this.http.get<Array<Articles>>(this.url_disquedur);
  }

  getAllusb():Observable<Array<Articles>>{
    return this.http.get<Array<Articles>>(this.url_usb);
  }

  getAllAccessoireStockage():Observable<Array<Articles>>{
    return this.http.get<Array<Articles>>(this.url_AccessoireStockage);
  }

  addArticle(body: any):Observable<boolean>{
    return this.http.post<boolean>(this.url+"/add",body);
  }

  deleteArticle(id: any):Observable<boolean>{
    return this.http.delete<boolean>(this.url+"/delete/"+id);
  }

  updateArticle(body: any):Observable<boolean>{
    return this.http.put<boolean>(this.url+"/update",body);
  }

  getArticleByID(IDarticle:any): Observable<Array<Articles>> {
    return this.http.get<Array<Articles>>(this.url_Article + IDarticle);
  }
  RecupererArticle(id : any): Observable<Array<Articles>> {
    return this.http.get<Array<Articles>>(this.url_Article+ id);
  }

  

}
