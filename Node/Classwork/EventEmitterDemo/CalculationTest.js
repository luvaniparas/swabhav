const Calculation = require("./Calculation");

let c = new Calculation();

c.on('add',(r) => 
    console.log("Add result is "+r)
);

c.add(10,20);