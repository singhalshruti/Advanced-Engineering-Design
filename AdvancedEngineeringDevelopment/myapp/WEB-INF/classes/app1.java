
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class app1 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)  throws IOException{
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<HTML><HEAD><TITLE> my app 1</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY> Method Type:"+request.getMethod());
		out.println("<BR> Servlet path:"+request.getServletPath());
		out.println("</BODY></HTML>");
		
		
	}

}