module.exports = class ContactService {
    
    constructor() {
      this.contacts = require("./contactMernRepo");
    }

    getContacts() {
      return this.contacts;
    }

    findContactWithID(id) {
      return this.contacts.find((contact) => {
        return contact.id == id;
      });
    }
    
    addContact(name, id) {
      //console.log("Service ID : "+id+" Name : "+name);
      this.contacts.push({ name, id });
    }

  };
  