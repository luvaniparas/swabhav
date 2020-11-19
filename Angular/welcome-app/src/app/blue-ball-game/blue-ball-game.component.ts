import { Component, OnInit } from '@angular/core';
import { IBall } from "./IBall"

@Component({
  selector: 'app-blue-ball-game',
  templateUrl: './blue-ball-game.component.html',
  styleUrls: ['./blue-ball-game.component.css']
})
export class BlueBallGameComponent implements OnInit {

  minBalls: number = 1;
  maxBalls: number = 51;
  attempts: number = 3;
  randomNumber: number;
  result : string ;
  balls : IBall[] = [];
  showRules : boolean = true ;
  showStatus : boolean = false ;

  constructor() { }

  ngOnInit(): void {
  }

  startGame() {
    console.log("Inside Startgame");
    this.genrateRandom();
    this.genrateBalls();
  }
  
  genrateRandom(){  
    this.randomNumber = Math.floor((Math.random() * this.maxBalls) + this.minBalls);
    console.log("Inside genrate randomNumber "+this.randomNumber);
  }

  genrateBalls(){
    console.log("Inside genrate balls");
    for(let i = 1 ; i < this.maxBalls ; i++){
      this.balls.push({
        id : i,
        bgColor : "grey",
        currentColor: "grey",
        disabled: false
      });  
    }
  }

  checkGame(id){
    console.log("Inside Checkgame : "+id);
    this.showRules = false ;
    this.showStatus = true;
    
    if(this.attempts < 4 && this.attempts > 0){

      if(this.randomNumber == id || this.attempts == 0){
        console.log("Winning condition BlueBall ");
        
        this.balls[id-1].currentColor = 'blue';
        this.result = "Congrats! You have won the game"
        this.endGame();
      }

      if(id > this.randomNumber){
        this.balls[id-1].currentColor = 'red';
        this.attempts = this.attempts-1;
      }

      if(id < this.randomNumber){
        this.balls[id-1].currentColor = 'green';
        this.attempts = this.attempts-1;
      } 
    }
    else{
      this.balls[this.randomNumber].currentColor = 'blue';
      this.result = "Try Again! You losed the game"
      this.endGame();
    }
  }

  endGame(){
    console.log("Inside endGame : ");

    for(let i=this.minBalls; i < this.maxBalls; i++) {      
      this.balls[i-1].disabled = true;
    }
  }

  reloadPage(){
    console.log("Inside reloadGame : ");

    location.reload();
  }
}
