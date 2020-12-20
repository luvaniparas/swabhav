const movieList = require("./movieDataBase");

class MovieService {
    
    constructor(){
        this.movieList = require("./movieDataBase");
    }

    getMovieList(){
        return this.movieList;
    }

    getMovieById(searchedMovieId){
        console.log("getMovieById : "+searchedMovieId);
        this.movieList.find((movie) => {
            return movie.id == searchedMovieId;
        })
    }
}

module.exports = MovieService;