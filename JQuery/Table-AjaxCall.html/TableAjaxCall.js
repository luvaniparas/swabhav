$(document).ready(function(){

    var rollNumber,name,age,email,date,gender;

    $("#get").on("click",getRequest);
    $("#post").on("click",postRequest);
    $("#submit").on("click",fetchFormData);

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

                student += '</tr>'; 
            });             
            $("#Table").append(student);
        }
    });
}

function postRequest(){
    
    $("#Table").hide();
    $("#form").show();
    var booleanGender = false ;
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
        });
    getRequest();
}

function fetchFormData(){
    
    rollNumber = $("#rollNumber").val();
    name = $("#name").val();
    age = $("#age").val();
    email = $("#email").val();
    date = $("#date").val();
    gender = $("input[name='gender']:checked").val();
    
    postRequest();
}
});
