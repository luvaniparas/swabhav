var balance = 500;

exports.deposite = function(amout) {
    return(balance = balance+amout ) ;
}

exports.withdraw = function(amout){
    if(balance > amout){
        return(balance = balance-Number(amout)) ;
    }
    else{
        return("can't withdraw");
    }
}