let mysql = require('mysql');
let connection;

class ContactSqlRepo{

    constructor(){

        connection = mysql.createConnection({
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
        
    }

    get contact(){

        return new Promise((resolve,reject) => {
            connection.query("SELECT * FROM contacts", function (err, result, fields) {
                if (err){
                    reject(new Error("Can't Find Contact "));  
                } 
                else{
                    resolve(result);
                }    
            });
        });

    }

    addContact(contact){
        return new Promise((resolve,reject) => {

            if(contact != null){
                connection.query("INSERT INTO contacts SET ?", contact, function (error, results, fields) {
                    if (error) throw error;
                    else resolve(results);
                });
            }
            
        });
    }

    getContactByIdRepo(id){
        return new Promise((resolve,reject) => {
            if(id != null){

                connection.query("SELECT * FROM contacts WHERE id = ?", id ,function (error, results, fields) {
                    if (error) throw error;
                    else resolve(results);
                });

            }
        });    
    }
}

module.exports = ContactSqlRepo;
