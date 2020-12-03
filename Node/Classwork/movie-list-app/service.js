const fs = require('fs');
const MOVIE_DB_FILE = 'movieDataBase.json' ;
let movies,movieFound;;

module.exports = class movieService{
    constructor(){
        fs.readFile(MOVIE_DB_FILE,'utf-8',(err,movieData) =>{
            if(err){
                throw err ;
            }else{
                this.movies = JSON.parse(movieData); 
            }               
        })
    }
    
    readMovieDBFile(){
        return this.movies ;
    }

    writeMovieDBFile = function(AddMovie){ 
        this.movies.push(AddMovie);
        fs.writeFile(MOVIE_DB_FILE,JSON.stringify(this.movies,null,2),error =>{
            if(error) throw error ;
        })
    }

    deleteMovieFromDBFile = function(number){
        this.movies.splice(Number(number));
        fs.writeFile(MOVIE_DB_FILE,JSON.stringify(this.movies,null,2),error =>{
            if(error){ console.log("Error : "+error);}
        })
    }

    findMovieFromDBFile = function(year){
        this.movies.forEach(obj => {      
            Object.entries(obj).forEach(([key, value]) => {
                if(key == "year" && value == year){
                    movieFound = obj.name +" in "+ obj.year;
                } 
            });
        })
        return movieFound ;
    }
}






