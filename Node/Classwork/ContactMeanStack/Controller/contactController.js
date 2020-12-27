const express = require('express');  
const app = express();
const contactService = require("../Service/contactService");

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
     * /contacts:
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
     * /contact:
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

     searchContact = (req,res) => {
        this.contactServiceObj.serachContact(req.query.selectedAttribute,req.query.searchValue).then( contact =>{
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
        this.contactServiceObj.addContact(req.body);
	    res.status(201).json(req.body);
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
     * /contact/{id}:
     *  delete:
     *    description: Use to delete specific contact
     *    parameters:
     *      - in : path
     *        name : id
     *        type : integer
     *        required : true
     *    responses:
     *      '200':
     *        description: A successful response
     */
    deleteContact = (req,res) => {
        this.contactServiceObj.deleteContact(req.params.id)
        res.status(201).json(req.body);
    }

     /**
     * @swagger
     *
     * /contact:
     *   put:
     *     summary: Update a Contact
     *     description: Update a Contact
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
    updateContact = (res,req) => {
        console.log("Inside Controller Update : ");
        console.log("Body : "+req.body);
        console.log("params : "+req.params.id);
        console.log("query : "+req.query);
        
        //this.contactServiceObj.updateContact(req.body);
        //res.status(201).json(req.body);
    }

}

module.exports = contactController ;

  
  
 