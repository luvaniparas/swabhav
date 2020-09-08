var name,id,age,gender; 

/*
$(document).ready(function(){

    $("#create").on("click",fetchData);

});
*/
function fetchData(){
    console.log("FetchData");

    $("#form").show();
    event.preventDefault();
    
    $("#submit").on("click",function(){
        console.log("inside Submit");
        
        name = $("#name").val();
        id = $("#Sid").val();
        age = $("#age").val();
        gender = $("#gender").val();

        addStudent();
    });   
}


function addStudent(){
    console.log("AddStudent");

        var student = '<tr id="'+id+'">'; 
        student += '<td>' + name + '</td>'; 
        student += '<td>' + id + '</td>';             
        student += '<td>' + age + '</td>';
        student += '<td>' + gender + '</td>';

        student += '<td>' + '<button onclick="updateRequest(this.id)" id="'+id+'">Update</button>' +'</td>';
        student += '<td>' + '<button onclick="deleteRequest(this.id)" id="'+id+'">Delete</button>' +'</td>';
        student += '</tr>'; 

        $("#Table").append(student);
}

function deleteRequest(id){
    $("#"+id).remove();
}

function updateRequest(id) {
    var table, tr, td, i, txtValue;
    
    table = document.getElementById("Table");
    tr = table.getElementsByTagName("tr");

    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[1];
        
        if (td) {
            txtValue = td.textContent || td.innerText;
            
            if (txtValue.toUpperCase().indexOf(id) > -1) {
                $("#"+id).remove();
                fetchData();
            } else {
                $("#notFound").html = "Data Not Found " ;
            }
        }
    }
}

