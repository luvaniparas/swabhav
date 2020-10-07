var app = angular.module("myapp",[]);
app.controller("cntrl",function($scope,$http){
    $scope.country;
    $scope.countryArray = [];
    
    $scope.getUserData = function (){
        console.log("Inside getUserData : "+$scope.country);
        $scope.createNode();
    }

    //fetchData request
    $scope.createNode = function(){
        $http({
                method : "GET",
                url : 'https://restcountries.eu/rest/v2/name/'+$scope.country+'?fullText=true'
        }).then(function mySuccess(response) {
            var w =  JSON.stringify(response.data);
            console.log("http : "+w);
     
            $scope.countryInfoFormatter(response.data);
          
        },function myError(response) {
            var res = response.statusText;
            console.log("Eror : " + res);
        });
    }    

    
    $scope.countryInfoFormatter = function(countryInfo) {
      
        $scope.countryArray.push({
            'name': countryInfo[0].name,
            'capital': countryInfo[0].capital,
            'flag': countryInfo[0].flag,
        });

        var w =  JSON.stringify($scope.countryArray);
        console.log("countryArray : "+w);
    }
});

