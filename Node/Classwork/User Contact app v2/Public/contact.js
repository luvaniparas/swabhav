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
        
        contactFactoryObj.addContact = function(form,config){
            return $http.post("/contact",form,config)
        }
        
        contactFactoryObj.getContact = function(config){
             return $http.get('/contacts',config) 
        } 

        contactFactoryObj.searchContact = function(config){
            return $http.get('/contact', config)
        }

        contactFactoryObj.contactDetail = function(id){
            return $http.get('/contact/'+id)
        }

        contactFactoryObj.deleteContact = function(id,config){
            return $http.delete('/contact/'+id,config)
        }

        return contactFactoryObj;
    }]);

angular.module('contactModule',[])
.controller('contactApiController',['$rootScope','$scope','$http','$window','contactFactory',function($rootScope,$scope,$http,$window,contactFactory){
    $scope.today = new Date();
    $scope.contact = {};
    $scope.contact.address = [] ;
    $scope.allContacts = [];

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

    $scope.addContact = function(){
        let token = sessionStorage.getItem("token");
        let id = { contactListId : sessionStorage.getItem("contactListId") };

        var config = {
            params: id,
            headers: {
                "Content-Type": undefined , 
                'Authorization': 'Bearer '+token
            },
           transformRequest: angular.identity,    
          };
        
        if(token !=null){
            let contact = $scope.contact;
            let form = new FormData();

            for (property in contact) {
                form.append(property, JSON.stringify(contact[property]));
            }
            form.append("file", contact.file);
            
            contactFactory.addContact(form,config)
                .then(
                    function (response) {
                        alert("Contact Added successfully");
                        setTimeout(function(){   
                            $scope.redirectToHome();       
                        }, 1000);  
                    },
                    function (error) {
                      console.log(error);
                    }
                  );

        }else{
            $window.location.href = '#/user/signIn'; 
        }
    }

    $scope.addMoreAddress = function(){
        let blankAddress = "";
        if ($scope.contact.address){
            let addressArray = $scope.contact.address;
            addressArray.push(blankAddress);
          }else {
            $scope.contact.address = blankAddress;
          }
    }

    $scope.removeAddress = function(index){
        $scope.contact.address.splice(index,1);
    }

    $scope.getContact = function(){
        
        let id = { contactListId : sessionStorage.getItem("contactListId") };

        var config = {
            params: id,
            headers : {'Accept' : 'application/json'}
        };

        contactFactory.getContact(config)
            .then(function(response) {
                $scope.allContacts = response.data[0].contactList;
            },function(error){
                $scope.status = 'Unable to load Conatct data: ' + error.message;
            });
    
    }
    
    $scope.searchContact = function(){ 
        if($scope.searchContact != undefined){

            let id = sessionStorage.getItem("contactListId") ;
            let searchContactObj = $scope.searchContactObj ;
            let seachContactWithId = { contactListId : id , searchContactObj};
            
            var config = {
                params: seachContactWithId,
                headers : {'Accept' : 'application/json'}
            };
            
            contactFactory.searchContact(config)
                .then(function(response) {
                    $scope.gotContact = response.data[0].contactList;
                    console.log("$scope.gotContact : "+JSON.stringify($scope.gotContact));
                },function(error){
                    $scope.status = 'Unable to load Conatct data: ' + error.message;
                });

        }
    }

    $scope.contactDetails = function(contact){
        $rootScope.displayContact = contact ; 
    }
    
    $scope.deleteContact = function(id) {

        let token = sessionStorage.getItem("token");
        let contactListId = { id : sessionStorage.getItem("contactListId") };

        var config = {
            params: contactListId,
            headers: {
              'Authorization': 'Bearer '+token 
            }
          };

        if(token != null){
            
            if(confirm("Are you sure you want to delete contact ")){

                contactFactory.deleteContact(id,config)
                    .then(function(response){
                        $window.location.reload();
                    })
                
            }
        }else{
            $window.location.href = '#/user/signIn';
        }
    }
    
    $scope.editContactDetail = function(contact){
        $rootScope.contactToEdit = contact ; 
    }   
    
    $scope.updateContact = function(){

        let token = sessionStorage.getItem("token");
        let id = {  contactListId : sessionStorage.getItem("contactListId"), 
                    contactId : $rootScope.contactToEdit._id
                    }
       
        var config = {
            params: id,
            headers: {
              "Content-Type": undefined , 
              'Authorization': 'Bearer '+token 
            },
           transformRequest: angular.identity,    
          };
        
        if(token !=null){

            let contact =  $scope.updatedContact;            
            let form = new FormData();
            
            for (property in contact) {
                form.append(property, JSON.stringify(contact[property]));
            }
            form.append("file", contact.file);
            
            $http.post("/contact/update",form,config)
                .then(
                    function (response) {
                      $scope.redirectToHome();
                    },
                    function (error) {
                      console.log(error);
                    }
                  );

        }else{
            $window.location.href = '#/user/signIn'; 
        }
    }

    $scope.imgToString = function(image){
        return btoa(String.fromCharCode.apply(null, (new Uint8Array(image))));
    }

    $scope.redirectToHome = function(){
        $window.location.href = '#/index.html';
    }

}])

.controller('userApiController',['$scope','$rootScope','$window','$http',function($scope,$rootScope,$window,$http){
    
    $rootScope.signinButton =  false;
    $rootScope.signupButton = false ;

    $scope.userLogin = function(){
        
        $http.post('/user/signIn',$scope.user)
            .then(function (response){
                $rootScope.signinButton =  true;
                $rootScope.signupButton = true ;
                $rootScope.loggedinUserEmail = response.data.loggedinUserEmail;
                sessionStorage.setItem("contactListId",response.data.contactListId);
                sessionStorage.setItem("token",response.data.token);
                $window.location.href = '#/index.html';
            },function(error){
                $scope.status = 'Unable to load Conatct data: ' + error.message;
            })
    }

    $scope.userSignup = function(){
       
        $http.post('/user/signUp',$scope.user)
            .then(function (response){     
                sessionStorage.setItem("contactListId",response.data);
                alert("User created Successfully ! ");
                $window.location.href = '#/index.html';
            },function(error){
                $scope.status = 'Unable to load Conatct data: ' + error.message;
            })
    }
}])
