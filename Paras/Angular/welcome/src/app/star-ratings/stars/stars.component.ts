import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-stars',
  templateUrl: './stars.component.html',
  styleUrls: ['./stars.component.css']
})
export class StarsComponent implements OnInit {

  @Input() rating : string;
  maxRating = 5;

  constructor() { }

  ngOnInit(): void {
    console.log(this.rating);
  }

}
