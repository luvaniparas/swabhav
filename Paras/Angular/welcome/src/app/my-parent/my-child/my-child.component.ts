import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-my-child',
  templateUrl: './my-child.component.html',
  styleUrls: ['./my-child.component.css']
})
export class MyChildComponent implements OnInit {

  @Input() onColor: string ;
  @Input() offColor: string ;

  @Output() e = new EventEmitter<string>();
  buttonValue = "OFF" ;

  constructor() { }

  ngOnInit(): void {
  }

  changeButtonValues(){
    if(this.buttonValue === "OFF"){
      this.buttonValue = "ON";
      this.e.emit(this.onColor);
    }else{
      this.buttonValue = "OFF";
      this.e.emit(this.offColor);
    }
  }
}
