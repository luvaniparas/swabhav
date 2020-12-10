const account1 = require("./account1");
const account2 = require("./account2");
const account3 = require("./account3");

var readLine = require('readline-sync');

const accountObj = new account3();
let withdrawAmout,depositeAmout;

let withdraw = function(){
    withdrawAmout = readLine.questionInt("Enter amount to withdraw : ");
}

let deposite = function(){
    depositeAmout =  readLine.questionInt("Enter amount to deposite : ");
}

accountObj.on('balanceChange',sendSms);
accountObj.on('balanceChange',sendEmail);

function sendSms(balance){
    console.log("Sending sms, updated balance: "+balance);
}
function sendEmail(balance){
    console.log("Sending email, updated balance: "+balance);
}

console.log("Class approach => ");
 deposite();
 accountObj.deposite(depositeAmout);

 withdraw();
 accountObj.withdraw(withdrawAmout);

 // console.log("Modular approach =>  ");
// withdraw();
// console.log("Balance after withdraw : "+account1.withdraw(withdrawAmout));
// deposite();
// console.log("Balance after deposite : "+account1.deposite(depositeAmout));

// console.log("Constructor approach => ");
// var account = new account2();
//  withdraw();
//  console.log("Balance after withdraw : "+account.withdraw(withdrawAmout));
//  deposite();
//  console.log("Balance after deposite : "+account.deposite(depositeAmout));