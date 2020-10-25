var app = angular.module("myapp", ['ngRoute']);

app.config(function($routeProvider) {
    $routeProvider
    
    .when("/bike", {
        templateUrl : "./bike.html",
        controller : "cntrl"
    })
    .when("/bajaj", {
      templateUrl : "./bajaj.html",
      controller : "cntrl"
    })
    .when("/yamaha", {
      templateUrl : "./yamaha.html",
      controller : "cntrl"
    })
    .when("/Honda", {
      templateUrl : "./Honda.html",
      controller : "cntrl"
    })
    .otherwise({
      redirectTo: './bike.html'
    })
  });

app.controller("cntrl",function($scope,$location) {
    console.log($location.path());
});