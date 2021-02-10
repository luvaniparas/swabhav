const bcrypt = require("bcrypt");
const jwt = require('jsonwebtoken');
const userService = require("../Service/userService");
const userServiceObj = new userService();

const contact = require("../Controller/contactController");
const contactController = new contact();

module.exports = class userController{

    constructor(){}

    addUser = async (req,res) => { 
       
        let contactListId = await contactController.createContacList();
        
        let user = {
            email : req.body.email,
            password : req.body.password,
            contactListId : contactListId
        }; 

        bcrypt.hash(user.password , 10 ,(err,hash) => {
            if(err){
                return res.status(500).json({
                    error : err
                });
            }else{
                const hashUser = {
                    email : user.email,
                    password : hash,
                    contactListId : contactListId
                }
                userServiceObj.addContact(hashUser);  

                return res.status(200).json(contactListId);
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
                            loggedinUserEmail : userFound[0].email,
                            contactListId : userFound[0].contactListId,
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