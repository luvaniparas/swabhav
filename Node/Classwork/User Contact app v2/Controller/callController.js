const accountSid = process.env.TWILIO_ACCOUNT_SID;
const authToken = process.env.TWILIO_AUTH_TOKEN;
const client = require('twilio')(accountSid, authToken);
const  indiaCountryCode = "+91" ;

class callController{
    constructor(){} 

    connectCall = async(req,res) => {
        let numberToConnect = indiaCountryCode + JSON.stringify(req.params.number);
        
        client.calls
          .create({
             url : 'http://demo.twilio.com/docs/voice.xml',
             to : numberToConnect,
             from : process.env.TWILIO_PHONE_NUMBER,
             statusCallback : 'https://coffee-elk-4472.twil.io/status-callback',
             statusCallbackMethod : 'POST',
             statusCallbackEvent : ['initiated','riniging','answered','completed']  
           }).then(call => 
                    console.log("call : "+call)
                    //res.send(call)
                );
    }

    callHistory = async(req,res) => {
        client.calls.list({limit: 20})
            .then(calls => 
                res.send(calls)
            );
    }

    callDetails = async(req,res) => {

        let numberToConnect = indiaCountryCode + JSON.stringify(req.params.number);

        client.calls
            .create({
                method: 'GET',
                statusCallback: 'https://www.myapp.com/events',
                statusCallbackMethod: 'POST',
                url: 'http://demo.twilio.com/docs/voice.xml',
                to: numberToConnect,
                from: process.env.TWILIO_PHONE_NUMBER
            })
            .then(call => console.log(call));
    } 

    hangUpCall = (req,res) => {
        console.log("Inside controller hangUpCall() ");
        let sid = JSON.stringify(req.params.sid);
        console.log("SID : "+sid);
        console.log("type : "+typeof(sid));

        client.calls(sid)
            .update({status: 'completed'})
            .then(call => console.log(call.to));
    }
}
module.exports = callController;