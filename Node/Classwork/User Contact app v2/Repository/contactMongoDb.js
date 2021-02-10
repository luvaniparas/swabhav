const mongoose = require("mongoose");
const Contact = require("./contactSchema");
var url = "mongodb+srv://root:root@cluster0.ny0yw.mongodb.net/swabhavDatabase?retryWrites=true&w=majority";

module.exports = class Mongoose {
 
    constructor() {
        this.startConnection();
    }

  startConnection = () => {
        mongoose.connect(
        url,
            {
                useNewUrlParser: true,
                useUnifiedTopology: true,
                useCreateIndex: true,
                useFindAndModify: false,
            },
        function (err) {
            if (err) throw err;
            }
        );
    };

  async createContactList(contact) {
      let contactId ;
      await new Contact(contact).save().then(contact => {
          contactId = contact._id;
      })
      return contactId;
  };

  async addContact (id,addContact) {
      return await Contact.findOneAndUpdate(
        {_id : id},
        {$push : { contactList : addContact }}
     )
  };

  async getContacts() {
    return await Contact.find({}, "-address._id");
  }

  async searchContact(searchObj) {
    return await Contact.find(searchObj);
  }

  async getContactByIdRepo(id){
    return await Contact.find({ _id : id });
  }
  
  async deleteContact(id){
    return await Contact.deleteOne({ _id : id }); 
  }

  async updateContact(contactId, contactUpdate){
    return await Contact.findByIdAndUpdate( contactId , contactUpdate);
  }
};