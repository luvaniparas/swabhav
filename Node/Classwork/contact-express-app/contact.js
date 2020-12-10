const express = require('express');  
const app = express();
  
  let contacts = [
    { name: "Paras", id: 1 },
    { name: "Jayant", id: 2 },
    { name: "Kaushik", id: 3},
    { name: "Shailesh", id: 4},
  ];
      
    app.get('/',function(req,res){
        res.send("Contacts App => ");
    }); 

    app.get('/contact',function(req,res){
       res.send(contacts);
    }); 

    app.get('/contact/:id',function(req,res){
        res.send(
            contacts.find((contact) => {
                return contact.id == req.params.id ;
            })
        );
    }); 

    function requestDetails(req,res) {
        console.log("IP : "+req.ip);
        console.log("HostName : "+req.hostname);
        next();
    }

    function atRequestTime(req,res) {
        console.log("Time : "+new Date().getTime());
        next();
    }

    function authenticationRequest(req,res){
        console.log("Authenticating contacts : ");
        next();
    }

    app.listen(3000, function(req,res){
      console.log("Running ... ");
    });
  
 