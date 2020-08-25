var person = (function () {
    var firstName = "Sam";
    var lastName = "Thomas";

    return {
        getFirstName: function() {
            return firstName;
        },
        getLastName: function() {
            return lastName;
        },
        setFirstName: function(name) {
            firstName = name;
        },
        setLastName: function(name) {
            lastName = name;
        }
    }

}) ();

console.log(person.getFirstName());
console.log(person.getLastName());

person.setFirstName("Tom");
person.setLastName("Domingo");

console.log(person.getFirstName());
console.log(person.getLastName());

console.log(lastName); // Uncaught ReferenceError: lastName is not defined
console.log(this.lastName); // undefined
console.log(person.lastName); // undefined
console.log(person.setFirstName("tom")); // undefined
