import java.io.IOException;
import java.io.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import java.util.Enumeration;
/** Shows all the request headers sent on the current request. */
public class part2 extends HttpServlet {
	public void doGet(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();

 String title = "Web Tools: Assignment 1 Part 2";
 String docType = "<!DOCTYPE HTML>\n";

 out.println(docType +
 "<HTML>\n" +
 "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
 "<BODY BGCOLOR=\"#AADDBB\">\n" +
 "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
 "<ul>\n" );
 
 Enumeration headerNames = request.getHeaderNames();
 while(headerNames.hasMoreElements()) {
 String headerName = (String)headerNames.nextElement();
 out.println("<li>     " + headerName);
 out.println("  :   " + request.getHeader(headerName) + "</li>");
 }
 out.println("</ul>\n</BODY></HTML>");
 }
 /** Since this servlet is for debugging, have it
 * handle GET and POST identically.
 */

 public void doPost(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
 doGet(request, response);
 }
}
