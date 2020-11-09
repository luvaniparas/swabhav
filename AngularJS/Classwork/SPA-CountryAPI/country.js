var countriesApp = angular.module('countryApiApp', ['ngRoute']);

countriesApp.config(function($routeProvider) {
    $routeProvider
    
    .when("/home", {
        templateUrl : "./home.html",
        controller : "countryApiController"
    })
    .when("/country", {
      templateUrl : "./country.html",
      controller : "countryApiController"
    })
    .otherwise({
        redirectTo: '/home'
    })
  });

countriesApp.controller('countryApiController', function($scope, $http) {

    $scope.countries =[];
        console.log("Inside fetchData");
        
        $http({
            method: 'get',
            url: 'https://restcountries.eu/rest/v2/all',
        }).then(function(response) {
            $scope.countryInfoFormatter(response.data);
        });

    
    $scope.countryInfoFormatter = function(countryInfo) {
        for (let i = 0; i < countryInfo.length; i++) {
            $scope.countries.push({
            'name': countryInfo[i].name,
            'capital':countryInfo[i].capital,
            'flag': countryInfo[i].flag,
            });
        }
    }

});