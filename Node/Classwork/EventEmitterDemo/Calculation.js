const EvenEmitter = require('events');

class Calc extends EvenEmitter{

    constructor(){
        super();
    };

    add(a,b){
        this.emit('add',a+b);
    }

}
module.exports = Calc;