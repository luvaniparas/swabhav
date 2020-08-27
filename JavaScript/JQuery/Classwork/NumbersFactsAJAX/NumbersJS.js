$(document).ready(function(){
    var i = 1;
    var number ;
    
    //On Body Load
    $("body").on("load",loadData());
    function loadData(){
        var  key ;
        for (key in window.localStorage){
            if(window.localStorage.hasOwnProperty(key)){
                console.log("LocalStorage : "+key);
                  let time =  localStorage.getItem(key);
                  key = key.split(',');
                  createNode(key,time);
            }           
        }
    }

    //LocalStorage
    $("#b1").on("click",function(){
        const time = moment().format('MM D YYYY hh:mm:ss');
        number = $("#t1").val();
        localStorage.setItem(number,time); 
        createNode(number,time);
    });

    //Dynamic Creation
    function createNode(number,time){ 
        if(number == 0 ){
            $("#t1").css("borderColor","red");
            $("#s1").text("Task must be filled out");
            $("#s1").css("color","red");
        }else{
            //localStorage 
            rowId = "R"+(i++); 
            let timeDifference = calculateTimeDifference(time);

            //Dynamic Creation
            $.ajax({
                type:"GET",
                url:"http://numbersapi.com/"+(number),
                dataType:"text",
                success: function (data){
                    $("#nList").append("<p id ="+rowId+">"+"</p>");
                    $("<label>"+data+"</label>").appendTo("#"+rowId);
                    $("<label id='td'>"+timeDifference+"</label>").appendTo("#"+rowId);    
                    $("<br>").appendTo("#"+rowId);
                }
            })
        }
    } 
    
    //TimeDifference
    function calculateTimeDifference(time) {
        let taskAddedTime = moment(time);
        let currentTime = moment(moment().format('MM D YYYY hh:mm:ss'));
        let compare = moment.duration(taskAddedTime.diff(currentTime));
        return compare.humanize(true);
    }
});
    
