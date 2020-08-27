$(document).ready(function(){

    var i = 1 , COUNTRYINDEX = 0;

    createNode();
    function createNode(){ 
        rowId = "R"+(i++);     
        let url = `https://restcountries.eu/rest/v2/all`;
      
        $.ajax({
            method: 'get',
            url: url,
            dataType: "json",
            success: function(countryDetails) {
                for (var countries in countryDetails) {
                    if(countryDetails.hasOwnProperty(countries)) {
            
                        let countryFlag = countryDetails[countries].flag;
                        let countryName = countryDetails[countries].name;
                        let countryCapital = countryDetails[countries].capital;
                    
                        $('#t1').append(`<tr>
                            <td>${countryName}</td>  
                            <td>${countryCapital} </td> 
                            <td><img width="15%" height="15%" src=${countryFlag}></img></td>
                        </tr>`);
                    }
                }
            },
            error: function(er) {
                console.log(er);
            } 
        });
    }
});
   




 