const mongoose = require('mongoose');

var userContactSchema = new mongoose.Schema({
    user : {
        email : {
            type : String ,
            required : true ,
            unique : true ,
            match : /[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?/
        },
        password : { type : String , required : true }
    },

    contact : [{
        name : String,
        number : Number,
        image : { 
            data: Buffer, 
            contentType: String 
        },
        address : [{
            state : String,
            city : String,
            pincode : String,
            roomNumber : String ,
            buildingName : String
        }]
    }]

});

module.exports = mongoose.model("userContact", userContactSchema);