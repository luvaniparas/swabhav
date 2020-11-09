import { Employee } from "./Employee";

class EmployeeTest extends Employee { 
    id:number

    constructor(name:String,id:number){
        super(name)
        this.id = id
    }
 }

 let e1 : EmployeeTest = new EmployeeTest("Paras",101);
 console.log(JSON.stringify(e1));