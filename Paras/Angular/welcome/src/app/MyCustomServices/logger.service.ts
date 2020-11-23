import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggerService {

  constructor() { }

  display(txt : string){
    console.log("Logger Service "+txt);
  }
}
