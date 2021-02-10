var app = angular.module('contactApp', ['ngRoute']);

app.config(['$routeProvider',function($routeProvider) {
    $routeProvider

    .when("/home", {
        templateUrl : "./home.html",
        controller : "contactApiController"
    })
    .when("/login", {
        templateUrl : "./login.html",
        controller : "contactApiController"
    })
    .otherwise({
        redirectTo: '/home'
    })
}]);