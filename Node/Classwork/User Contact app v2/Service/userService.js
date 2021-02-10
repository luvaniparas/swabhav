const userRepo = require("../Repository/userMongoDb");
const userRepoObj = new userRepo();

module.exports = class userService{

    constructor(){}

    addContact(user){
        userRepoObj.addUser(user);   
    }

    findUser(user){
        return userRepoObj.findUser(user);
    }

    deleteUser(userId){
        return userRepoObj.deleteUser(userId);
    }

}

