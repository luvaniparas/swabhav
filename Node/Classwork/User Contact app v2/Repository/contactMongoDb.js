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

  async getContacts(id,numberToSkip,numberToReturn) {
    return await Contact.find(
      {_id : id},
      { contactList : { $slice : [numberToSkip,numberToReturn]}} 
    )
  }

  async searchContact(contactListId,attribute,value) {
    return await Contact.find(
      {_id : contactListId},
      { contactList : { $elemMatch : { [attribute] : value }} }
    );
  }

  async deleteContact(contactListId,contactId){
    return await Contact.updateOne(
      {_id : contactListId},
      {$pull : { contactList : { _id : contactId}}}
   )
  }

  async updateContact(contactListId,contactId,contact){
    let value = contact.name ;
    
    return await Contact.updateOne({
      _id : contactListId,
      contactList : { $elemMatch : { _id : contactId }}},
      {$set : { "contactList.$.name" : value }} 
   )
  }

  async getContactListSize(contactListId){
    return await Contact.findOne(
      {_id : contactListId}),
      {contactList : {$size}};
  }

  async getContactByIdRepo(id){
    return await Contact.find({ _id : id });
  }
};