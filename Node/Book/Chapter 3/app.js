var foo = require("./foo");
foo();

console.log("__dirname : "+__dirname);
console.log("__filename : "+__filename);

process.nextTick(function () {
    console.log('next tick');
});
console.log('immediate');