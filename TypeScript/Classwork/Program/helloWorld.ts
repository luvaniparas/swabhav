var message = "Hello World";
console.log(message);

var j ; 
var number = [1001,1002,1003,1004] 

console.log("Array => ");
for(j in number) { 
   console.log(number[j]) 
} 

console.log("Interface => ");
interface IPerson { 
    firstName:string, 
    lastName:string, 
    sayHi: ()=>string 
 } 
 
 var customer:IPerson = { 
    firstName:"Paras",
    lastName:"Luvani", 
    sayHi: ():string =>{return "Hi there"} 
 } 
 
 console.log("Customer Object ") 
 console.log(customer.firstName) 
 console.log(customer.lastName) 
 console.log(customer.sayHi()) 

console.log("Class => ");
class Car {  
    engine:string; 
     
    constructor(engine:string) { 
       this.engine = engine 
    }  
    
    disp():void { 
       console.log("Engine is  :   "+this.engine) 
    } 
 } 
 
 var t1 = new Car("Tesla1")
  
 console.log("Engine as :  "+t1.engine)  
 t1.disp();


