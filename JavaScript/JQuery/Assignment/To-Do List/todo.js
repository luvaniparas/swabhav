$(document).ready(function(){
    var  i = 1 ,taskId;
    var task ;

    //On Body Load
    $("body").on("load",loadData());
    function loadData(){
        var  key ;

        for (key in window.localStorage){
            if(window.localStorage.hasOwnProperty(key)){
                let time =  localStorage.getItem(key);
                key = key.split(',');
                createNode(key,time);
            }           
        }
    }

    //Add Button Onclick Event
    $("#addBtn").on("click",function(){
        const time = moment().format('MM D YYYY hh:mm:ss');
        task = $("#t1").val();
        localStorage.setItem(task,time); 
        createNode(task,time);
    });

    //Priority radio Buttons
    $('#myForm input').on('change', function() {
        selected = $('input[name=priority]:checked', '#myForm').val(); 
    });

    function createNode(task,time){ 
        if(task == 0 ){
            $("#t1").css("borderColor","red");
            $("#s1").text("Task must be filled out");
            $("#s1").css("color","red");
        }else{
            //localStorage 
            taskId = "T"+(i++); 
            let timeDifference = calculateTimeDifference(time);
            let key = task ;
            //list Element tag 
            $("#uList").append("<li class="+task+" id ="+taskId+">"+"</li>");

            //ChechBoc Label Element
            $("<label>"+task+"</label>").appendTo("#"+taskId);

            //Date label 
            $("<label>"+timeDifference+"</label>").appendTo("#"+taskId);
        
            //Remove Button 
            var rmid = taskId;
            //console.log('<input type="button" value="remove" onclick="removeTask(this.id,'+t+')" id='+rmid+' class='+task+'>');
            $('<input type="button" value="remove" onclick="removeTask(this.id,'+key+')" id='+rmid+' class='+task+'>').appendTo("#"+taskId);
        }
    }    

    function calculateTimeDifference(time) {
        let taskAddedTime = moment(time);
        let currentTime = moment(moment().format('MM D YYYY hh:mm:ss '));
        let compare = moment.duration(taskAddedTime.diff(currentTime));
        return compare.humanize(true);
    }
    
      //Remove Button
      removeTask = function(clickedId){
        console.log("Inside Remove");
        var c = confirm("Are you sure!");
        if(c == true){
            $("#"+clickedId).remove();
            localStorage.removeItem(task);
        }
    }

    /*  
        //Priority
            $("<label id='radio'>"+taskinfo[1]+"</label>").appendTo("#"+taskId);
    */   
});