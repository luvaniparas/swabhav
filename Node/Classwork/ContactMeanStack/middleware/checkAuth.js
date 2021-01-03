const jwt = require('jsonwebtoken');

module.exports = (req,res,next) => {
    
    try{
        console.log("Inside chechAuth : ");

        const token = req.headers.authorization.split(" ")[1];
        console.log("ChechAuth Token : "+token);

        const decoded = jwt.verify(token,process.env.JWT_KEY);
        console.log("ChechAuth decoded : "+decoded);

        req.userData = decoded ; 
        next();
    }catch(error){

        return res.status(401).json({
            message : "Auth Failed"
        });

    }    
};