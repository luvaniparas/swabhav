const account1 = require("./account1");
const account2 = require("./account2");
const account3 = require("./account3");

var readLine = require('readline-sync');

var withdrawAmout,depositeAmout ;
var withdraw = function(){
    withdrawAmout = readLine.questionInt("Enter amount to withdraw : ");
}

var deposite = function(){
    depositeAmout =  readLine.questionInt("Enter amount to deposite : ");
}

console.log("Modular approach =>  ");
withdraw();
console.log("Balance after withdraw : "+account1.withdraw(withdrawAmout));
deposite();
console.log("Balance after deposite : "+account1.deposite(depositeAmout));

console.log("Constructor approach => ");
var account = new account2();
 withdraw();
 console.log("Balance after withdraw : "+account.withdraw(withdrawAmout));
 deposite();
 console.log("Balance after deposite : "+account.deposite(depositeAmout));


console.log("Class approach => ");
var account = new account3();
 withdraw();
 console.log("Balance after withdraw : "+account.withdraw(withdrawAmout));
 deposite();
 console.log("Balance after deposite : "+account.deposite(depositeAmout));

