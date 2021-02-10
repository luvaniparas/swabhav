const repository = require("../Repository/contactMongoDb");
const contactMongoDBRepository = new repository();

module.exports = class ContactService {
    
    constructor() { }

    getContacts() {
      return new Promise((resolve,reject) => {
          this.contacts = contactMongoDBRepository.getContacts();
          resolve(this.contacts);
      });
    }

    serachContact(attribute,value) {
      return new Promise((resolve,reject) => {
            
        if( value != null){
          resolve(contactMongoDBRepository.searchContact({ [attribute] : value}));  
        }
        else{
          reject(new Error("Can't Find Contact with entered value "));  
        }

      });
    }

    async addContact(id,body) { 
      console.log("Inside Service");
      return await contactMongoDBRepository.addContact(id,body);
    }
    
    getContactByID(id) {
      return new Promise((resolve,reject) => {
        
        if(id != null){
          resolve(contactMongoDBRepository.getContactByIdRepo(id));  
        }
        else{
          reject(new Error("Can't Find Contact with this ID "));  
        }

      });
    }

    deleteContact(id){

      return new Promise((resolve,reject) => {

        if(id != null){
          resolve(contactMongoDBRepository.deleteContact(id));  
        }
        else{
          reject(new Error("No Contact with this ID "));  
        }

      });

    }

    updateContact(id,contact){
      
      return new Promise((resolve,reject) => {

        if( contact != null){
          resolve(contactMongoDBRepository.updateContact(id,contact));  
        }
        else{
          reject(new Error("Can't update contact "));  
        }

      });

    }

    async createContactList(){  
      return await contactMongoDBRepository.createContactList();
    }
  };    