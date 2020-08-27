$(document).ready(function(){
    var i = 1 , COUNTRYINDEX = 0;

    $("#b1").on("click",createNode);
    function createNode(){ 
        var name = $("#t1").val();
        if(name == 0 ){
            $("#t1").css("borderColor","red");
            $("#s1").text("Task must be filled out");
            $("#s1").css("color","red");
        }else{ 
            rowId = "R"+(i++); 
            
            let url = `https://restcountries.eu/rest/v2/name/${name}?fullText=true`;
            fetch(url)
            .then(function(response) {
                return response.json();
            })
            .then(function(countryDetails) {

                $("#nList").append("<p id ="+rowId+">"+"</p>");
                $("<label>"+countryDetails[COUNTRYINDEX].name+"</label>").appendTo("#"+rowId);
                $("<br>").appendTo("#"+rowId);
                $("<label>"+countryDetails[COUNTRYINDEX].capital+"</label>").appendTo("#"+rowId);
                $("<br>").appendTo("#"+rowId);
                let countryFlag = countryDetails[COUNTRYINDEX].flag;
                $(`<p>Country Flag:</p><img width="15%" height="15%" src=${countryFlag}></img>`).appendTo("#"+rowId);
                $("<br>").appendTo("#"+rowId);

            })
            .catch(function(er) {
                console.log(er);
            });
        }
    }
});


 