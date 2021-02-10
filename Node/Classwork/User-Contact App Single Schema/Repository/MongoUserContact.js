const mongoose = require("mongoose");
const userContact = require("./SchemaUserContact");
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

    async addUserAndContact(userContact){
        return new userContact(userContact).save();        
    }

    // async updateUserAndContact(user){
        
    // }

    // async deleteUserAndContact(user){
        
    // }

}