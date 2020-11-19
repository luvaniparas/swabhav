import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {
  message : String ;
  constructor() { 
    console.log("Constructor");
    this.message = "Welcome to Angular-10 Component"
  }

  ngOnInit(): void {
    console.log("ngOnInit");
  }
}

