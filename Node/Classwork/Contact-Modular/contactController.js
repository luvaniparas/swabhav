const express = require('express');  
const app = express();
const contactService = require("./contactService");

let contactServiceObj = new contactService();

    /**
     * @swagger
     * /contact:
     *  get:
     *    description: Use to request all contact
     *    responses:
     *      '200':
     *        description: A successful response
     */
    app.get('/',function(req,res){
        let contacts = contactServiceObj.getContacts()
        res.status(200).json(contacts);
    }); 

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

    app.get('/:id',function(req,res){

        let contact = contactServiceObj.findContactWithID(req.params.id);
        contact ? res.status(200).json(contact) : res.sendStatus(404);

    }); 

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

app.post("/", function (req, res) {
    //console.log("Controller ID : "+req.body.id+" Name : "+req.body.name);
    let contact = contactServiceObj.addContact(req.body.name, req.body.id);
	res.status(201).json(contact);
});

    module.exports = app ;

  
  
 