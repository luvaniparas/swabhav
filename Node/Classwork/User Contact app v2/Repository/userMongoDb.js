const mongoose = require("mongoose");
const user = require("./userSchema");
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

    async addUser(newUser){
        return new user(newUser).save();
    }

    async findUser(findUser){
        return await user.find({ email : findUser.email });
    }

    async deleteUser(userId){
        return await user.deleteOne({_id : userId});
    }
}

        