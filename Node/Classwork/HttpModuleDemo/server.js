const http = require('http');
const fs = require("fs");
const path = require("path");

let indexUrl = "./public/index.html";

http.createServer(function(request, response) {

    if(request.url === "/"){
        
        fs.readFile(indexUrl, function(err, data){
            response.writeHead(200, {'Content-Type': 'text/html'});
            response.write(data);
            response.end();
        });
        
     }else if(request.url.match("\.css$")){

        let cssPath = path.join(__dirname,'public',request.url);
        let fileStream = fs.createReadStream(cssPath,"UTF-8");
        response.writeHead(200,{'Content-Type': 'text/css'});
        fileStream.pipe(response);
     
    }else if(request.url.match("\.png$")){

        let imagePath = path.join(__dirname,'public',request.url);
        let fileStream = fs.createReadStream(imagePath);
        response.writeHead(200,{'Content-Type': 'image/png'});
        fileStream.pipe(response);
     
    }
     else{
        response.writeHead(200, {'Content-Type': 'text/html'});
        response.write('<b>Hey there!</b><br /><br />This is the default response. Requested URL is: ' + request.url);
        response.end();
     }

}).listen(3000);