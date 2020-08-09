var currentQuestion = 0 ;
var correct = 0 , incorrect = 0 ,leaved = 0;
var totalQuestions = questions.length;

console.log("totalQuestions : "+totalQuestions);

var container = document.getElementById("container");
var questionElement = document.getElementById("p1");
var option1 = document.getElementById("o1");
var option2 = document.getElementById("o2");
var option3 = document.getElementById("o3");
var option4 = document.getElementById("o4");
var nextButton = document.getElementById("nbtn");
var previousButton = document.getElementById("pbtn");
var description = document.getElementById("desc");

loadQuestions(currentQuestion);

function loadQuestions(qIndex){
    questionElement.textContent = questions[qIndex].qu  ;
    option1.textContent = questions[qIndex].o1 ;
    option2.textContent = questions[qIndex].o2;
    option3.textContent = questions[qIndex].o3 ;
    option4.textContent = questions[qIndex].o4 ;
}

function getOption(){
    var ops = document.getElementsByName("option");
    for(var i = 0 ; i <ops.length ; i++){
        if (ops[i].checked) {
            console.log("GetOption IF : "+ops[i].value); 
            return ops[i].value ;
        }
    }
}

function loadNextQuestions(){  
    //get User Answer
    var userAnswer = getOption();
    
    console.log("userAnswer : "+userAnswer);

    //Coorect
    if(questions[currentQuestion].answer == userAnswer ){
        correct += 1 ; 
        console.log(" Correct : "+correct);
    }
    else if(userAnswer === undefined){
        leaved += 1 ;
        console.log(" leaved : "+leaved);
    }
    //Incorrect
    else{
        incorrect += 1 ;
        console.log("InCorrect : "+incorrect);
    }
   

    if( currentQuestion == totalQuestions-2 ){
        nextButton.textContent = "Finish";
        console.log("Finish Button");
        console.log("Correct : "+correct + " InCorrect : "+incorrect + " Leaved : "+leaved );
    }

    if( currentQuestion == totalQuestions-1 ){
        description.style.display ="none" ;
        resultPieChart();  
    }

    currentQuestion++ ;
    loadQuestions(currentQuestion);
}

function resultPieChart(){
    // Load google charts
    google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart);
    
    // Draw the chart and set the chart values
    function drawChart(){
        var data = google.visualization.arrayToDataTable([
            ['Question', 'Marks'],
            ['Correct', correct],
            ['Incorrect', incorrect],
            ['Leaved', leaved]
          ]);
    
    
    // Optional; add a title and set the width and height of the chart
    var options = {'title':'Quiz Result', 'width':550, 'height':400};
  
    // Display the chart inside the <div> element with id="piechart"
    var chart = new google.visualization.PieChart(document.getElementById("pieChart"));
    chart.draw(data, options);
    }
}

function loadPreviousQuestions(){
    currentQuestion-- ;
    loadQuestions(currentQuestion);  
}
