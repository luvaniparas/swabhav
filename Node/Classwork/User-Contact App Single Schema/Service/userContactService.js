mongoDB = require("../Repository/MongoUserContact");
const userContactMongoDBRepo = new mongoDB();

module.exports = class userContactService {
    
    constructor() { }

    addContact(userContact) {
            
      return new Promise((resolve,reject) => {
      
        if(contact != null){  
          resolve(ContactMongoDBRepoObj.addContact(contact));
        }
        else{
          reject(new Error("Can't add this Contact"));  
        }
        
      });
    }
    
    // getContacts() {
    //     return new Promise((resolve,reject) => {
    //         this.contacts = ContactMongoDBRepoObj.getContacts();
    //         resolve(this.contacts);
    //     });
    // }
  
    // serachContact(attribute,value) {
    //     return new Promise((resolve,reject) => {
              
    //       if( value != null){
    //         resolve(ContactMongoDBRepoObj.searchContact({ [attribute] : value}));  
    //       }
    //       else{
    //         reject(new Error("Can't Find Contact with entered value "));  
    //       }
  
    //     });
    // }
    
    // getContactByID(id) {
    //   return new Promise((resolve,reject) => {
        
    //     if(id != null){
    //       resolve(ContactMongoDBRepoObj.getContactByIdRepo(id));  
    //     }
    //     else{
    //       reject(new Error("Can't Find Contact with this ID "));  
    //     }

    //   });
    // }

    // deleteContact(id){

    //   return new Promise((resolve,reject) => {

    //     if(id != null){
    //       resolve(ContactMongoDBRepoObj.deleteContact(id));  
    //     }
    //     else{
    //       reject(new Error("No Contact with this ID "));  
    //     }

    //   });

    // }

    // updateContact(id,contact){
      
    //   return new Promise((resolve,reject) => {

    //     if( contact != null){
    //       resolve(ContactMongoDBRepoObj.updateContact(id,contact));  
    //     }
    //     else{
    //       reject(new Error("Can't update contact "));  
    //     }

    //   });

    // }

  };    