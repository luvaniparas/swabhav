import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  showImage = true;
  ImageButtonvalue : string = "Hide Image";
  searchValue : string ;
  products ;
  productName : string = "a";
  
  constructor(private pls : ProductService) { }

  ngOnInit(): void {
    this.pls.getProductData().subscribe(
      result => {
        this.products = result ;
        //console.log("Products : "+JSON.stringify(this.products)+" TypeOf : "+typeof(this.products));
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

  clickedProductData(p){
    //console.log("clickedProductData(p)");
    this.pls.sendMessage(p);
  }

}
