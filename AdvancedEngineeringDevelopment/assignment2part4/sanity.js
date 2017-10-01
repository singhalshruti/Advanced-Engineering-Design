function sanity(){
	alert("Hello!");


var alphabet=/[^a-zA-Z]/g;
var num=/[^\d+]/g;
var mail=/[^a-zA-Z\d@/.]/g;
var oth=/[^a-zA-Z\d/.]/g;

var name = document.getElementById("name").value;
var sname = name.replace(alphabet," ");
document.getElementById("name").value=sname;

var address = document.getElementById("address").value;
var saddress = address.replace(oth," ");
document.getElementById("address").value=saddress;

var state = document.getElementById("state").value;
var sstate = state.replace(oth," ");
document.getElementById("state").value=sstate;


var phone = document.getElementById("phone").value;
var sphone = phone.replace(num," ");
document.getElementById("phone").value=sphone;


var email = document.getElementById("email").value;
var semail = email.replace(mail," ");
document.getElementById("email").value=semail;

var accountnumber = document.getElementById("accountnumber").value;
var saccountnumber = accountnumber.replace(num," ");
document.getElementById("accountnumber").value=saccountnumber;

var petname = document.getElementById("petname").value;
var spetname = petname.replace(alphabet," ");
document.getElementById("petname").value=spetname;

var breed = document.getElementById("breed").value;
var sbreed = breed.replace(alphabet," ");
document.getElementById("breed").value=sbreed;

var age = document.getElementById("age").value;
var sage = age.replace(num," ");
document.getElementById("age").value=sage;

var gender = document.getElementById("gender").value;
var sgender = gender.replace(alphabet," ");
document.getElementById("gender").value=sgender;

var describe = document.getElementById("describe").value;
var sdescribe = describe.replace(oth," ");
document.getElementById("describe").value=sdescribe;

var amountclaimed = document.getElementById("amountclaimed").value;
var samountclaimed = amountclaimed.replace(num," ");
document.getElementById("amountclaimed").value=samountclaimed;

var dateofoccurrence = document.getElementById("dateofoccurrence").value;
var sdateofoccurrence = dateofoccurrence.replace(oth," ");
document.getElementById("dateofoccurrence").value=sdateofoccurrence;

var vetname = document.getElementById("vetname").value;
var svetname = vetname.replace(alphabet," ");
document.getElementById("vetname").value=svetname;

var clinicname = document.getElementById("clinicname").value;
var sclinicname = clinicname.replace(alphabet," ");
document.getElementById("clinicname").value=sclinicname;

var vetphone = document.getElementById("vetphone").value;
var svetphone = vetphone.replace(num," ");
document.getElementById("vetphone").value=svetphone;

var fax = document.getElementById("fax").value;
var sfax = fax.replace(num," ");
document.getElementById("fax").value=sfax;

var signature = document.getElementById("signature").value;
var ssignature = signature.replace(alphabet," ");
document.getElementById("signature").value=ssignature;

var date = document.getElementById("date").value;
var sdate = date.replace(oth," ");
document.getElementById("date").value=sdate;

}