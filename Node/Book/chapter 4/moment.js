console.log("Date : ");
var now = new Date();
console.log('now is:', now);// get sections of time
var milliseconds = now.getMilliseconds();
var seconds = now.getSeconds();
var hours = now.getHours();
var minutes = now.getMinutes();
var date = now.getDate();
var month = now.getMonth();
var year = now.getFullYear();
var dateCopy = new Date(year, month, date,hours,minutes, seconds, milliseconds);
console.log('copy is:', dateCopy);// Other dates// year, month, date
console.log('1 jan 2014:', new Date(2014, 0, 1));// year, month, date, hour
console.log('1 jan 2014 9am', new Date(2014, 0, 1, 9));

console.log("Moment : ");
var moment = require('moment');// From date to moment
var wrapped = moment(new Date());
console.log(wrapped);// From moment to date
var date = wrapped.toDate();
console.log(date);

// From string to date
console.log("Date to string : ");
console.log(moment("12-25-1995", "MM-DD-YYYY").toDate());
console.log(moment("2010-10-20 4:30", "YYYY-MM-DD HH:mm").toDate());

//Colors
console.log("Colors : ");

require('colors');console.log('hello'.green); // outputs green 
console.log('world!'.red); // outputs red text
console.log('Feeling yellow'.yellow);// outputs yellow text
console.log('But you look blue'.blue);// outputs yellow text
console.log('This should cheer you up!'.rainbow); // rainbow