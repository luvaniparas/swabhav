import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  onColor;
  offColor;
  bgColor = "black";

  constructor() { }

  ngOnInit(): void {
  }

  stateChangeHandler = function(event) {
    console.log(event);
    this.bgColor = event;
  }

}
