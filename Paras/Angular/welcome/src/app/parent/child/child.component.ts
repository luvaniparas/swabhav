import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  @Input() onColor : string ;
  @Input() offColor : string ;
  @Output() e = new EventEmitter<string>() ;

  value:string = 'OFF'; 

  constructor() { }

  ngOnInit(): void {
  }

  changebackgroundColor(){
       if(this.value === "OFF"){
          this.value = "ON" ;
          this.e.emit(this.onColor);
       }
       else{
         this.value="OFF";
         this.e.emit(this.offColor);
       }
  } 
}
