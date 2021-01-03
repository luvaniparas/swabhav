ContactMongoDBRepo = require("../Repo/ContactMongoDb");
const ContactMongoDBRepoObj = new ContactMongoDBRepo();

module.exports = class ContactService {
    
    constructor() { }

    getContacts() {
      return new Promise((resolve,reject) => {
          this.contacts = ContactMongoDBRepoObj.getContacts();
          resolve(this.contacts);
      });
    }

    serachContact(attribute,value) {
      return new Promise((resolve,reject) => {
            
        if( value != null){
          resolve(ContactMongoDBRepoObj.searchContact({ [attribute] : value}));  
        }
        else{
          reject(new Error("Can't Find Contact with entered value "));  
        }

      });
    }

    addContact(contact) {
      
      console.log("Service Contact Add ");
      //return ContactMongoDBRepoObj.addContact(contact)
      return new Promise((resolve,reject) => {

        if(contact != null){  
          ContactMongoDBRepoObj.addContact(contact);
          resolve("Contact Added");
        }
        else{
          reject(new Error("Can't add this Contact"));  
        }
        
      });
    }
    
    getContactByID(id) {
      return new Promise((resolve,reject) => {
        
        if(id != null){
          resolve(ContactMongoDBRepoObj.getContactByIdRepo(id));  
        }
        else{
          reject(new Error("Can't Find Contact with this ID "));  
        }

      });
    }

    deleteContact(id){

      return new Promise((resolve,reject) => {

        if(id != null){
          resolve(ContactMongoDBRepoObj.deleteContact(id));  
        }
        else{
          reject(new Error("No Contact with this ID "));  
        }

      });

    }

    updateContact(id,contact){
      
      return new Promise((resolve,reject) => {

        if( contact != null){
          resolve(ContactMongoDBRepoObj.updateContact(id,contact));  
        }
        else{
          reject(new Error("Can't update contact "));  
        }

      });

    }

  };    