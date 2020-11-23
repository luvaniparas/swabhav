import { Component, OnInit } from '@angular/core';
import{MathObservableService} from '../appServices/math-observable.service'

@Component({
  selector: 'app-observable',
  templateUrl: './observable.component.html',
  styleUrls: ['./observable.component.css'],
  providers:[MathObservableService]
})
export class ObservableComponent implements OnInit {
  squaredNum: number;

  constructor(private m : MathObservableService) { }

  ngOnInit(): void {
    
    this.m.getSquare(2)
    .subscribe(data => {
      this.squaredNum = data;
      console.log(data);
    },
    e => {
      console.log(e);
    });

    () => {
      console.log("completed");
    }
  }
}

