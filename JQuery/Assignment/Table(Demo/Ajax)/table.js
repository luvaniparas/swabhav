$(document).ready(function () { 
    // FETCHING DATA FROM JSON FILE 
    $.getJSON("http://localhost:3000/Students",function (data) { 
        var student = ''; 

        // ITERATING THROUGH OBJECTS 
        $.each(data, function (key, value) { 

            student += '<tr>'; 
            student += '<td>' + value.name + '</td>'; 

            student += '<td>' + value.id + '</td>'; 

            student += '<td>' + value.age + '</td>'; 

            student += '<td>' + value.gender + '</td>';

            student += '<td>' + value.address + '</td>'; 

            student += '</tr>'; 
        }); 
          
        //INSERTING ROWS INTO TABLE  
        $('#table').append(student); 
    }); 
}); 