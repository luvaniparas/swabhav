var readLine = require('readline-sync');

console.log("* Welcome to Guess Number game * ");

var attempt = 0 ;
var winner = false ;
var randomNumber = Math.round(Math.random()*10) ;

var startGame = function(){
    do{
        var enteredNumber = readLine.question("Guess the number : ");

        if(enteredNumber == randomNumber){
            winner = true ;
            attempt++;
            
            console.log("Guess is right");
            console.log("Number of attempts = "+attempt);
            console.log("Random number is : "+randomNumber);

            var restart = readLine.question("Do you want to play again ? 'Y'|'N'");
            if(restart == 'Y' || restart == 'y'){
                attempt = 0;
                winner =false;
                randomNumber = Math.round(Math.random()*10);
                startGame();
            }else{
                console.log("Bye");
                process.exit(1);
            }
        }
        else if(enteredNumber > randomNumber){
            attempt++;
            console.log("Guess number is too high ! ");
        }
        else if(enteredNumber < randomNumber){
            attempt++;
            console.log("Guess number is too low ! ");
        }
    }while(!winner);
}
startGame();

