const express = require("express");
const app = express();
const pug = require("pug");
const path = require("path");
const compiledFunction = pug.compileFile("auth.pug");
const bodyParser = require('body-parser');

let LoginUrl = "login.html"; 
app.use(bodyParser());

app.get('/',function(req,res){
    res.sendFile(path.join(__dirname+"/"+LoginUrl))
}); 

app.get("/auth.pug", (req, res) => {
        
    let getResponseFile = compiledFunction({
        id : req.query.id,
        password : req.query.password,
    });
    res.send(getResponseFile);
});

app.post('/auth.pug', (req, res) => {
    
    let postResponseFile = compiledFunction({
        id : req.body.id,
        password : req.body.password,
    });
    res.send(postResponseFile);
    // res.end(JSON.stringify(req.body));
    
});

app.listen(3000, function(req,res){
    console.log("Running ... ");
});