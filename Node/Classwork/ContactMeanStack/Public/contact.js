var app = angular.module('contactApp', ['ngRoute','contactModule']);

    app.directive("fileModel", [
        "$parse",
        
        function ($parse) {
            return {
                restrict: "A",
                link: function (scope, element, attrs) {
                    var model = $parse(attrs.fileModel);
                    var modelSetter = model.assign;
                    element.bind("change", function () {
                            scope.$apply(function () {
                            modelSetter(scope, element[0].files[0]);
                        });
                    });
                },
            };
        },
    ]);

    app.config(['$routeProvider',function($routeProvider) {
        $routeProvider
    
        .when("/home", {
            templateUrl : "./home.html",
            controller : "contactApiController"
        })
        .when("/contactList", {
            templateUrl : "./contactList.html",
            controller : "contactApiController"
        })
        .when("/searchContact", {
            templateUrl : "./searchContact.html",
            controller : "contactApiController"
        })
        .when("/addForm", {
            templateUrl : "./addForm.html",
            controller : "contactApiController"
        })
        .when("/contactDetails", {
            templateUrl : "./contactDetails.html",
            controller : "contactApiController"
        })
        .when("/updateForm", {
            templateUrl : "./updateForm.html",
            controller : "contactApiController"
        })
        .when("/user/signUp", {
            templateUrl : "./signup.html",
            controller : "userApiController"
        })
        .when("/user/signIn", {
            templateUrl : "./signin.html",
            controller : "userApiController"
        })
        .otherwise({
            redirectTo: '/home'
        })
    }]);

    app.factory("userFactory",['$http','$scope',function($http,$scope) {
        var userFactoryObj = {};

        userFactoryObj.usersignIn = function(user){
            return $http.post('/user/signIn',user)
        }

        return userFactoryObj;
    }]);

    app.factory("contactFactory",['$http', function($http) {
        var contactFactoryObj = {};

        contactFactoryObj.getContact = function(){
             return $http.get('/contacts') 
        } 

        contactFactoryObj.searchContact = function(config){
            return $http.get('/contact', config)
        }

        contactFactoryObj.contactDetails = function(id){
            return $http.get('/contact/'+id)
        }

        contactFactoryObj.deleteContact = function(id,config){
            return $http.delete('/contact/'+id,config)
        }

        return contactFactoryObj;
    }]);

angular.module('contactModule',[])
.controller('contactApiController',['$rootScope','$scope','$http','$window','contactFactory',function($rootScope,$scope,$http,$window,contactFactory){
    
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
      
        contactFactory.getContact()
            .then(function(response) {
                $scope.contacts = response.data;
            },function(error){
                $scope.status = 'Unable to load Conatct data: ' + error.message;
            });
    
    }
    
    $scope.searchContact = function(){ 
        if($scope.searchContact != undefined){

            var config = {
                params: $scope.searchContactObj,
                headers : {'Accept' : 'application/json'}
            };
            
            contactFactory.searchContact(config)
                .then(function(response) {
                    $scope.gotContact = response.data[0];
                },function(error){
                    $scope.status = 'Unable to load Conatct data: ' + error.message;
                });

        }
    }

    $scope.contactDetails = function(id){
        contactFactory.contactDetails(id)
            .then(function(response) {
                $rootScope.contactById = response.data;
            },function(error){
                $scope.status = 'Unable to load Conatct data: ' + error.message;
            });
    }
    
    $scope.deleteContact = function(id) {

        let token = sessionStorage.getItem("token");
       
        var config = {
            headers: {
              'Authorization': 'Bearer '+token 
            }
          };

        if(token != null){
            
            if(confirm("Are you sure you want to delete contact ")){

                //$http.delete('/contact/'+id,config)
                contactFactory.deleteContact(id,config)
                    .then(function(response){
                        $window.location.href = '/index.html';
                    })
                
            }
        }else{
            console.log("no token");
            $window.location.href = '#/user/signIn';
        }
    }

    $scope.editContactDetails = function(contact){
        $rootScope.contactToEdit = contact ;  
    }   
    
    $scope.updateContact = function(){

        let token = sessionStorage.getItem("token");
       
        var config = {
            headers: {
              'Authorization': 'Bearer '+token 
            }
          };
        
          console.log("Token :"+token +" config : "+ config);

        if(token !=null){
            
            let contact = $scope.updatedContact;

            let form = new FormData();
            for (property in contact) {
                form.append(property, JSON.stringify(contact[property]));
            }
            form.append("file", contact.file);
            form.append("_id", $rootScope.contactToEdit._id);
    
            $http.post("/contact/update",form,config)
                .then(
                    function (response) {
                      console.log(response.data);
                      $scope.redirectToHome();
                    },
                    function (error) {
                      console.log(error);
                    }
                  );

        }else{
            console.log("no token");
            $window.location.href = '#/user/signIn'; 
        }
    }

    $scope.imgToString = function(imgSrc){
        return btoa(String.fromCharCode.apply(null, (new Uint8Array(imgSrc))));
    }

    $scope.redirectToHome = function(){
        $window.location.href = '#/index.html';
    }

}])

.controller('userApiController',['$scope','$window','$http',function($scope,$window,$http){
    
    $scope.userLogin = function(){
        
        $http.post('/user/signIn',$scope.user)
            .then(function (response){
                    sessionStorage.setItem("token",response.data.token);
                    $window.location.href = '#/index.html';
                },function(error){
                    $scope.status = 'Unable to load Conatct data: ' + error.message;
                })
        }

}])
