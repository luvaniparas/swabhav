import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-way-binding',
  templateUrl: './two-way-binding.component.html',
  styleUrls: ['./two-way-binding.component.css']
})
export class TwoWayBindingComponent implements OnInit {
  firstName : string ;
  lastName : string = "Paras" ;

  constructor() { }

  ngOnInit(): void {
      }
  
  firstNamechange(event) {
      this.firstName = event.toLowerCase();
  }

}
