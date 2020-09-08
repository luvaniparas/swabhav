$(document).ready(function(){

    $("#my_date_picker").datepicker({ dateFormat: "dd-m-yy" });  

    var rollNumber,name,age,email,gender;
    var date ;
    $("#get").on("click",getRequest);
    $("#post").on("click",fetchFormData);

    function getRequest(){
    $("#Table").show();

    $.ajax({
        type:"GET",
        url:"http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",
        dataType:"json",
        success: function (data){            
            var student = ''; 
        
            $.each(data, function (key, value) { 
     
                student += '<tr>'; 
                student += '<td>' + value.id + '</td>'; 
    
                student += '<td>' + value.rollNo + '</td>'; 
    
                student += '<td>' + value.name + '</td>'; 
    
                student += '<td>' + value.age + '</td>';
    
                student += '<td>' + value.email + '</td>'; 
                
                student += '<td>' + value.date + '</td>';

                student += '<td>' + value.isMale + '</td>';

                student += '<td>' + '<button onclick="updateRequest(this.id)" id="'+value.id+'">Update</button>' +'</td>';

                student += '<td>' + '<button onclick="deleteRequest(this.id)"  id="'+value.id+'" >Delete</button>' +'</td>';

                student += '</tr>'; 
            });             
            $("#Table").append(student);
        }
    });
}

function fetchFormData(){

    console.log("FetchData");
    event.preventDefault();

    $("#form").show();

    $("#submit").on("click",function(){

        rollNumber = $("#rollNumber").val();
        name = $("#name").val();
        age = $("#age").val();
        email = $("#email").val();
        date = $("#my_date_picker").val();
        gender = $("input[name='gender']:checked").val();

        postRequest();
    });
}

function postRequest(){
    
    console.log("PostRequest");

    let booleanGender = false ;
    if(gender == "male"){
        booleanGender = true ;
    }else{
        booleanGender = false ;
    }

    $.ajax({
        type:"POST",
        url:"http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",
        data: { 
            "rollNo": rollNumber ,
            "name": name,
            "age": age,
            "email": email,
            "date": date,
            "isMale": booleanGender 
            },
        dataType:"json",
        success: function(){
            alert("User Created");
        }
        });
}
});

function putRequest(id) {
    event.preventDefault();
    
    $("#form").show();
    
    let booleanGender = false ;
    if(gender == "male"){
        booleanGender = true ;
    }else{
        booleanGender = false ;
    }

    $.ajax({
        type:"PUT",
        url:"http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id,
        data: { 
            "rollNo": rollNumber ,
            "name": name,
            "age": age,
            "email": email,
            "date": date,
            "isMale": booleanGender 
            },
        success: function(){
            alert("User Updated");
            setTimeout(function(){
                
                location.reload();
                getRequest();
            
            },2000);
        }
    });
}

function deleteRequest(id) {
    $("#Table").hide();

    $.ajax({
        type:"DELETE",
        url:"http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id,
        success: function(){
            alert("User Deleted");
            alert("User Updated");
            setTimeout(function(){

                location.reload();
                getRequest();
            
            },2000);
        }
    });

}

function updateRequest(id){
    event.preventDefault();
    $("#form").show();

    $.ajax({
        type:"GET",
        url:"http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id,
        dataType:"json",
        success : function(studentsDetails){

            for (let i = 0; i < studentsDetails.length; i++) {

                $('#rollNumber').val(studentsDetails[i].rollNo);
                $('#name').val(studentsDetails[i].name);
                $('#age').val(studentsDetails[i].age);
                $('#email').val(studentsDetails[i].email);
                $('#my_date_picker').val(studentsDetails[i].date);
                
                if(studentsDetails[i].isMale){
                    $("#male").prop("checked", true);
                }else{
                    $("#female").prop("checked", true);
                }
            }
        } 
});    

    $("#submit").on("click",function(){

        rollNumber = $("#rollNumber").val();
        name = $("#name").val();
        age = $("#age").val();
        email = $("#email").val();
        date = $("#my_date_picker").val();
        gender = $("input[name='gender']:checked").val();

        putRequest(id);
    });
}