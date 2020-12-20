var contactApp = angular.module('contactApp', ['ngRoute']);

contactApp.config(function($routeProvider) {
    $routeProvider
    
    .when("/home", {
        templateUrl : "./home.html",
        controller : "contactApiController"
    })
    .when("/getContactInfo", {
        templateUrl : "./getContactInfo.html",
        controller : "contactApiController"
    })
    .when("/getContactById", {
        templateUrl : "./getContactById.html",
        controller : "contactApiController"
    })
    .when("/addContactForm", {
        templateUrl : "./addContactForm.html",
        controller : "contactApiController"
    })
    .otherwise({
        redirectTo: '/home'
    })
  });

  contactApp.controller('contactApiController',function($scope,$http){
    console.log("Hello from Controller");
    $scope.contacts =[];

    $scope.getContact = function(){

        console.log("Inside getContact() : ");

        $http.get('/contact')
        .then(function(response) {
            $scope.contacts = response.data;
            console.log("Contact : "+$scope.contacts);
        },function(error){
            $scope.status = 'Unable to load Conatct data: ' + error.message;
        });
    }

    $scope.getContactById = function(){
        console.log("Inside getContactById() : ");
        console.log("Id : "+$scope.id);

        $http.get('/contact'+'/'+$scope.id)
        .then(function(response) {
            console.log("http request response : "+response);
            $scope.contactById = response.data;
        },function(error){
            $scope.status = 'Unable to load Conatct data: ' + error.message;
        });

    }

    $scope.addContact = function(){
        console.log("InsideaddContact() : ");
        console.log("name : "+$scope.name+" Number : "+$scope.number);

        let data = { 
            name: $scope.name,
            id: $scope.number
        };

        $http.post('/contact', data)
        .then(function (response) {
            console.log(response);
            alert("Conatct added successfully !");
            location.reload();
        },function (error) {
            $scope.status = 'Unable to load Add Conatct data: ' + error.message;
        });

    }

  });   

  
