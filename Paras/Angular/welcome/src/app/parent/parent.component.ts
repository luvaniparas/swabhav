import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  onColor:string ;
  offColor:string ;

  bgClr:string = "Yellow" ;

  constructor() { }

  ngOnInit(): void {
  }

  displayColors($event){
    console.log("DisplayColor() : "+$event);
    this.bgClr = $event;
  }
}
