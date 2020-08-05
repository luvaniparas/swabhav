"use strict";
createBalls();
var cnt = 0 ;
var blueBall = Math.floor(Math.random() * 51);

function createBalls(){
    var txt = " ";

    for(var i =1 ; i < 51 ; i++){
        txt = '<button type="button" onclick="countClicks(this.id)" class="balls" id =' + i + ">"+ i + '</button>';
        document.write(txt);
    }
}

function countClicks(clickedID){
    cnt +=1;
    play(cnt,clickedID);
}

function play(cnt,clickedID){
    var cID = parseInt(clickedID);  
    console.log("Blue Ball => "+blueBall);

    if(cnt < 5){
        if(blueBall === cID ){
            document.getElementById(clickedID).style.backgroundColor="#0000ff";
            document.getElementById("p1").innerHTML = "Chance => "+ cnt;
            document.getElementById("h1").innerHTML = "WON";
        }
        else if(blueBall > cID){           
            document.getElementById(clickedID).style.backgroundColor="#ff0000";
            document.getElementById("p1").innerHTML = "Chance => "+ cnt;
        }
        else if(blueBall < cID){
            document.getElementById(clickedID).style.backgroundColor="#009933";
            document.getElementById("p1").innerHTML = "Chance => "+ cnt;
        }
    }else{
        document.getElementById("p1").innerHTML = "BlueBall is => "+ blueBall;
        document.getElementById("h1").innerHTML = "Game Over ):";
    }   
}