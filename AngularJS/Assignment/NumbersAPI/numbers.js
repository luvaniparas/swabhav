    var app = angular.module("myapp",[]);
    app.controller("cntrl",function($scope,$http){
        $scope.number ;
        $scope.numbersTrivia = [];
        
        //On Body Load
        $scope.load = function(){
            var  key ;
            for (key in window.localStorage){
                if(window.localStorage.hasOwnProperty(key)){
                    let time =  localStorage.getItem(key);
                    key = key.split(',');
                    $scope.createNode(key,time);
                }           
            }
        }
       
        //TimeDifference
        $scope.calculateTimeDifference = function(time){
            let taskAddedTime = moment(time);
            let currentTime = moment(moment().format('MM D YYYY hh:mm:ss'));
            let compare = moment.duration(taskAddedTime.diff(currentTime));
            return compare.humanize(true);
        }

        //localStorage
        $scope.getUserData = function(){
            var time = moment().format('MM D YYYY hh:mm:ss');
            var number = parseInt($scope.number);
            
            localStorage.setItem(number,time); 
            $scope.createNode(number,time);
        }

        //fetchData request
        $scope.createNode = function(number,time){
            $http({
                    method : "GET",
                    url : 'http://numbersapi.com/'+number+'/trivia'
            }).then(function mySuccess(response) {

                $scope.numbersTrivia.push({
                    'number': number,
                    'trivia': response.data,
                    'MomentTime': $scope.calculateTimeDifference(time),
                });
              },function myError(response) {
                var res = response.statusText;
                console.log("Eror : " + res);
            });
        }    
    });

