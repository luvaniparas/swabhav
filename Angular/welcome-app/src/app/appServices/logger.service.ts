import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggerService {

  constructor() { }

  log(text:any) {
    console.log("Inside LoggerService :" + text);
    console.log(text);
  }

}
