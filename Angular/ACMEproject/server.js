const express = require('express');
const app = express();
const path = require('path');

app.use(express.static(__dirname + '/dist/ecmaproject/'));

app.get('/*', function(req, res) {
    res.setHeader('Last-Modified', (new Date()).toUTCString());
    res.sendFile('index.html', {root: 'dist/ecmaproject/'}
);
});

app.disable('ETag');

app.listen(process.env.PORT || 4300);

console.log('server started ' + __dirname);