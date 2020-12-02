console.log(process.argv);

if(process.argv.length < 3){
    console.log("Hello Swabhav Techlabs");
}

for(let i=2; i<process.argv.length ; i++){
    console.log("Hello "+process.argv[i]);
}