import { Injectable } from '@angular/core';
import { LoggerService } from './logger.service';

@Injectable({
  providedIn: 'root'
})
export class MathService {
  
  constructor(private log:LoggerService ) { }

  cubes(num : number):number{
    console.log(this.log.display("CustomService"));
    return num*num*num ;
  }

}
