var app = angular.module("myapp",[]);

app.controller("cntrl",['$scope','$filter',function($scope,$filter){
    $scope.tasks = [] ;
    $scope.today = $filter('date')(new Date(),'MMM d, y h:mm:ss a');

    //LocalStorage
    var taskData = localStorage['tasksList'];

    $scope.addIntoLocalStorgae = function(){
        if(taskData !== undefined){
            $scope.tasks = JSON.parse(taskData);
        }
    }

    $scope.addTask = function() {
        //If null task
        if($scope.taskTx == "" || $scope.taskTx == undefined ){
            console.log("Empty");
        }else{
            $scope.tasks.push({'taskMessage' : $scope.taskTx,'status' : false});

            localStorage['taskList'] = JSON.stringify($scope.tasks);
        }
    }

    $scope.remove = function(index){
        console.log("Inside remove");
        $scope.tasks.splice(index,1);   
    }

    $scope.update = function(event){
        event.target.contentEditable = event.target.contentEditable == "false" ? "true" : "false" ;
    }
}]);