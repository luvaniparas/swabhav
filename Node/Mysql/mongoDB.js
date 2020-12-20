var MongoClient = require('mongodb').MongoClient;

//Create a database named "mydb":
var url = "mongodb+srv://root:root@cluster0.ny0yw.mongodb.net/test/swabhavDatabase";

/* Create DataBase */
MongoClient.connect(url, function(err, db) {
  if (err) throw err;
  console.log("Database created!");
  db.close();
});

/* Create collection */
MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("swabhavDatabase");

    dbo.createCollection("students", function(err, res) {
      if (err) throw err;
      console.log("Collection created!");
      db.close();
    });
  });

  /* Insert single row */
  MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("swabhavDatabase");
    var contactObj = { name: "Paras" , id: 1 };
    dbo.collection("students").insertOne(contactObj, function(err, res) {
      if (err) throw err;
      console.log("1 document inserted");
      db.close();
    });
  });

  /* Insert Multiple rows */
  MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("swabhavDatabase");
    var contactsObj = [
      { name: 'Jayant', id: 2},
      { name: 'Kaushik', id: 3},
      { name: 'Shailesh', id: 4}
    ];
    dbo.collection("students").insertMany(contactsObj, function(err, res) {
      if (err) throw err;
      console.log("Number of documents inserted: " + res.insertedCount);
      db.close();
    });
  });
  
  /* Update row*/
  MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("swabhavDatabase");
    var myquery = { id: 1 };
    var newvalues = { $set: { name: "paras Luvani", id : 1 } };
    dbo.collection("students").updateOne(myquery, newvalues, function(err, res) {
      if (err) throw err;
      console.log("1 document updated");
      db.close();
    });
  });

  /* Delete Row */
  MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("swabhavDatabase");
    var myquery = { name : "shailesh" };
    dbo.collection("customers").deleteOne(myquery, function(err, obj) {
      if (err) throw err;
      console.log("1 document deleted");
      db.close();
    });
  });


