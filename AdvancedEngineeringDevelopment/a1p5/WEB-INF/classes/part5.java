import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Enumeration;

public class part5 extends HttpServlet{
	public void doGet(HttpServletRequest request,
	HttpServletResponse response)
	throws ServletException, IOException{
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
 String title = "Web Tools: Assignment 1 Part 5";
 String docType = "<!DOCTYPE HTML>\n";

 out.println(docType +
 "<HTML>\n" +
 "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
 "<BODY BGCOLOR=\"#AADDBB\">\n" +
 "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
 "<ul>\n" );

    Enumeration headerNames = request.getParameterNames();

 while(headerNames.hasMoreElements()) {

 Object obj = headerNames.nextElement();
 String param= (String)obj;
 String value = request.getParameter(param);
 out.println("<li>     " + param);
 out.println("  :   " + value + "</li>");
 }
 out.println("</ul>\n</BODY></HTML>");

    }

public void doPost(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
 doGet(request, response);
 }
} 
