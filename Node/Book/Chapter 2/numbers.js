console.log("Numbers");
var foo = 3;
var bar = 5;
console.log(foo+1);
console.log(foo/bar);
console.log(foo*bar);
console.log(foo-bar);
console.log(foo%2);

console.log("Boolean");
var foo = true;console.log(foo);  
console.log(true && true);
console.log(true && false);  
console.log(true || false);  // true
console.log(false || false); // false
console.log(!true);          // false
console.log(!false);         // true

console.log("Array");
var foo = [];foo.push(1);         // add at the end
console.log(foo);    // prints [1]
foo.unshift(2);      // add to the top
console.log(foo);    // prints [2,1]
// Arrays are zero index based:
console.log(foo[0]); // prints 2

console.log("Object");
var foo = {};
console.log(foo); // {}
foo.bar = 123;    // extend foo
console.log(foo); // { bar: 123 }

console.log("Function");
// function foo() { return 123; }
// console.log( foo() ); // 123

(function foo() 
    {console.log('Immediate execution function');
})();

var foo2 = function () {
    // no function name given i.e. anonymous function    
    console.log('Anonymous Function');
}
foo2(); // foo2

setTimeout(function () {
    console.log('2000 milliseconds have passed since this demo started');}, 2000);

    function outerFunction(arg) {   
         var variableInOuterFunction = arg;    
            function bar() { 
                console.log(variableInOuterFunction); // Access a variable from the outer scope   
            }    // Call the local function to demonstrate that it has access to arg   
         bar();
    }
    outerFunction('hello closure!');