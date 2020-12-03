const readLine = require('readline');
const movieService = require("./service");

let AddMovie;
let movieObj = new movieService();


const terminal = readLine.createInterface({
    input : process.stdin,
    output : process.stdout
});

let menu = function(){
    terminal.question("\nCommand Menu \n List - List all movies \n Add - Add a movie \n Delete - Delete a movie \n Find - Find movie by year \n Exit - Exit program \n",function(choice){
        let userChoice = choice.toLowerCase() ;

        if(userChoice == "list"){
            readMovieDataBaseFile();
        }else if (userChoice == "add"){
            writeMovieDataBaseFile();
        }else if (userChoice == "delete" ){   
            deleteMovieDataBaseFile();
        }else if (userChoice == "find"){   
            findMovieDataBaseFile();
        }else if (userChoice == "exit"){   
            terminal.close();
        }  
    })
}
menu();

let readMovieDataBaseFile = function(){
    let number = 0 ;
    console.log("Command : List");
    
    let movieList = movieObj.readMovieDBFile();
    movieList.forEach(element => { 
        console.log(++number+"."+element.name +" ("+element.year+") @"+element.price); 
    }); 
    menu();
}

let writeMovieDataBaseFile = function(){
    console.log("Command : Add");
    let movieList = movieObj.readMovieDBFile();
    let index = movieList.length;

    terminal.question("Name : ",function(name){
        terminal.question("Year : ",function(year){
            terminal.question("Price : ",function(price){

                AddMovie = {
                    id : ++index,
                    name : name,
                    year : year,
                    price : price
                }
                
                movieObj.writeMovieDBFile(AddMovie);
                console.log(name+" was added");
                menu();
            })
        })
    })
    
}

let deleteMovieDataBaseFile = function(){
    console.log("Command : Delete");

    let movieList = movieObj.readMovieDBFile();    
    
    terminal.question("Number : ",function(number){
        
        console.log(movieList[--number].name+" was deleted");
        movieObj.deleteMovieFromDBFile(number);     
        menu();
    });
   
}

let findMovieDataBaseFile = function(){
    console.log("Command : Find");

    terminal.question("Year : ",function(year){
        movieFound = movieObj.findMovieFromDBFile(year);
        console.log(movieFound);
        menu();
    });
    
}

