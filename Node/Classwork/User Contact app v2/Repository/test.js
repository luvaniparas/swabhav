const mongo = require("./contactMongoDb");
const repo = new mongo();

let id="6028eb65dbf5d017cc62a2cd";

async function getLength(){
    let len = await repo.getContactListSize(id);
    console.log("Length : "+len);
} 
getLength();