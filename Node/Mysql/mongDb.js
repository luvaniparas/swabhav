const mongoose = require('mongoose');
const MongoClient = require('mongodb').MongoClient;
var url = "mongodb+srv://root:root@cluster0.ny0yw.mongodb.net/test/swabhavDatabase";


var personSchema = new mongoose.Schema({
    id : Number,
    name: {
      first : String,
      last : { type: String, trim: true }
    },
    number : Number,
    location : String
  });

var PUser = mongoose.model('PUser',personSchema);

var paras = new PUser ({
    id : 1 , 
    name: { first: 'Paras', last: '   Luvani  ' },
    number: 9699,
    location : "Mumbai"
});

var jayant = new PUser ({ 
    name: { first: 'Jayant', last: ' lName ' },
    number: 9699,
    location : "Mumbai"
});

MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("swabhavDatabase");
    
    dbo.collection("Person").insertOne(paras, function(err, res) {
      if (err) throw err;
      console.log("1 document inserted");
      db.close();
    });

    dbo.collection("Person").insertOne(jayant, function(err, res) {
        if (err) throw err;
        console.log("1 document inserted");
        db.close();
    });

  }); 

// class ContactMongoDBRepo{

//     constructor(){}
    
   
    

// }

// // module.exports = ContactMongoDBRepo;