let mysql = require('mysql');

let connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'root',
    database: 'swabhav'
});

connection.connect(function(err) {
    if (err) {
      return console.error('error: ' + err.message);
    }
  
    console.log('Connected to the MySQL server.');
});

/* Expoiting the SQL Injection */
let addStudent = "INSERT INTO students (Id, Name) VALUES (4, 'Shailesh')";
connection.query(addStudent, function (err, result) {
    if (err) throw err;
    console.log("stduent data inserted SQL Injection");
}); 

/*Escaping query values*/
let student  = {id: 5, Name: 'Student5'};
let query = connection.query('INSERT INTO students SET ?', student, function (error, results, fields) {
    if (error) throw error;
    console.log("stduent data inserted using Escape");
});

connection.end();















\