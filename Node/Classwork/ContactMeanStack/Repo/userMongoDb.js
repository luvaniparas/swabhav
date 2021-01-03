const mongoose = require("mongoose");
const User = require("./userSchema");
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
        return new User(newUser).save();
    }

    async findUser(user){
        return await User.find({ email : user.email });
    }

    async deleteUser(userId){
        return await User.deleteOne({_id : userId});
    }
}

        