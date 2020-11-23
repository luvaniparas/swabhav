import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  constructor() {
    console.log("Inside constructor()");
   }

  ngOnInit(): void {
    console.log("Inside ngOnInit()");
  }

}
