import { Injectable } from '@angular/core';
import { LoggerService } from "./logger.service"


@Injectable({
  providedIn: 'root'
})
export class MathService {

constructor(private service: LoggerService) { }
  
  cubes(num): number {
    console.log("inside Mathservice : ");
    this.service.log(num);
    return num ** 3;
  }
}
