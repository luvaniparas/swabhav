const express = require("express"),
  bodyParser = require("body-parser"),
  swaggerJsdoc = require("swagger-jsdoc"),
  swaggerUi = require("swagger-ui-express");

  let app = express() ;

  app.use(bodyParser.urlencoded({ extended : true  }));
  app.use(bodyParser.json());

  const options = {
    definition: {
      openapi: "3.0.0",
      info: {
        title: "MovieList Express API with Swagger",
        version: "0.1.0",
        description: "This is a simple CRUD API application made with Express and documented with Swagger",
        contact: {
          name: "Paras Luvani",
          email: "luvaniparas5@gmail.com",
        },
      },
      servers: [
        {
          url: "http://localhost:3000",
        },
      ],
    },
    apis: ["movieController.js"],
  };
  
  const specs = swaggerJsdoc(options);
  app.use("/api-docs",swaggerUi.serve,swaggerUi.setup(specs, { explorer: true }));

  app.use("/movieList", require("./movieController"));

  app.listen(3000, function(req,res){
    console.log("Running ... ");
  });