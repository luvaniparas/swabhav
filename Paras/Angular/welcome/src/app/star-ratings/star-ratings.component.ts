import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-star-ratings',
  templateUrl: './star-ratings.component.html',
  styleUrls: ['./star-ratings.component.css']
})
export class StarRatingsComponent implements OnInit {

  rating;
  currentRating: number = 3.5;

  constructor() { }

  ngOnInit(): void {
  }

  onMouseOverHandler = function() {
    console.log("Mouseover: " + this.currentRating);
  }
  
}
