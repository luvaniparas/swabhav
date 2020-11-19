import { Customer } from "./Customer";

class CustomerTest extends Customer { 

    constructor(id:number,name:String){
        super(id,name)
    }
 }

 let c1 : CustomerTest = new CustomerTest(101,"Paras");
 console.log(JSON.stringify(c1));

 console.log("Setters =>");
 c1.Id = 1;
 c1.Name = "Paras Luvani";
 
 console.log("Getters =>");
 console.log(c1.Id);
 console.log(c1.Name);
 