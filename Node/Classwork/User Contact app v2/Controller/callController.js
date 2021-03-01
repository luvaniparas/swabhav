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
             url : 'http://ece49723d68a.ngrok.io/call',
             to : numberToConnect,
             from : process.env.TWILIO_PHONE_NUMBER,
             statusCallback : 'http://ece49723d68a.ngrok.io/callStatus',
             statusCallbackMethod : 'POST',
             statusCallbackEvent : ['initiated','riniging','answered','completed']  
           }).then(call => 
                res.send(call)
            )
    };

    callHistory = async(req,res) => {
        client.calls.list({limit: 20})
            .then(calls => 
                res.send(calls)
            );
    }

    hangUpCall = (req,res) => {
        let sid = req.params.sid ;
        
        client.calls(sid)
            .update({status: 'completed'})
            .then(call => 
                res.send(call)
            );
    }

    callStatus =async(req,res) => {
        let callStatus = req.body.CallStatus;
    
        console.log("status : "+callStatus);
        //res.render(__dirname + "/Public/contactList.html", {status:callStatus});
        res.send(callStatus);
    }
}
module.exports = callController;
