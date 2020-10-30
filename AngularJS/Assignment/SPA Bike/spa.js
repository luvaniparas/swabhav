var app = angular.module("myapp", ['ngRoute']);

app.config(function($routeProvider) {
    $routeProvider
    
    .when("/bike", {
        templateUrl : "./bike.html",
        controller : "bike"
    })
    .when("/bajaj", {
      templateUrl : "./bajaj.html",
      controller : "bajaj"
    })
    .when("/yamaha", {
      templateUrl : "./yamaha.html",
      controller : "yamaha"
    })
    .when("/Honda", {
      templateUrl : "./Honda.html",
      controller : "honda"
    })
    .otherwise({
      redirectTo: './bike.html'
    })
  });

app.controller("bike",function() {
    console.log("Inside bike controller");
});

app.controller("bajaj",function($scope) {
  $scope.name = "Bajaj"
  console.log("Inside Bajaj controller");
});

app.controller("yamaha",function($scope) {
  $scope.name = "yamaha"
  console.log("Inside Yamaha controller");
});

app.controller("honda",function($scope) {
  $scope.name = "Honda"
  console.log("Inside Honda controller");
});