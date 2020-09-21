var startBall = 1 , endBall = 51 ,cnt = 0 ;
var blueBall = Math.floor(Math.random() * 51);

var app = angular.module("myapp",[]);
app.controller("cntrl",function($scope){    
    
    $scope.range = function() {
        var input = []; 
            for (var i = startBall; i < endBall; i += 1) { 
                input.push(i); 
            } 
        return input;
    }

    $scope.start = function(){
        console.log("Inside Start");
        $("#play").hide();
        $("#btnBalls").show();
        $("#bottom").show();
    }

    $scope.play = function(id){
        console.log(blueBall);        
        cID = id-2 ;
        cnt++ ;
        
        if(cnt < 5){
            if(blueBall == cID ){
                $("#"+cID).css("background-color","#0000ff");
                $("#p1").html("Chance => "+ cnt);
                $("#h1").html("Congratulations you won (:");
            }
            else if(blueBall > cID){         
                $("#"+cID).css("background-color","#ff0000");
                $("#p1").html("Chance => "+ cnt);
            }
            else if(blueBall < cID){
                $("#"+cID).css("background-color","#009933");
                $("#p1").html("Chance => "+ cnt);
            }
        }else{
            $("#"+blueBall).css("background-color","#0000ff");
            $("#h1").html("Sorry ,Try again !");
        }
       }

    $scope.reloadPage = function() {
        location.reload();
    }
});
   
