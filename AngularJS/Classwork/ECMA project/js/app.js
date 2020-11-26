var app = angular.module("myapp",['ngRoute']);

app.config(function($routeProvider) {
    $routeProvider
    
    .when("/home", {
        templateUrl : "./home.html",
        controller : "cntrl"
    })
    .otherwise({
        redirectTo: '/home'
    })
  });

app.controller("cntrl",function($scope){
    $scope.btnValue = "Show Image";

    $scope.changeButton = function(){
        console.log("Button Clicked");
        if($scope.btnValue == "Show Image"){
            $scope.btnValue = "Hide Image";
            console.log("Button : "+$scope.btnValue);
        }else{
            $scope.btnValue = "Show Image";
            console.log("Button : "+$scope.btnValue);
        }
    }

});
