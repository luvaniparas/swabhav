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
   // $scope. ;

});