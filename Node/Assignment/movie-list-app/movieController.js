const express = require('express');  
const app = express();
const MovieService = require("./movieService");

let movieServiceObj = new MovieService();

    /**
     * @swagger
     * /movieList:
     *  get:
     *    description: Use to request all movies
     *    responses:
     *      '200':
     *        description: A successful response
     */
    app.get('/',function(req,res){
        console.log("Inside contact_get_Request");
        let movieList = movieServiceObj.getMovieList();
        res.status(200).json(movieList);
    }); 

    /**
     * @swagger
     * /movieList/{id}:
     *   get:
     *     description: Get a movieList by ID
     *     parameters:
     *       - in : path
     *         name : movie Id
     *         type : integer
     *         required: true
     *     responses:
     *       '200':        
     *         description: Numeric ID of the movie to get
     */
    app.get('/:id',function(req,res){
        console.log("Inside contact_get_Request Id : "+JSON.stringify(req.params));
        res.end();
        //let movie = movieServiceObj.getMovieById(req.params.id);
        //console.log("Movie : "+JSON.stringify(movie));
        //movie ? res.status(200).json(movie) : res.sendStatus(404) ;
    });

module.exports = app;


