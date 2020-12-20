const express = require('express');  
const app = express();
const contactService = require("./contactService");

class contactController{

    constructor(){    
    this.contactServiceObj = new contactService();

        /**
         * @swagger
         *
         * definitions:
         *   NewContact:
         *     type: object
         *     required:
         *       - id
         *       - name
         *     properties:
         *       id:
         *         type: number
         *       name:
         *         type: string
         *   Contact:
         *     allOf:
         *       - $ref: '#/definitions/NewContact'
         */

    }

    /**
     * @swagger
     * /contact:
     *  get:
     *    description: Use to request all contact
     *    responses:
     *      '200':
     *        description: A successful response
     */
    getContacts = (req, res) => {
        this.contactServiceObj.getContacts().then( contactList =>{ 
            contactList ? res.status(200).json(contactList) : res.status(404);
        })
        .catch(err => {
            console.log(err);
        })   
    }

    /**
     * @swagger
     * /contact/{id}:
     *  get:
     *    description: Use to request  specific contact
     *    parameters:
     *      - in : path
     *        name : id
     *        type : integer
     *        required : true
     *    responses:
     *      '200':
     *        description: A successful response
     */

     getContactById = (req,res) => {
        this.contactServiceObj.getContactByID(req.params.id).then( contact =>{
            contact ? res.status(200).json(contact) : res.sendStatus(404);
        })
        .catch(err => {
            console.log(err);
        }) 
     }
    

    /**
     * @swagger
     *
     * /contact:
     *   post:
     *     summary: Create a New Contact
     *     description: Creates a Contact
     *     produces:
     *       - application/json
     *     parameters:
     *       - name: contact
     *         description: contact object
     *         in:  body
     *         required: true
     *         type: string
     *         schema:
     *           $ref: '#/definitions/NewContact'
     *     responses:
     *       200:
     *         description: Contacts
     *         schema:
     *           $ref: '#/definitions/Contact'
     */

     addContact = (req,res) => {
         let contact = { 
             name : req.body.name,
             id : req.body.id
         }
        this.contactServiceObj.addContact(req.body.name, req.body.id);
	    res.status(201).json(contact);
     }
}
    module.exports = contactController ;

  
  
 