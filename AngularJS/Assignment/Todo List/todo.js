var app = angular.module("myapp",[]);

app.controller("cntrl",function($scope,$filter){
    $scope.tasks = [] ;
    $scope.today = $filter('date')(new Date(),'MMM d, y h:mm:ss a');

    //LocalStorage
    var taskData = localStorage['tasksList'];

    $scope.addIntoLocalStorgae = function(){
        if(taskData !== undefined){
            $scope.tasks = JSON.parse(taskData);
        }
    }

    $scope.addTask = function(){
        //If null task 
        if($scope.taskTx == "" || $scope.taskTx == undefined ){
            console.log("Empty");
        }else{
            $scope.tasks.push({'taskMessage' : $scope.taskTx,'status' : false});

            localStorage['taskList'] = JSON.stringify($scope.tasks);
        } 
        
    $scope.remove = function(index){
        console.log("Inside remove");
        $scope.tasks.splice(index,1);
    }
    
    $scope.update = function(){
        console.log("Insdie Update");
        contenteditable="true" ; 


    }
    /*
    <th>Update</th>
    <td><button ng-click="update($index.t.taskMessage)"> Update </button></td>
    $scope.update = function(task){
        console.log("Inside Update : "+task);
        
        $scope.updateTask = task;

        $('.mainForm').append(
            "<span class='update-item'>" +
            "<input type='text' class='update-input'/>" +
            "<button class='update-btn'>Update</button>" +
            "</span>"
        );
        $('.update-input').val(task);
    }
    */    
    };   
});

