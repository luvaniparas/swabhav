const assert = require('chai').assert ;
const calculator = require("../app");
const calculatorObj = new calculator();

describe('calculator',function(){
    
    it('calculator should add numbers',function(){
        let result = calculatorObj.add(10,20);
        assert.equal(result,30);
    })

    it('calculator should return number type',function(){
        let result = calculatorObj.add(10,20);
        assert.typeOf(result,'number');
    })

    it('calculator should return welcome',function(){
        let result = calculatorObj.welcome();
        assert.lengthOf(result, 7);
    })
    
})