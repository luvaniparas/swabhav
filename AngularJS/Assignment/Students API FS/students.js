var app = angular.module("myapp",[]);

//Post Factory
app.factory("postStudentData", function($http){ 
    var student = {};
    addForm = false;
 
    student.postStudent = function(studentRollNumber,studentName,studentAge,studentEmail,studentDate,studentGender){
        if(studentRollNumber != undefined){
            $http({
                method : "post",
                url : 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students',
                data : {
                    rollNo: studentRollNumber,
                    name: studentName,
                    age: studentAge,
                    email: studentEmail,
                    date: studentDate,
                    gender: studentGender
                }
            }).then(function mySuccess(response) {
                alert("Student added successfully !");
                location.reload();
            },function myError(response) {
                var res = response.statusText;
                console.log("Eror : " + res);
            });
        }
        }
    return student;
});

//Delete Factory
app.factory('deleteStudentData', function($http) {
    var deleteInfo = {};

    deleteInfo.deleteDetails = function(studentId) {
        console.log('deleting');
        $http({
            method:'delete',
            url:  'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/' + studentId,
        }).then(function() {
            alert("Student data successfully deleted");
            location.reload();
        });
    }
    return deleteInfo;
});

//update factory
app.factory('updateStudentData', function($http) {
    var updateInfo = {};

    updateInfo.updateDetails = function(uStudent,studentId) {
        $http({
            method: 'put',
            url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/' + studentId,
            data: uStudent,
        }).then(function() {
            alert('Data successfully updated');
            location.reload();
        });
    }
    return updateInfo;
});

app.controller("cntrl",function($rootScope,$scope,$http,postStudentData,deleteStudentData,updateStudentData){
    $scope.students = [];
    $scope.addForm = false;
    $scope.updateForm = false;
    $rootScope.uStudent = {};

     //Store Data in array
     $scope.studentDetails = function(data){
        for(var i = 0; i < data.length; i++) 
            {
                $scope.students.push({
                    'id': data[i].id,
                    'rollno': data[i].rollNo,
                    'name': data[i].name,
                    'age': data[i].age,
                    'email': data[i].email,
                    'date': data[i].date,
                    'gender': (data[i].isMale?"Male":"Female"), 
                });
            }
    }

    //get Student
    $scope.getStudentsData = function() {
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

    //add new student 
    $scope.addStudent = function(){
        $scope.addForm = true ;
        
        $scope.newStudentDetails = postStudentData.postStudent(
            $scope.rollNo, $scope.name, $scope.age, $scope.email, $scope.date, $scope.gender
        );
    }

    //delete student
    $scope.deleteData = function(studentId){
        if(confirm("Are you sure you want to delete student data ")) {
            deleteStudentData.deleteDetails(studentId);
        }
    }

    //get details to update student
    $scope.updateData = function(studentId){
        console.log("Updated student : "+studentId);
        $scope.updateForm = true;
        $rootScope.updateStudentId = studentId; 

        $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+studentId)
        .then(function(response) {
            $scope.namePlaceholder = response.data[0].name;
            $scope.rollNoPlaceholder = response.data[0].rollNo;
            $scope.agePlaceholder = response.data[0].age;
            $scope.emailPlaceholder = response.data[0].email;
            $scope.datePlaceholder = response.data[0].date;
            $scope.updatedGender = response.data[0].isMale?"Male":"Female";
        });
    }

    //update Student 
    $scope.updateStudent = function(){

        $rootScope.uStudent = {
            "name": ($scope.updatedName == null ? $scope.namePlaceholder : $scope.updatedName),
            "rollNo" : ($scope.updatedRollNo == null ? $scope.rollNoPlaceholder : $scope.updatedRollNo),
            "age": ($scope.updatedAge == null ? $scope.agePlaceholder : $scope.updatedAge),
            "email": ($scope.updatedEmail == null ? $scope.emailPlaceholder : $scope.updatedEmail),
            "date": ($scope.updatedDate == null ? $scope.datePlaceholder : $scope.updatedDate),
            "isMale": ($scope.updatedGender === "Male" ? "Male" : "Female"),
        }
        console.log("uStudent : "+JSON.stringify($rootScope.uStudent));

        updateStudentData.updateDetails($rootScope.uStudent,$rootScope.updateStudentId);
    }
});

