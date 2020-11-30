import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {
  
  product ;

  constructor(private router: Router) { 
    this.product = this.router.getCurrentNavigation().extras.state ;
  }

  ngOnInit(): void {
  }
  
  backToPtoductList(){
    this.router.navigate(['/productList']);
  } 
}
