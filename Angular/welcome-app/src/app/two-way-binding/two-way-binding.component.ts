import { Component, OnInit } from '@angular/core';
import { LoggerService } from '../appServices/logger.service';
import { MathService } from "../appServices/math.service";

@Component({
  selector: 'app-two-way-binding',
  templateUrl: './two-way-binding.component.html',
  styleUrls: ['./two-way-binding.component.css'],
  providers:[LoggerService,MathService]
})
export class TwoWayBindingComponent implements OnInit {
  firstName : string ;
  lastName : string = "Paras" ;

  constructor(private math: MathService) { }

  ngOnInit(): void {
    console.log("Hello ngOnit");
    let result = this.math.cubes(3);
    console.log(result);

    
  }
  
  firstNamechange(event) {
      this.firstName = event.toLowerCase();
  }

}
