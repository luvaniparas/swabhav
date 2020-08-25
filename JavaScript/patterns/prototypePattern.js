// function Person(firstName, lastName) {
//     this.firstName = firstName;
//     this.lastName = lastName;
    
//     this.getFirstName = function() {
//         return this.firstName;
//     }
//     this.getLastName = function() {
//         return this.lastName;
//     }
// }

// // Person.prototype.age = 10;
// Person.prototype.setAge = function(currentAge) {
//     age = currentAge;
// }
// Person.prototype.getAge = function() {
//     return age;
// }

// var person1 = new Person("Sam", "Thomas");
// console.log(person1.getFirstName());
// console.log(person1.getLastName());
// person1.setAge(10);
// console.log("Before modification " + person1.getAge());

// var person2 = new Person("Tom", "McGil");
// console.log(person2.getFirstName());
// console.log(person2.getLastName());
// console.log("Before modification " + person2.getAge());
// person2.setAge(20);
// console.log("Before modification " + person2.getAge());
// console.log("After modification " + person1.getAge());

function Employee (id,name) {
    this.id=id;
    this.name=name;
    }
    
    Employee.prototype.getDetails= function () {
    return "Id: "+this.id+" Name: "+this.name;
    }
    var e1 = new Employee(1,"Abc");
    console.log(e1);
    console.log(e1.getDetails());
    console.log(Employee.prototype==e1.__proto__);//true
    
    var e2 = new Employee(2,"Def");
    console.log(e2);
    
    console.log(Employee.prototype==e2.__proto__); //true
    console.log(e1.__proto__==e2.__proto__); //true
    
    console.log(Employee.prototype.__proto__); // object
    console.log(Object.prototype.__proto__);//?? null

    console.log(Employee.prototype.__proto__ == Object.prototype); //??
    