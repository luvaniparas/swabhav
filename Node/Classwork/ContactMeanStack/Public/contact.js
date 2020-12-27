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
    .when("/searchContact", {
        templateUrl : "./searchContact.html",
        controller : "contactApiController"
    })
    .when("/addContactForm", {
        templateUrl : "./addContactForm.html",
        controller : "contactApiController"
    })
    .when("/contactDetails", {
        templateUrl : "./contactDetails.html",
        controller : "contactApiController"
    })
    .when("/editContactDetails", {
        templateUrl : "./editContactDetails.html",
        controller : "contactApiController"
    })
    .otherwise({
        redirectTo: '/home'
    })
  });

  contactApp.controller('contactApiController',function($rootScope,$scope,$http,$window){
    $scope.contacts =[];
    $scope.states =  [ "Andhra Pradesh",
    "Arunachal Pradesh",
    "Assam",
    "Bihar",
    "Chhattisgarh",
    "Goa",
    "Gujarat",
    "Haryana",
    "Himachal Pradesh",
    "Jammu and Kashmir",
    "Jharkhand",
    "Karnataka",
    "Kerala",
    "Madhya Pradesh",
    "Maharashtra",
    "Manipur",
    "Meghalaya",
    "Mizoram",
    "Nagaland",
    "Odisha",
    "Punjab",
    "Rajasthan",
    "Sikkim",
    "Tamil Nadu",
    "Telangana",
    "Tripura",
    "Uttarakhand",
    "Uttar Pradesh",
    "West Bengal",
    "Andaman and Nicobar Islands",
    "Chandigarh",
    "Dadra and Nagar Haveli",
    "Daman and Diu",
    "Delhi",
    "Lakshadweep",
    "Puducherry"]

    $scope.getContact = function(){
        $http.get('/contacts')
        .then(function(response) {
            $scope.contacts = response.data;
        },function(error){
            $scope.status = 'Unable to load Conatct data: ' + error.message;
        });
    }
    
    $scope.searchContact = function(){ 

        var config = {
            params: $scope.searchContactObj,
            headers : {'Accept' : 'application/json'}
        };
        
        $http.get('/contact', config)
        .then(function(response) {
            $scope.gotContact = JSON.stringify(response.data);
        },function(error){
            $scope.status = 'Unable to load Conatct data: ' + error.message;
        });
 
    }

    $scope.addContact = function(){
        
        $http.post('/contact', $scope.contact)
        .then(function (response) {
            alert("Conatct added successfully !");
            $window.location.href = '/index.html';
        },function (error) {
            $scope.status = 'Unable to load Add Conatct data: ' + error.message;
        });
    }

    $scope.contactDetails = function(id){
        $http.get('/contact/'+id)
        .then(function(response) {
            $rootScope.contactById = response.data;
        },function(error){
            $scope.status = 'Unable to load Conatct data: ' + error.message;
        });
    }

    $scope.redirectToHome = function(){
        $window.location.href = '/index.html';
    }

    $scope.deleteContact = function(id) {
        
        $http.delete('/contact/'+id)
            .then(function(response){
                if(confirm("Are you sure you want to delete contact ")) {
                    $window.location.href = '/index.html';
                }
            })
    }

    $scope.editContactDetails = function(c){
        $rootScope.contactToEdit = c ;
    }

    $scope.editContact = function(){
        
        $scope.putContact = {
            "name": ($scope.updatedContact.name == null ? $rootScope.contactToEdit.name : $scope.updatedContact.name),
            "number": ($scope.updatedContact.number == null ? $rootScope.contactToEdit.number : $scope.updatedContact.number),
            "pinCode": ($scope.updatedContact.pinCode == null ? $rootScope.contactToEdit.pinCode : $scope.updatedContact.pinCode),
            "address": ({
                "state": ($scope.updatedContact.state == null ? $rootScope.contactToEdit.address.state : $scope.updatedContact.state),
                "city": ($scope.updatedContact.city == null ? $rootScope.contactToEdit.address.city : $scope.updatedContact.city),
                "roomNumber": ($scope.updatedContact.roomNumber == null ? $rootScope.contactToEdit.address.roomNumber : $scope.updatedContact.roomNumber),
                "buildingName": ($scope.updatedContact.buildingName == null ? $rootScope.contactToEdit.address.buildingName : $scope.updatedContact.buildingName),
                "street": ($scope.updatedContact.street == null ? $rootScope.contactToEdit.address.street : $scope.updatedContact.street)
            })
        }

        console.log("Contact Edit : "+JSON.stringify($rootScope.contactToEdit));
        console.log("Updated Contact : "+JSON.stringify($scope.updatedContact));
        console.log("Put Contact : "+JSON.stringify($scope.putContact));
        
        var id = $rootScope.contactToEdit._id ;

        // var data = {
        //     id : $rootScope.contactToEdit._id,
        //     obj : $scope.putContact,
        //     headers : {'Accept' : 'application/json'}
        // };
        // console.log("data : "+JSON.stringify(data));

        $http.put('/contact/'+id)
          .then(function (response) {
                alert("Successfully ! Contact Updated");
            }, function(error){
                $scope.status = 'Unable to update Conatct ' + error.message;
            });

    }   

  });   