const express = require('express');  
const app = express();
const swaggerJsDoc = require("swagger-jsdoc");
const swaggerUi = require("swagger-ui-express");

const swaggerOptions = {
  swaggerDefinition: {
    info: {
      version: "1.0.0",
      title: "Contact API",
      description: "Contact API Information",
      contact: {
        name: "Paras Luvani"
      },
      servers: ["http://localhost:3000"]
    }
  },
  apis: ["server.js"]
};

  let contacts = [
    { name: "Paras", id: 1 },
    { name: "Jayant", id: 2 },
    { name: "Kaushik", id: 3},
    { name: "Shailesh", id: 4},
  ];

    const swaggerDocs = swaggerJsDoc(swaggerOptions);
    app.use("/api-docs",swaggerUi.serve,swaggerUi.setup(swaggerDocs)); 

    /**
     * @swagger
     * /contact:
     *  get:
     *    description: Use to request all contact
     *    responses:
     *      '200':
     *        description: A successful response
     */
    app.get('/contact',function(req,res){
        console.log("/contact "+contacts);
        res.status(200).send(contacts);
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

    app.get('/contact/:id',function(req,res){
        let contact = contacts.find((contact) => {
                return contact.id == req.params.id ;
            }
        );
        console.log(contact);
        contact ? res.status(200).json(contact) : res.sendStatus(404);
    }); 
    
    app.listen(3000, function(req,res){
        console.log("Running ... ");
      });


  
  
 