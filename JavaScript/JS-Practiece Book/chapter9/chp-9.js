function checkWeight(weight) {
    if (weight > 5000) {
        var text = "No free shipping for you!";
        console.log(text);
    }
    console.log(text);
}
checkWeight(6000);

var x = 100;
function blockScoping() {
    if (true) {
        let x = 350;
        console.log(x);
    }
    console.log(x);;
}
blockScoping();