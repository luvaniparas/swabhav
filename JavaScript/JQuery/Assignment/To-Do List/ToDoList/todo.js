$(document).ready(function(){
    var i = 1 ;
    var task , selected = " ";

    //On Body Load
    $("body").on("load",loadData());
    function loadData(){
        var j , key , taskId ;
        var length = localStorage.length ;

        for(j= 1 ; j < length+1 ; j++){
            taskId = "T"+(i); 
            value = localStorage.getItem(taskId);
            createNode(value);
        }
    }
    
    //Add Button Onclick Event
    $("#addBtn").on("click",function(){
        task = $("#t1").val();
        createNode(task);
    });

    function createNode(task){ 
        if(task == 0 ){
            $("#t1").css("borderColor","red");
            $("#s1").text("Task must be filled out");
            $("#s1").css("color","red");
        }else{
            //localStorage 
            var taskId = "T"+(i++); 
            localStorage.setItem(taskId,task);  
                
            //list Element tag 
            $("#uList").append("<li id ="+taskId+">"+"</li>");

            //ChechBoc Label Element
            $("<label>"+task+"</label>").appendTo("#"+taskId);

            //Date label 
            $("<label>"+moment().startOf('hour').fromNow()+"</label>").appendTo("#"+taskId);
            
           //Priority radio Buttons
            $('#myForm input').on('change', function() {
                selected = $('input[name=priority]:checked', '#myForm').val(); 
            });
            //Priority
            $("<label id='radio'>"+selected+"</label>").appendTo("#"+taskId);
        
            //Remove Button 
            var rmid = "R"+(i);
            $("<input type='button' value = 'remove' id ='"+rmid+"'>").appendTo("#"+taskId);
            
            //Remove Button
            $("#"+rmid).on("click",function(){
                var c = confirm("Are you sure!");
                if(c == true){
                    $("#"+taskId).remove();
                    localStorage.removeItem(taskId);
                }
                });
            }
        }
});