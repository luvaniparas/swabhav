// npm/install/app.js
// var _ = require('underscore');
// console.log(_.min([3, 1, 2])); // 1

var foo = [1, 10, 50, 200, 900, 90, 40];
var rawResults = []
for (i = 0; i < foo.length; i++) {    
    if (foo[i] > 100) {
        rawResults.push(foo[i]);
    }
}