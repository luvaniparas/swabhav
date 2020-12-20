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

    console.log("Data Definition Language : ");

    console.log("Create : ");
    /*Create a table named "Students":*/
    let table = "CREATE TABLE students (id int , name VARCHAR(255))";
    connection.query(table, function (err, result) {
        if (err) throw err;
        console.log("Table created");
    });

    /*Insert Single Row */
    console.log("Insert : ");
    let row = "INSERT INTO students (id, name) VALUES (001, 'Paras')";
    connection.query(row, function (err, result) {
      if (err) throw err;
      console.log("1 record inserted");
    });

    /*Insert Rows */
    let rows = "INSERT INTO students (id, name) VALUES ?";
    let values = [
        [002, 'jayant'],
        [003, 'kaushik'],
        [004, 'Shailesh'],
    ];
    connection.query(rows, [values], function (err, result) {
        if (err) throw err;
        console.log("Number of records inserted: " + result.affectedRows);
    });

    /* Update  */
    console.log("Update : ");
    let updateRow = "UPDATE students SET name = 'Paras Luvani' WHERE id = '001'";
    connection.query(updateRow, function (err, result) {
        if (err) throw err;
            console.log(result.affectedRows + " record(s) updated");
    });

    /* Delete  */
    console.log("Delete : ");
    let sql = "DELETE FROM students WHERE id = '004'";
    connection.query(sql, function (err, result) {
        if (err) throw err;
            console.log("Number of records deleted: " + result.affectedRows);
    });

// End Connection 
//   connection.end(function(err) {
//     if (err) {
//       return console.log('error:' + err.message);
//     }
//     console.log('Close the database connection.');
//   });