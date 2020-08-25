var i = 1 ;
var task ;

function getTaskData(){
    task = document.getElementById("t1").value ;
    createNode(task);
}

function loadData(){
    var j , key , taskId ;
    var length = localStorage.length ;

    for(j= 1 ; j < length+1 ; j++){
        taskId = "T"+(i); 
        value = localStorage.getItem(taskId);
        createNode(value);
    }
}

function createNode(task){
    
    if(task == 0 ){
        document.getElementById("t1").style.borderColor = "red";
        document.getElementById("s1").innerHTML = "Task must be filled out";
        document.getElementById("s1").style.color = "red";
    }else{

    //localStorage 
    var taskId = "T"+(i++); 
    localStorage.setItem(taskId,task);    

    //list Element tag 
    var node = document.createElement("LI");
    node.setAttribute('id',taskId)

    //ChechBox Element
    var chk = document.createElement('input');  
    chk.setAttribute('type', 'checkbox'); 
    
    //ChechBoc Label Element
    var lbl = document.createElement('label');
    lbl.innerHTML = task;

    //Date label
    var date = document.createElement('label');
    date.innerHTML =  new Date() ;
    
    //Remove Button 
    var rm = document.createElement("input");
    rm.type = "button";
    rm.value = "Remove";

    //Add all task thing into one
    node.appendChild(chk);
    node.appendChild(lbl);
    node.appendChild(date);
    node.appendChild(rm);

    //add Node
    document.getElementById("uList").appendChild(node);
    
    //CheckBox EventListener
    chk.addEventListener( 'change', function() {
        if(chk.checked == true) {
            var nodeId = document.getElementById(node.id);
            node.parentNode.removeChild(nodeId);
        
            var list = document.getElementById("cList");
            list.appendChild(nodeId);
            localStorage.removeItem(taskId);
        }
    });

    rm.addEventListener("click",function(){
        var nodeId = document.getElementById(node.id);
        
        node.parentNode.removeChild(nodeId);
        localStorage.removeItem(taskId);
    });
}
}
