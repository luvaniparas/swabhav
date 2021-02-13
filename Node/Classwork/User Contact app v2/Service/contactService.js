const repository = require("../Repository/contactMongoDb");
const contactMongoDBRepository = new repository();

module.exports = class ContactService {
    
    constructor() { }

    async getContacts(id) {
      return await contactMongoDBRepository.getContacts(id);
    }

   async serachContact(contactListId,attribute,value) {
      return await contactMongoDBRepository.searchContact( contactListId,attribute,value) ;
    }

    async addContact(id,body) { 
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

    async deleteContact(contactListId,contactId){
      return await contactMongoDBRepository.deleteContact(contactListId,contactId) ;
    }

    async updateContact(contactListId,contactId,contact){
      //console.log("Service contact : "+JSON.stringify(contact));
      return await contactMongoDBRepository.updateContact(contactListId,contactId,contact);
    }

    async createContactList(){  
      return await contactMongoDBRepository.createContactList();
    }
  };    