const { RSA_PKCS1_OAEP_PADDING } = require('constants');
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
    getContacts = async (req, res) => {
        let id = req.query.contactListId;
        let pageNumber = (JSON.parse(req.query.pageNumber) - 1)*JSON.parse(req.query.pageSize);
        let pageSize = JSON.parse(req.query.pageSize);

        this.contactServiceObj.getContacts(id,pageNumber,pageSize).then( contactList =>{ 
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
         
        let id = req.query.contactListId;
        let object = req.query.searchContactObj;
        let searchObject = JSON.parse(object);

        this.contactServiceObj.serachContact(id,searchObject.selectedAttribute,searchObject.searchValue).then( contact =>{
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
    addContact = async (req,res) => {   
        let id = req.query.contactListId;

        await this.contactServiceObj.addContact(id,req.body);
        res.redirect('/index.html');
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
        this.contactServiceObj.deleteContact(req.query.id,req.params.id);
        res.status(201).json(req.body);
    }

    updateContact = (req,res) => {
       
        this.contactServiceObj.updateContact(req.query.contactListId,req.query.contactId,req.body);
        res.redirect('/index.html');
    }

    processContact = (req, res, next) => {
        delete req.body.file;

        for (let property in req.body) {
           req.body[property] = JSON.parse(req.body[property]);
        } 
        next();
	};
	
	processImage = (req, res, next) => {
      
		if (req.file) {
			req.body.image = {
				data: new Buffer.from(fs.readFileSync(req.file.path).toString('base64'), 'base64'),
				contentType: req.file.mimetype,
			};
        }
		next();
	};
    
    createContacList = async (req,res,next) => {
        let contact = [] ;
        return await this.contactServiceObj.createContactList(contact);
    };
}
module.exports = contactController ;