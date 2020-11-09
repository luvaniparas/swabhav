function f1() {
    console.log("Inside f1");
}
f1();
var f2 = function () {
    console.log("Inside f2");
};
f2();
setTimeout(function () {
    console.log("After 3 seconds");
}, 3000);
