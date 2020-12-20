var MongoClient = require('mongodb').MongoClient;

//Create a database named "mydb":
var url = "mongodb+srv://root:root@cluster0.ny0yw.mongodb.net/test/swabhavDatabase";

class ContactMongoDBRepo{

    constructor(){}

    get contact(){
        return new Promise((resolve,reject) => {
            /* get Data from collection*/ 
            MongoClient.connect(url, function(err, db) {
                if (err) throw err;
                var dbo = db.db("swabhavDatabase");
                dbo.collection("Contacts").find({}).toArray(function(err, result) {
                    if (err) {
                        reject(new Error("Can't Find Contact ")); 
                    } 
                    else {
                        resolve(result);
                        db.close();
                    }
                });
            });
        });
    }

    addContact(contact){
        return new Promise((resolve,reject) => {

            MongoClient.connect(url, function(err, db) {
                if (err) throw err;
                var dbo = db.db("swabhavDatabase");
                dbo.collection("Contacts").insertOne(contact, function(err, res) {
                    if (err) throw err;
                    else{
                        resolve(res);
                        console.log("1 document inserted");
                        db.close();
                    }  
                });
            });
        });
    }

    getContactByIdRepo(id){
        return new Promise((resolve,reject) => {
            if(id != null){

                MongoClient.connect(url, function(err, db) {
                    if (err) throw err;
                    var dbo = db.db("swabhavDatabase");
                    dbo.collection("Contacts").find(id).toArray(function(err,result){
                        if(err)
                            reject(new Error("Error result is undefined"));
                        else
                            resolve(JSON.stringify(result));
                    });
                  });

            }
        });    
    }

}

module.exports = ContactMongoDBRepo;




 


 
 