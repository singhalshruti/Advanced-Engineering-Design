import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class part3 extends HttpServlet{
	public void doGet(HttpServletRequest request,
	HttpServletResponse response)
	throws ServletException, IOException{
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Web Tools: Assignment 1 Part 3</title>");
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


public void doPost(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
 doGet(request, response);
 }
 
}