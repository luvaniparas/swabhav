const readLine = require('readline-sync');

console.log("* Welcome to Guess Number game * ");

let attempt = 0 ;
let winner = false ;
let randomNumber = Math.round(Math.random()*10) ;

let startGame = function(){
    do{
        let enteredNumber = readLine.question("Guess the number : ");

        if(enteredNumber == randomNumber){
            winner = true ;
            attempt++;
            
            console.log("Guess is right");
            console.log("Number of attempts = "+attempt);
            console.log("Random number is : "+randomNumber);

            let restart = readLine.question("Do you want to play again ? 'Y'|'N' : ");
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

