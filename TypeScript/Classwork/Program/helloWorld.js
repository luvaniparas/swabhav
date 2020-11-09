var message = "Hello World";
console.log(message);
var j;
var number = [1001, 1002, 1003, 1004];
console.log("Array => ");
for (j in number) {
    console.log(number[j]);
}
console.log("Interface => ");
var customer = {
    firstName: "Paras",
    lastName: "Luvani",
    sayHi: function () { return "Hi there"; }
};
console.log("Customer Object ");
console.log(customer.firstName);
console.log(customer.lastName);
console.log(customer.sayHi());
console.log("Class => ");
var Car = /** @class */ (function () {
    function Car(engine) {
        this.engine = engine;
    }
    Car.prototype.disp = function () {
        console.log("Engine is  :   " + this.engine);
    };
    return Car;
}());
var t1 = new Car("Tesla1");
console.log("Engine as :  " + t1.engine);
t1.disp();
