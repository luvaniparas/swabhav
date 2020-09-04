$(document).ready(function(){

    var rollNumber,name,age,email,date,gender;

    $("#get").on("click",getRequest);
    $("#post").on("click",fetchFormData);

    function getRequest(){
    console.log("Get request");
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
        date = $("#date").val();
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
        });
}
});

function putRequest(id) {

    event.preventDefault();
    console.log("PutRequest "+id);
    
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
        dataType:"json",
    });

}

function deleteRequest(id) {

    console.log("Delete "+id);

    $("#Table").hide();

    $.ajax({
        type:"DELETE",
        url:"http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id,
        dataType:"json",
    });

}

function updateRequest(id){

    event.preventDefault();

    $("#form").show();

    $("#submit").on("click",function(){

        rollNumber = $("#rollNumber").val();
        name = $("#name").val();
        age = $("#age").val();
        email = $("#email").val();
        date = $("#date").val();
        gender = $("input[name='gender']:checked").val();

        putRequest(id);
    });
}