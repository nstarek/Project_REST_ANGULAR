import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Articles } from 'src/Articles';

@Injectable({
  providedIn: 'root'
})
export class ArticleService {
  url = 'http://localhost:3000/Articles/';

  constructor(private http: HttpClient) { }
  getAll(): Observable<Array<Articles>>{
  return this.http.get<Array<Articles>>(this.url);
}
}
