
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class lab2 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Cookie[] cookies = request.getCookies();
		String userName = "";
		String comments = "";

		if(cookies!=null){

			for(int i=0;i<cookies.length;i++){

				Cookie c = cookies[i];
				String name = c.getName();

				if (name.equals("userName")){

					userName=c.getValue();
				}


				if(name.equals("cookieComments")){

					comments=c.getValue();
				}


			}

		}

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Lab2</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action='lab2' method='post'>");
		out.println("Name:<input type ='text' name='userName' value='"+userName+"'/><br/><br/>");
		out.println("Comments:<textarea rows='5' cols='20' name='comments'>"+comments+"</textarea><br/><br/>");
		out.println("Contact me:<input type='radio' name='contact' value='Yes'>Yes<input type='radio' name='contact' value='No'>No<br/><br/>");
		out.println("<input type='checkbox' name='rememberMe' value='yes'>Remember Me<br/>");
		out.println("<input type='submit' value='submit'>");
		out.println("</body>");
		out.println("</html>");

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{


		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Lab2</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Name: "+request.getParameter("userName")+"<br/>");
		out.println("Comments: "+request.getParameter("comments")+"<br/>");
		out.println("Contact: "+request.getParameter("contact")+"<br/>");
		out.println("</body>");
		out.println("</html>");


		if(request.getParameter("rememberMe").equals("yes")){

			//creating cookie objects
			Cookie cookieName = new Cookie("userName",request.getParameter("userName"));
			Cookie cookieComments = new Cookie("cookieComments",request.getParameter("comments"));
			Cookie cookieContacts = new Cookie("cookieContacts",request.getParameter("contact"));

			//adding cookie objects to response
			response.addCookie(cookieName);
			response.addCookie(cookieComments);
			response.addCookie(cookieContacts);

		}


	}

}