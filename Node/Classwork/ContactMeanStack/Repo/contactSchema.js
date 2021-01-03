const mongoose = require('mongoose');

var contactSchema = new mongoose.Schema({
    name: String,
    number : Number,
    pinCode : String,
    address : {
        state : String,
        city : String,
        roomNumber : String ,
        buildingName : String,
        street : String
    },
    image : { 
      data: Buffer, 
      contentType: String 
   }
  });

module.exports = mongoose.model("Contact", contactSchema);
