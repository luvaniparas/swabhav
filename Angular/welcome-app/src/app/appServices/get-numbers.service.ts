import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class GetNumbersService {
  
  studentsApiUrl : string = 'http://numbersapi.com/';

  constructor(private http : HttpClient) { }

  getstudentsFromAPI(n : number): Observable<string> {
    return this.http.get<string>(this.studentsApiUrl+n);
  } 

}
