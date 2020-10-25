var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope,$http) {
    
    $scope.students = [];
    $scope.form = false ;

    //fetchData request
    $scope.getData = function(){
        $http({
            method : "GET",
            url : 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students'
        }).then(function mySuccess(response) {
            console.log("Inside get Data");
            $scope.studentDetails(response.data);          
        },function myError(response) {
            var res = response.statusText;
            console.log("Eror : " + res);
        });
    }

    //addData request 
    $scope.addData = function(){
        $scope.form = true;
        $http({
            method : "post",
            url : 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students',
            data : {
                rollNo: $scope.rollNumber,
                name: $scope.name,
                age: $scope.age,
                email: $scope.email,
                date: $scope.date,
                gender: $scope.gender
            }
        }).then(function mySuccess(response) {
            console.log("Inside post Data");
            $scope.studentDetails(response.data);          
        },function myError(response) {
            var res = response.statusText;
            console.log("Eror : " + res);
        });
    }

    //Update student Info
    $scope.updateData = function(studentId){

        console.log("Inside UpdateData data "+studentId);

        $scope.form = true;

        if(confirm("Are you sure you want to update student details")) {
            $http({
                method: 'get',
                url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/' + studentId,
            }).then(function(response) {
                $scope.updateStudentFormFields(response);


            });
        }
    }

    $scope.updateStudentFormFields = function(response) {

        console.log(response.data[0]);
         
        $scope.name = response.data[0].name;
        $scope.rollNumber = response.data[0].rollNo;
        $scope.age = response.data[0].age;
        $scope.email = response.data[0].email;
        $scope.date = response.data[0].date;
        $scope.gender = (response.data[0].isMale?"Female":"Male");

        $scope.updateHttpRequest(response.data[0].id);
    }

    //Update student info
    $scope.updateHttpRequest = function(studentId){

        var students = {
            'name': $scope.name,
            'rollNo': $scope.rollNumber,
            'age': $scope.age,
            'email': $scope.email ,
            'date': $scope.date,
            'isMale': $scope.gender 
        };

        $http({
            method: 'put',
            url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/' + studentId,
            data: students,
        }).then(function(response) {
            alert('Data successfully updated');
        });
    }

    //delete student info
     $scope.deleteData = function(studentId) {

        console.log("Inside delete Data");
        if(confirm("Are you sure you want to delete data")) {
            $http({
                method:'delete',
                url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/' + studentId,
            });
            alert("Student data successfully deleted");
        }
    }

    $scope.studentDetails = function(data) {
        for(var i = 0; i < data.length; i++) 
            {
                $scope.students.push({
                    'id': data[i].id,
                    'rollno': data[i].rollNo,
                    'name': data[i].name,
                    'age': data[i].age,
                    'email': data[i].email,
                    'date': data[i].date,
                    'gender': (data[i].isMale?"Female":"Male"), 
                });
            }
        }
    
});





 

