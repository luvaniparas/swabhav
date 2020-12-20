const express = require('express');  
const swaggerJsDoc = require("swagger-jsdoc");
const swaggerUi = require("swagger-ui-express");
const bodyParser = require("body-parser");
const contactController = require("./contactController");

const app = express();
const contactControllerObj = new contactController();

app.use(bodyParser.urlencoded({ extended : true  }));
app.use(bodyParser.json());

const swaggerOptions = {
    swaggerDefinition: {
      info: {
        version: "1.0.0",
        title: "Contact-Modular-Application",
        description: "Contact API Information",
        contact: {
          name: "Paras Luvani"
        },
        servers: ["http://localhost:3000"]
      }
    },
    apis: ["contactController.js"]
  };

  const swaggerDocs = swaggerJsDoc(swaggerOptions);
  app.use("/api-docs",swaggerUi.serve,swaggerUi.setup(swaggerDocs)); 

  app.get('/contact', contactControllerObj.getContacts);
  app.get('/contact/:id', contactControllerObj.getContactById);
  app.post('/contact', contactControllerObj.addContact);

  app.listen(3000, function(req,res){
    console.log("Running ... ");
  });