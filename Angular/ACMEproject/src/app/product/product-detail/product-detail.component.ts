import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {

  product ;
  productId;
  localStorageProduct ;
  productName ;
  productCode;
  releaseDate;
  description;
  price;
  starRating;
  imageUrl;

  constructor(private router: Router,private pls : ProductService) { }

  ngOnInit(): void {
    console.log("Inside pDetails ngOnInit()");
    
    this.pls.productMessage$.subscribe(
      result => {
        console.log("Product Recieved : "+JSON.stringify(result));
        this.product = result ;
        this.productId = this.product.productId;
        localStorage.setItem(this.productId,JSON.stringify(this.product));
      },error => {
        console.log("Error : "+error);
      }
    )
    this.getProductDetailsLocalstorage();
  }
  
  backToPtoductList(){
    this.router.navigate(['/productList']);
  } 

  getProductDetailsLocalstorage(){
    console.log("Inside getProductDetailsLocalstorage()");
    let receivedProduct = localStorage.getItem(this.productId);
    console.log("ReceivedProduct from localStorage : "+receivedProduct+" Type : "+typeof(receivedProduct));
    
    let key = localStorage.key(0);
    let value = localStorage.getItem(key);
    console.log("Key : "+key+" Value : "+value);

    this.localStorageProduct = JSON.parse(value);
    this.productName = this.localStorageProduct.productName ;
    this.productCode = this.localStorageProduct.productCode ;
    this.description = this.localStorageProduct.description ;
    this.releaseDate = this.localStorageProduct.releaseDate ;
    this.price = this.localStorageProduct.price ;
    this.starRating = this.localStorageProduct.starRating ;
    this.imageUrl = this.localStorageProduct.imageUrl ;
   
    this.deleteProductDetailLocalStorage(key);
  }

  deleteProductDetailLocalStorage(key){
    if(localStorage.length == 4){
        localStorage.clear();
    }
  }
}
