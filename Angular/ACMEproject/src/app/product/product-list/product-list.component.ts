import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { IProduct } from './IProduct';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  showImage = true;
  ImageButtonvalue : string = "Hide Image";
  searchValue : string ;
  products : IProduct;
  productName : string = "a";
  
  constructor(private productService : ProductService) { }

  ngOnInit(): void {
    this.productService.getProductData().subscribe(
      result => {
        this.products = result ;
      },error =>{console.log("Error : "+error.value)})
  }

  changeButtonImage(){
    console.log("changeButtonImage()");
    
    if(this.ImageButtonvalue === 'Hide Image') {
      this.ImageButtonvalue='Show Image';
      this.showImage = true;    
    } else {
      this.ImageButtonvalue='Hide Image';
      this.showImage = false;
    }
  }

  searchProduct(){
    console.log("Inside SearchProduct() "+this.searchValue);
  }

}
