const repo = require("./contactMongoDb");
const obj = new repo();

let c = [] ;

let contactListId = "6026de566a752e10c88b4306";
let contactId = "60281d617e59ed123850766e";
let update =  {name : "paras Updated"}  ;

async function contact(){
    c = await obj.updateContact(contactListId,contactId,update);
    console.log(c);
}
contact();