import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Enumeration;




public class part4 extends HttpServlet{
	public void doGet(HttpServletRequest request,
	HttpServletResponse response)
	throws ServletException, IOException{
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
out.println(
"<!DOCTYPE html>"+
"<html>"+
	"<head>"+
		"<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>"+
		"<title>"+
	 		"ASPCA-Pet Health Insurance"+	
	  	"</title>"+
	"</head>"+
	"<body>"+
	"<script type='text/javascript' src='sanity.js'>"+
	"</script>"+

	"<form action='part4' method='post' onsubmit='sanity()'>"+
	  "<div class='container'>"+	

		"<img src='Header.PNG' width='1202' >"+
		
  	
  		"<div class='row'>"+
  			
						  			"<div class='col-sm-6'>"+

										  	"<div class='form-group row'>"+
										    "<label class='col-sm-4 form-control-label'>Your Information</label>"+
										    "<label>"+
										    	"<input name='newaddress' type='checkbox' value='Yes'> Check here if this is a new address>"+
										  	"</label>"+	
										  	"</div>"+

										  	"<div class='form-group row'>"+
										    "<label class='col-sm-2 form-control-label'>Name:</label>"+
										      "<div class ='col-sm-8'><input name='name' type='text' class='form-control' id='name'></div>"+
										    "</div>"+

										  "<div class='form-group row'>"+
										    "<label class='col-sm-2 form-control-label'>Address:</label>"+
										     "<div class ='col-sm-8'> <input name='address' type='text' class='form-control' id='address'></div>"+
										  "</div>"+

										  "<div class='form-group row'>"+
										    "<label class='col-sm-2 form-control-label'>State, City, Zip:</label>"+
										    "<div class ='col-sm-8'>  <input name='state' type='text' class='form-control' id='state'></div>"+
										  "</div>"+

										  "<div class='form-group row'>"+
										    "<label class='col-sm-2 form-control-label'>Phone:</label>"+
										    "<div class ='col-sm-8'>   <input name='phone' type='text' class='form-control' id='phone'></div>"+
										    "</div>"+

										    "<div class='form-group row'>"+
										      "<label class='col-sm-2 form-control-label'>Email:</label>"+
										    "<div class ='col-sm-8'>   <input name='email' type='text' class='form-control' id='email' ></div>"+
										  "</div>"+
								"</div>"+	  

							"<div class='col-sm-6'>"+
								"<div class='form-group row'>"+
							    "<label class='col-sm-4 form-control-label'>Pet Information</label>"+
							  	"</div>"+

							  	"<div class='form-group row'>"+
							    "<label class='col-sm-2 form-control-label'>Account Number:</label>"+
							    "<div class ='col-sm-8'>  <input name='accountnumber' type='text' class='form-control' id='accountnumber'></div>"+
							    "</div>"+

							    "<div class='form-group row'>"+
							     "<label class='col-sm-2 form-control-label'>Name:</label>"+
							    "<div class ='col-sm-8'> <input name='petname' type='text' class='form-control' id='petname'></div>"+
							    "</div>"+

							    "<div class='form-group row'>"+
							     "<label class='col-sm-2 form-control-label'>Breed:</label>"+
							     "<div class ='col-sm-8'>  <input name='breed' type='text' class='form-control' id='breed'></div>"+
							    "</div>"+

							    "<div class='form-group row'>"+
							    "<label class='col-sm-2 form-control-label'>Age:</label>"+
							     "<div class ='col-sm-8'> <input name='age' type='text' class='form-control' id='age'></div>"+
							     "</div>"+
							     "<div class='form-group row'>"+
							      "<label class='col-sm-2 form-control-label'>Gender:</label>"+
							     "<div class ='col-sm-8'> <input name='gender' type='text' class='form-control' id='gender'></div>"+
							  "</div>"+

							"</div>"+	
	  "</div>"+	
  		"<img src='Second.PNG' width='1200' >"+
	
	 

	  "<fieldset class='form-group'>"+
    "<label>Story of Occurrence/Diagnosis - Please describe this incident, including dates, details and symptoms leading up to it</label>"+
    "<input name='describe' type='text' class='form-control' id='describe'/>"+
 	 "</fieldset>"+

 	 "<div class='row'>"+
  			
  			"<div class='col-sm-6'>"+

				  	"<div class='form-group row'>"+
				    "<label class='col-sm-4 form-control-label'>This claim is related to:</label>"+
				    "<label class='checkbox-inline'>"+
  				"<input name='relateto' type='checkbox' value='Accident' > Accident"+
			"</label>"+
			"<label class='checkbox-inline'>"+
  			"<input name='relateto' type='checkbox' value='Illness'> Illness"+
			"</label>"+
			"<label class='checkbox-inline'>"+
 			 "<input name='relateto' type='checkbox' value='Wellness'> Wellness"+
			"</label>"+	
				  	"</div>"+


				  	"<div class='form-group row'>"+
				    "<label class='col-sm-4 form-control-label'>Is this claim an estimate for future treatment?</label>"+
				      "<div class ='col-sm-8'>"+
				      	 "<label class='checkbox-inline'>"+
  				"<input name='estimateforfuture' type='checkbox' value='Yes'> Yes"+
			"</label>"+
			"<label class='checkbox-inline'>"+
  			"<input name='estimateforfuture' type='checkbox' value='No'> No"+
			"</label></div>"+
				    "</div>"+


				  "<div class='form-group row'>"+
				   " <label class='col-sm-4 form-control-label'>Total amount claimed:</label>"+
				     "<div class ='col-sm-8'> <input name='amountclaimed' type='text' class='form-control' id='amountclaimed'></div>"+
				  "</div>"+

				  "<div class='form-group row'>"+
				    "<label class='col-sm-4 form-control-label'>Date illness/injury first occurred:</label>"+
				    "<div class ='col-sm-8'>  <input name='dateofoccurrence' type='text' class='form-control' id='dateofoccurrence'></div>"+
				  "</div>"+

				  "<div class='form-group row'>"+
				    "<label class='col-sm-4 form-control-label'>Send payment to:</label>"+
				    "<div class ='col-sm-8'> "+   
				    "<label class='checkbox-inline'>"+
  				"<input name='payment' type='checkbox' value='Me'> Me"+
			"</label>"+
			"<label class='checkbox-inline'>"+
  			"<input name='payment' type='checkbox' value='Veterinarian'> Veterinarian"+
			"</label></div>"+
				    "</div>"+

				    
		"</div>	"+	  

		"<div class='col-sm-6'>"+
			"<div class='form-group row'>"+
		    "<label class='col-sm-2 form-control-label'>Veterinarian:</label>"+
		    		    "<div class ='col-sm-8'>  <input name='vetname' type='text' class='form-control' id='vetname'>"+
		    		    	"</div>"+
		  	"</div>"+

		  	"<div class='form-group row'>"+
		    "<label class='col-sm-2 form-control-label'>Clinic name:</label>"+
		    "<div class ='col-sm-8'>  <input name='clinicname' type='text' class='form-control' id='clinicname'></div>"+
		    "</div>"+

		    "<div class='form-group row'>"+
		     "<label class='col-sm-2 form-control-label'>Phone:</label>"+
		     "<div class ='col-sm-8'> <input name='vetphone' type='text' class='form-control' id='vetphone'></div>"+
		    "</div>"+

		    "<div class='form-group row'>"+
		     "<label class='col-sm-2 form-control-label'>Fax:</label>"+
		     "<div class ='col-sm-8'>  <input name='fax' type='text' class='form-control' id='fax'></div>"+
		    "</div>"+

		    "<div class='form-group row'>"+
		    "<label class='col-sm-4 form-control-label'>Did any other veterinarian treat your pet?:</label>"+
		     "<div class ='col-sm-8'>"+
		      "<label class='checkbox-inline'>"+
  				"<input name='othervet' type='checkbox' value='Yes'> Yes"+
			"</label>"+
			"<label class='checkbox-inline'>"+
  			"<input name='othervet' type='checkbox' value='No'> No"+
			"</label>"+
		"</div>"+
		     "</div>"+

		     "<div class='form-group row'>"+
		      "<label class='col-sm-4 form-control-label'>Is this a new condition?: </label>"+
		     "<div class ='col-sm-8'> <label class='checkbox-inline'>"+
  				"<input name='newcondition' type='checkbox' value='Yes'> Yes"+
			"</label>"+
			"<label class='checkbox-inline'>"+
  			"<input name='newcondition' type='checkbox' value='No'> No"+
			"</label></div>"+
		  "</div>"+

		"</div>"+	
	  "</div>"+

 	  "<img src='three.PNG' width='1208' >"+

		"<div class='row'>"+
  			
  			"<div class='col-sm-6'>"+

				  	"<div class='form-group row'>"+
				    "<label class='col-sm-4 form-control-label'>Signature of Pet Owner:</label>"+
				    "<div class ='col-sm-8'> <input name='signature' type='text' class='form-control' id='signature'></div>	"+
				  	"</div>"+
				  	"</div>"+

				  	"<div class='col-sm-6'>"+
				  	"<div class='form-group row'>"+
				    "<label class='col-sm-6 form-control-label'> Date:</label>"+
				    "<div class ='col-sm-4'> <input name='date' type='text' class='form-control' id='date'></div>"+	
				  	"</div>"+
				  	"</div>"+

					"<img src='End.PNG' width='1200' >"+

		"</div>"+

			"<input type='submit' value='Submit'>"+
	"</div>	"+	
"</form>"+

"</body>"+
"</html>");

		

}




public void doPost(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
 

	response.setContentType("text/html");
	PrintWriter out = response.getWriter();


		out.println("<html>");
		out.println("<head>");
		out.println("<title>Web Tools: Assignment 1 Part 4</title>");
		out.println("</head>");
		out.println("<body>");
		
		
		out.println("Your Information <br/><br/>");
		out.println("New Address: "+request.getParameter("newaddress")+"<br/>");
		out.println("Name: "+request.getParameter("name")+"<br/>");
		out.println("Address: "+request.getParameter("address")+"<br/>");
		out.println("State, City, Zip: "+request.getParameter("state")+"<br/>");
		out.println("Phone: "+request.getParameter("phone")+"<br/>");
		out.println("Email: "+request.getParameter("email")+"<br/>");

		out.println("Pet Information: <br/>");
		out.println("Account Number: "+request.getParameter("accountnumber")+"<br/>");
		out.println("Name: "+request.getParameter("petname")+"<br/>");
		out.println("Breed: "+request.getParameter("breed")+"<br/>");
		out.println("Age: "+request.getParameter("age")+"<br/>");
		out.println("Gender: "+request.getParameter("gender")+"<br/><br/>");

		out.println("Story of Occurrence/Diagnosis: "+request.getParameter("describe")+"<br/>");
		out.println("This claim is related to: "+request.getParameter("relateto")+"<br/>");
		out.println("Is this claim an estimate for future treatment?"+request.getParameter("estimateforfuture")+"<br/>");
		out.println("Total amount claimed: "+request.getParameter("amountclaimed")+"<br/>");
		out.println("Date illness/injury first occurred: "+request.getParameter("dateofoccurrence")+"<br/>");
		out.println("Send payment to: "+request.getParameter("payment")+"<br/>");

		out.println("Veterinarian: "+request.getParameter("vetname")+"<br/>");
		out.println("Clinic name: "+request.getParameter("clinicname")+"<br/>");
		out.println("Phone: "+request.getParameter("vetphone")+"<br/>");
		out.println("Fax:"+request.getParameter("fax")+"<br/>");
		out.println("Did any other veterinarian treat your pet?: "+request.getParameter("othervet")+"<br/>");
		out.println("Is this a new condition?: "+request.getParameter("newcondition")+"<br/>");

		out.println("Signature of Pet Owner: "+request.getParameter("signature")+"<br/>");
		out.println("Date: "+request.getParameter("date")+"<br/>");

		
		out.println("</body>");
		out.println("</html>");


 }
 
}