const express = require('express');  
const swaggerJsDoc = require("swagger-jsdoc");
const bodyParser = require("body-parser");
const swaggerUi = require("swagger-ui-express");
const path = require("path");
const multer = require("multer");
const checkAuth = require("./middleware/checkAuth");
const contactController = require("./Controller/contactController");
const userController = require("./Controller/userController");

const contactControllerObj = new contactController();
const userControllerObj = new userController();

const app = express();

app.use(bodyParser.urlencoded({ extended : false  }));
app.use(bodyParser.json());

app.use(express.static(__dirname + 'Uploads'));

var storage = multer.diskStorage({
  destination: function (req, file, cb) {
    cb(null, './Uploads')
  },
  filename: function (req, file, cb) {
    cb(null, file.fieldname + '-' + path.extname(file.originalname));
  }
})

const fileFilter = (req, file, cb) => {
  // reject a file
  if (file.mimetype === 'image/jpeg' || file.mimetype === 'image/png') {
    cb(null, true);
  } else {
    cb(null, false);
  }
};

const upload = multer({
  storage: storage,
  limits: {
    fileSize: 1024 * 1024 * 3 
  },
  fileFilter: fileFilter
});

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
  app.use('/', express.static(path.join(__dirname, 'Public')));

  app.get("/", (req, res, next) => {
    res.sendFile(path.join(__dirname + "/public/index.html"));
  });

  app.get('/contacts', contactControllerObj.getContacts);
  app.get('/contact', contactControllerObj.searchContact);
  app.get('/contact/:id', contactControllerObj.getContactById);
  app.delete('/contact/:id',checkAuth, contactControllerObj.deleteContact);
  app.post('/contact',upload.single("file"),checkAuth,contactControllerObj.processContact,contactControllerObj.processImage,contactControllerObj.addContact);
  app.post('/contact/update',upload.single("file"),checkAuth,contactControllerObj.processContact,contactControllerObj.processImage,contactControllerObj.updateContact);
  
  app.post('/user/signUp',userControllerObj.addUser);
  app.post('/user/signIn',userControllerObj.findUser);

  app.listen(3000, function(req,res){
    console.log("App listening at http://localhost:3000/");
  });
