const readLine = require('readline');
const fs = require('fs');
const MOVIE_DB_FILE = 'movieDataBase.json' ;
let index,movieList;
let exit = false ;

let countINdex =function(){
    fs.readFile(MOVIE_DB_FILE,'utf-8',(err,movieData) =>{
        if(err){
            console.log("error : "+err);
        }else{
            const movies = JSON.parse(movieData);
            movieList = movies ;
            index = movies.length; 
        }
                        
    })
}
countINdex();

const terminal = readLine.createInterface({
    input : process.stdin,
    output : process.stdout
});

let menu = function(){
    terminal.question("Command Menu \n List - List all movies \n Add - Add a movie \n Delete - Delete a movie \n Find - Find movie by year \n Exit - Exit program \n",function(choice){
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
            exit = true;
            terminal.close();
        }  
    })
}
menu();
// do{
//     menu();
// }while(exit);


let findMovieDataBaseFile = function(){
    console.log("Command : Find");

    terminal.question("Year : ",function(year){
    
        movieList.forEach(obj => {      
            Object.entries(obj).forEach(([key, value]) => {
                if(key == "year" && value == year){
                    console.log(obj.name +" in "+ obj.year);
                } 
            });
        })
    });

}

let readMovieDataBaseFile = function(){

    fs.readFile(MOVIE_DB_FILE,'utf-8',(error,movieDataString) =>{
        if(error){
            console.log("Error : "+error);
        }
        else{
                const movies = JSON.parse(movieDataString);
                let index = 1;
                
                console.log("Command : List");
                movies.forEach(obj => {      
                    Object.entries(obj).forEach(([key, value]) => {
                
                        if(key == "name"){
                            console.log(`${index}. ${value} `);
                            index++;
                        } 
                   
                    });
                })
            }            
    })
}

let writeMovieDataBaseFile = function(){
    console.log("Command : Add");
    terminal.question("Name : ",function(name){
        terminal.question("Year : ",function(year){
            terminal.question("Price : ",function(price){

                MovieItemObj = {
                    id : ++index,
                    name : name,
                    year : year,
                    price : price
                }
                movieList.push(MovieItemObj);

                fs.writeFile(MOVIE_DB_FILE,JSON.stringify(movieList,null,2),error =>{
                    if(error){console.log("Error : "+error);}
                    else{console.log(name +" was added.");}
                })
            })
        })
    })  
}

let deleteMovieDataBaseFile = function(){
    console.log("Command : Delete");

    terminal.question("Number : ",function(number){

        console.log(movieList[--number].name+" was deleted");
        movieList.splice(number);
        
        fs.writeFile(MOVIE_DB_FILE,JSON.stringify(movieList,null,2),error =>{
            if(error){ console.log("Error : "+error);}
        })

    });
}