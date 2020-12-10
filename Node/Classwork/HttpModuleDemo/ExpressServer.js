const path = require("path");
const express = require('express');

const app = express();
let indexUrl = "/public/index.html";
let indexCssUrl = "/public/index.css";

app.use(express.static(path.join(__dirname,"public")));

app.get('/',function(req,res){
    res.sendFile(path.join(__dirname+indexUrl))
}); 

app.listen(9000, function(req,res){
    console.log("Running ... ");
});

// app.use("/",function(req,res,next){
//     console.log(req.url);
//     next();
// })