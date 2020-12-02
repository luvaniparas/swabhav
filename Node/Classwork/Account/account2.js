module.exports = Account ;

function Account(){
    this.balance = 500 ;
}

Account.prototype.deposite = function deposite(amout) {
    return(this.balance = this.balance+amout ) ;
}


Account.prototype.withdraw = function withdraw(amout){
    if(this.balance > amout){
        return(this.balance = this.balance-Number(amout)) ;
    }
    else{ 
       return("can't withdraw");
    }
}

