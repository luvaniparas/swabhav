// contactMernRepo = require("./contactMernRepo");
// const contactMernRepoObj = new contactMernRepo();

// ContactSqlRepo = require("./contactSqlRepo");
// constContactMongoDBRepoObj = new ContactSqlRepo();

ContactMongoDBRepo = require("../Repo/contactMongoDBrepo");
const ContactMongoDBRepoObj = new ContactMongoDBRepo();

module.exports = class ContactService {
    
    constructor() { 
      this.contacts = ContactMongoDBRepoObj.contact;
     }

    getContacts() {
      return new Promise((resolve,reject) => {
        if(this.contacts != null){
          resolve(this.contacts);
        }
        else{
          reject(new Error("Can't Find Contact "));  
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

    addContact(name, id) {
      return new Promise((resolve,reject) => {
        if(id != null && name != null){
         ContactMongoDBRepoObj.addContact({ name, id });
          resolve("Contact Added ");
        }
        else{
          reject(new Error("Can't post this Contact"));  
        }
      });
    }    
  };    