const express = require('express');  
const app = express();
var fs = require('fs');
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

        console.log("Controller add ");

        let contact = {
            name: req.body.name,
            number : req.body.number,
            pinCode : req.body.pinCode,
            address : {
                state : req.body.state,
                city : req.body.city,
                roomNumber : req.body.roomNumber ,
                buildingName : req.body.buildingName,
                street : req.body.street
            },
            image : { 
              data: new Buffer.from(fs.readFileSync(req.file.path).toString('base64'), 'base64'),
              contentType: req.file.mimetype 
           }
          }
        
        this.contactServiceObj.addContact(contact);
        res.redirect('#/index.html');
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

    deleteContact = (req,res) => {
        this.contactServiceObj.deleteContact(req.params.id)
        res.status(201).json(req.body);
    }

    updateContact = (req,res) => {
        let id = req.body._id;
        
        // delete req.body.file;
        // delete req.body._id;

        // for (let property in req.body) {
		//   	req.body[property] = JSON.parse(req.body[property]);
        // }
        
        this.contactServiceObj.updateContact(id,req.body);
        res.redirect('#/index.html');
        //res.status(201).json(req.body);
    }

    processContact = (req, res, next) => {
        delete req.body.file;
        delete req.body._id;

		for (let property in req.body) {
		  	req.body[property] = JSON.parse(req.body[property]);
		}
		delete req.body.$$hashKey;
		next();
	};
	
	processImage = (req, res, next) => {
		if (req.file) {
			req.body.imageSrc = {
				imgData: new Buffer.from(fs.readFileSync(req.file.path).toString('base64'), 'base64'),
				contentType: req.file.mimetype,
			};
		}
		next();
	};
    
}



module.exports = contactController ;