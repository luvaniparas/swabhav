class Account{

    constructor(){
        this.balance = 500 ;
    }

    deposite = function(amout) {
        return(this.balance = this.balance+amout ) ;
    }
    
    withdraw = function(amout){
        if(this.balance > amout){
            return(this.balance = this.balance-Number(amout)) ;
        }
        else{
            return("can't withdraw");
        }
    }
}
module.exports = Account;