import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class ProductService {
  url : string = "assets/products.jsonx";
  
  private productMessageSource = new Subject<object>();
  productMessage$ = this.productMessageSource.asObservable();

  constructor(private http : HttpClient) { }

  getProductData(){  
    return this.http.get(this.url);
  }

  sendMessage(message: any) {
    //console.log("Inside sendMessage() : "+JSON.stringify(message));
    this.productMessageSource.next(message);
    //console.log("Inside sendMessage() : "+JSON.stringify(this.productMessage$));
  }
  
}
