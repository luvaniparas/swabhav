var readLine = require('readline-sync');

var firstName = readLine.question("Enter your first name ?");
var lastName = readLine.question("What is your last name ?");
console.log("Full name : "+firstName +" "+ lastName );