var questions=[{
    "qu":"Inside which HTML element do we put the JavaScript?",
    "o1" :"<javascript>",
    "o2" :"<scripted>",
    "o3" :"<script>",
    "o4" :"<js>",
    "answer":"3"
},{
    "qu":"Which of the following is the correct syntax to display “SwabhavTechlabs” in an alert box using JavaScript?",
    "o1" :"alertbox(“SwabhavTechlabs”);",
    "o2" :"msg(“SwabhavTechlabs”);",
    "o3" :"msgbox(“SwabhavTechlabs”);",
    "o4" :"alert(“SwabhavTechlabs”);",
    "answer":"4"
},{
    "qu":"What is the correct syntax for referring to an external script called “quiz.js”?",
    "o1" :"<script src=”quiz.js”>",
    "o2" :"<script href=”quiz.js”>",
    "o3" :"<script ref=”quiz.js”>",
    "o4" :"<script name=”quiz.js”>",
    "answer":"1"
},{
    "qu":"Which of the following is not a reserved word in JavaScript?",
    "o1" :"interface",
    "o2" :"throws",
    "o3" :"program",
    "o4" :"short",
    "answer":"3"
},{
    "qu":"How is the function called in JavaScript?",
    "o1" :"call swfunc();",
    "o2" :"call function swFunc();",
    "o3" :"swfunc();",
    "o4" :"function swfunc();",
    "answer":"3"
}
]

var currentQuestion = 0 ;
var correct = 0 , incorrect = 0 ,leaved = 0;
var totalQuestions = questions.length;

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
            return ops[i].value ;
        }
    }
}

function loadNextQuestions(){  
    //get User Answer
    var userAnswer = getOption();
    
    //Coorect
    if(questions[currentQuestion].answer == userAnswer ){
        correct += 1 ; 
    }
    else if(userAnswer === undefined){
        leaved += 1 ;
    }
    //Incorrect
    else{
        incorrect += 1 ;
    }
   
    if( currentQuestion == totalQuestions-2 ){
        nextButton.textContent = "Finish";
    }

    if( currentQuestion == totalQuestions-1 ){
        description.style.display ="none" ;
        resultPieChart();  
    }

    questions[userAnswer].checked = false ;
    currentQuestion++ ;
    loadQuestions(currentQuestion);
}

function loadPreviousQuestions(){
    currentQuestion-- ;
    loadQuestions(currentQuestion);  
}

function resultPieChart(){
    var reload = document.createElement('input');
    reload.setAttribute('id','rbtn');
    reload.setAttribute('class', 'class="btn btn-danger"');
    reload.setAttribute('type', 'button');
    reload.setAttribute('value', 'Play Again');

    reload.addEventListener('click',function(){
        location.reload();
    });

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
    var options = {'title':'Quiz Result', 'width':500, 'height':400};
  
    // Display the chart inside the <div> element with id="piechart"
    var chart = new google.visualization.PieChart(document.getElementById("pieChart"));
    chart.draw(data, options);

    document.getElementById("pieChart").appendChild(reload);
    }
}
