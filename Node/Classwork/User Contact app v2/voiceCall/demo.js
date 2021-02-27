// require('dotenv').config();
// console.log("JWT_KEY : "+process.env.JWT_KEY);
// console.log("process.env.TWILIO_ACCOUNT_SID : "+process.env.TWILIO_ACCOUNT_SID);
// "TWILIO_ACCOUNT_SID":"AC1a875b8066f2d016f546803115d78492",
// "TWILIO_AUTH_TOKEN":"f0b6ec95ba87c9d0dfe7c988acf166e6",
// "MY_PHONE_NUMBER":"+919699290770"

const accountSid = "AC1a875b8066f2d016f546803115d78492";
const authToken = "f0b6ec95ba87c9d0dfe7c988acf166e6";
const client = require('twilio')(accountSid, authToken);

client.calls
      .create({
         url: 'http://demo.twilio.com/docs/voice.xml',
         to: "+919699290770",
         from: '+14024137605'
       }).then(call => console.log(call));
     
    //    function(err,call) {
    //     if(err){
    //          console.log("Inside error");
    //          console.log(err);
    //     } else{
    //          console.log("Inside call");
    //          console.log(call);
    //          //return res.status(200).json(call);
    //     }
    // }