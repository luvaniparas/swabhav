function Person(firstName, lastName) {

    this.firstName = firstName;
    this.lastName = lastName;
    
    //getters
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
 
}

var person1 = new Person("Sam", "Thomas");
console.log(person1.getFirstName());

person1.setFirstName("Tom");
console.log(person1.getFirstName());


//console.log(lastName); // Uncaught ReferenceError: lastName is not defined
console.log(this.lastName); // undefined
console.log(person1.lastName); // undefined
console.log(person1.setFirstName("ram")); // undefined
console.log(person1.getFirstName());

// firstname and lastname are encapuslated and they cannot be accessed outside
// to access them we use getters
// yess
// outside the scope of Person
// bcoz of the scope 
// firstName exists bt is not intialized
// bcoz of hoisting it is creating a firstName variable

// const me class and object ke liye kiya hu encapsulation ke module pattern use kiya hu