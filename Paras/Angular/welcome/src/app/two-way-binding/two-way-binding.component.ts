import { Component, OnInit } from '@angular/core';
import {MathService} from '../MyCustomServices/math.service';

@Component({
  selector: 'app-two-way-binding',
  templateUrl: './two-way-binding.component.html',
  styleUrls: ['./two-way-binding.component.css'],
  providers:[MathService]
})
export class TwoWayBindingComponent implements OnInit {

  firstName : string ="";
  lastName : string = "Luvani" ;
  demo : number = 21 ;

  constructor(private m : MathService) { }

  ngOnInit(): void {
    console.log(this.m.cubes(3));
  }

  firstNameChange($event){
    this.firstName = $event.toUpperCase();
  }
  
}
