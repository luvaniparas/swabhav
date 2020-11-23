import { EventEmitter, Input, Output } from '@angular/core';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-toggle',
  templateUrl: './toggle.component.html',
  styleUrls: ['./toggle.component.css']
})
export class ToggleComponent implements OnInit {

  @Input() onColor: string;
  @Input() offColor: string;

  @Output() stateChange = new EventEmitter();

  value:string = 'OFF';

  constructor() { }

  ngOnInit(): void {
  }

  changeBgColor = function() {
    if(this.value === 'OFF') {
      this.value='ON';
      this.stateChange.emit(this.onColor);    
    } else {
      this.value='OFF';
      this.stateChange.emit(this.offColor);
    }

  }
}
