var foo = [1, 10, 50, 200, 900, 90, 40];
var _ = require('underscore');
var results = _.filter(foo, function (item) { return item > 100 });
console.log(results);
console.log("Min : "+_.min(foo)); 
console.log("Max : "+_.max(foo));

var foo2 = [1, 2, 3, 4];
var results2 = _.map(foo2, function (item) { return item * 2 });
console.log(results2);