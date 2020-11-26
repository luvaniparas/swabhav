import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GetNumberFactsService {
  
  private numberApiUrl : string = "http://numbersapi.com/";
  segregatedArray : any = [] ;
  private options = { headers: new HttpHeaders().set('Content-Type', 'text/plain'), responseType: 'text' as 'json' };
  constructor(private http:HttpClient) { }

  getNumbersFact(num : number): Observable<string>{
    return this.http.get<string>(this.numberApiUrl + num , this.options );
  }

  addDataToLocalStorage( date : any ,  data : any){
    console.log("localStorage date : "+date);
    
    localStorage.setItem( date , data);
  }
}

