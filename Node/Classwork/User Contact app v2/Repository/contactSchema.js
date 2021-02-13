const mongoose = require('mongoose');

var contactSchema = new mongoose.Schema({
  
  contactList : [{
        name : String,
        number : Number,
        city : String,
        state : String,
        zip : String,
        address :[String],
        image : { 
          data : Buffer, 
          contentType : String 
        }
  }]

});

module.exports = mongoose.model("contact", contactSchema);