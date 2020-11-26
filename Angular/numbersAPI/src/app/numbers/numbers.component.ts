import { Component, OnInit } from '@angular/core';
import { GetNumberFactsService } from '../appService/get-number-facts.service'
import * as moment from 'moment';

@Component({
  selector: 'app-numbers',
  templateUrl: './numbers.component.html',
  styleUrls: ['./numbers.component.css']
})
export class NumbersComponent implements OnInit {

  enteredNumber : number ;
  numbersTrivia : any = [] ;
  currentTimeLS : string  ;

  constructor(private ns : GetNumberFactsService) { }

  ngOnInit(): void { 
    for(var data in window.localStorage) {
      if(window.localStorage.hasOwnProperty(data)) {
        let time = localStorage.getItem(data);
  
        this.numbersTrivia.push({
          fact: data,
          dateTime: this.calculateTimeDifference(time)
        });
      }
    }
  }

  //TimeDifference
  calculateTimeDifference(time){
    let taskAddedTime = moment(time);
    let currentTime = moment(moment().format('MM DD YYYY hh:mm:ss'));
    let compare = moment.duration(taskAddedTime.diff(currentTime));
    return compare.humanize(true);
  }

    getNumberFact(){
      this.ns.getNumbersFact(this.enteredNumber).subscribe(
        result => { 
          //Table View Array 
          this.numbersTrivia.push({
            fact : result ,
            dateTime : this.calculateTimeDifference( moment().format('MM DD YYYY hh:mm:ss') )
          });

          //Service Function to add Data
          this.ns.addDataToLocalStorage(result,moment().format('MM DD YYYY hh:mm:ss'));          
        },
        error => {console.log("Error : "+error);}
      )
    }
}

