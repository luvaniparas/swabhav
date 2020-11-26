import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from "@angular/common/http";
import { Observable } from 'rxjs';
import { IStudents } from '../home/IStudents';

@Injectable({
  providedIn: 'root'
})
export class StudentsService {

  url : string ="http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students";
  constructor( private http : HttpClient ) { }

  getData():Observable<IStudents[]>{  
    return this.http.get<IStudents[]>(this.url);
  }

  addData(studentDetails):Observable<any>{
    let studentJSON: string = JSON.stringify(studentDetails);
    let httpHeaders = new HttpHeaders( { 'Content-type': 'application/json; charset=utf-8'} );

    console.log(studentJSON);    

    return this.http.post<any>(this.url, studentJSON, {'headers': httpHeaders} );
  }
  
  deleteData(id):Observable<any>{  
    return this.http.delete<any>(this.url+"/"+id);
  }

  updateData(uid,updatedStudent):Observable<any>{
    console.log("Updated Service : uid ="+uid);
    let httpHeaders = new HttpHeaders( { 'Content-type': 'application/json; charset=utf-8'} );
    let studentJSON: string = JSON.stringify(updatedStudent);
    
    console.log("Updated Service : "+this.url+"/"+uid+" "+studentJSON);
    return this.http.put<IStudents>(this.url+"/"+uid, studentJSON, {'headers': httpHeaders} );
  }
}
