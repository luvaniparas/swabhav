var cnt = 0 ;
var blueBall = Math.floor(Math.random() * 51)+1;
console.log("BlueBall : "+blueBall);

$(document).ready(function(){
createBalls();

function createBalls(){

    for(var i =1 ; i < 51 ; i++){
        var txt = '<button type="button" onclick="countClicks(this.id)" class="balls" id =' + i + ">"+ i + '</button>';
        $('#buttonsDiv').append(txt);
    }
}

});

function countClicks(clickedID){
    cnt +=1;
    play(cnt,clickedID);
}

function reload(){
    location.reload();
}

function play(cnt,clickedID){
    var cID = parseInt(clickedID);  

    if(cnt < 5){
        if(blueBall === cID ){
            $("#"+clickedID).css("background-color","#0000ff");
            $("#p1").html("Chance => "+ cnt);
            $("#h1").html("Congratulations you won (:");

        }
        else if(blueBall > cID){     
            
            $("#"+clickedID).css("background-color","#ff0000");
            $("#p1").html("Chance => "+ cnt);
            
        }
        else if(blueBall < cID){

            $("#"+clickedID).css("background-color","#009933");
            $("#p1").html("Chance => "+ cnt);

        }
    }else{
        $("#"+blueBall).css("background-color","#0000ff");
        $("#h1").html("Sorry ,Try again !");

        var btn ='<button onclick="reload()" id="restart">Restart</button>';
        $("body").append(btn);
    }   
}
