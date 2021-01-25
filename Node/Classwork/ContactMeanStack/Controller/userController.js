const bcrypt = require("bcrypt");
const jwt = require('jsonwebtoken');
const userService = require("../Service/userService");
const userServiceObj = new userService();

module.exports = class userController{

    constructor(){}

    addUser = (req,res) => { 
       
        let user = {
            email : req.body.email,
            password : req.body.password
        }; 

        bcrypt.hash(user.password , 10 ,(err,hash) => {
            if(err){
                return res.status(500).json({
                    error : err
                });
            }else{
                const hashUser = {
                    email : user.email,
                    password : hash
                }
                userServiceObj.addContact(hashUser);  
                res.redirect('#/index.html');
            }
        });

    }

    findUser = (req,res) => {
        let user = {
            email : req.body.email,
            password : req.body.password
        }; 
        
        userServiceObj.findUser(user)
            .then( userFound => {

                bcrypt.compare(user.password,userFound[0].password,(err,result) => {
              
                    if(err){
                        console.log("Auth failed");
                    }

                    if(result){
                        const token = jwt.sign({
                            email : userFound[0].email,
                            userId : userFound[0]._id
                        }, process.env.JWT_KEY,
                        {
                            expiresIn : "1h"
                        });
                        
                        return res.status(200).json({
                            message : "Auth Successful",
                            token : token
                        })
                        
                    }

                })
            })
            .catch(err => {
                    console.log(err);
                })
        
    }

    deleteUser = (req,res) => {
        userServiceObj.deleteUser(req.Id); 
    }
}