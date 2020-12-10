const EvenEmitter = require('events');

class Account extends EvenEmitter {

    constructor(){
        super();
        this.balance = 500 ;
    }

    deposite = function(amout) {
        this.emit('balanceChange',this.balance = this.balance+amout);
    }
    
    withdraw = function(amout){
        if(this.balance > amout){
            this.emit('balanceChange',this.balance = this.balance-Number(amout));
        }
        else{
            return("can't withdraw");
        }
    }
}
module.exports = Account;