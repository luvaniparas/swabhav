import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient,HttpHeaders } from "@angular/common/http";
import { IStudents } from '../students/IStudents';

@Injectable({
  providedIn: 'root'
})
export class GetStudentService {

  url : string ="http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students";
  
  constructor(private http : HttpClient ) { }

  getData():Observable<IStudents[]>{  
     return this.http.get<IStudents[]>(this.url);
  }

  addData(studentDetails):Observable<any>{
    let studentJSON: string = JSON.stringify(studentDetails);
    let httpHeaders = new HttpHeaders( { 'Content-type': 'application/json; charset=utf-8'} );

    console.log(studentJSON);    

    return this.http.post<any>(this.url, studentJSON, {'headers': httpHeaders} );
  }

 
}
