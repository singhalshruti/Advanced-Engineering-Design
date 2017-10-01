import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class part4 extends HttpServlet{
	public void doGet(HttpServletRequest request,
	HttpServletResponse response)
	throws ServletException, IOException{
	
	Map<String, String[]> map = request.getParameterMap();
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	

		out.print("<html><body>");
        out.println("<table border=\"1\" cellpadding = \"5\"" + 
                " cellspacing = \"5\">");
        out.println("<tr> <th>Parameter Name</th>" + 
                "<th>Parameter Value</th></tr>");
    
        Set set = map.entrySet();
        Iterator it = set.iterator();
    
        while (it.hasNext()) {
            Map.Entry<String, String[]> entry = 
                (Entry<String, String[]>) it.next();
            String paramName = entry.getKey();
            out.print("<tr><td>" + paramName + "</td><td>");
            String[] paramValues = entry.getValue();
            if (paramValues.length == 1) {
                String paramValue = paramValues[0];
                if (paramValue.length() == 0)
                    out.println("<b>No Value</b>");
                else
                    out.println(paramValue);
            } else {
                out.println("<ul>");
                for (int i = 0; i < paramValues.length; i++) {
                    out.println("<li>" + paramValues[i] + "</li>");
                }
                out.println("</ul>");
            }
            out.print("</td></tr>");
        }
        out.println("</table></body></html>");
    }

public void doPost(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
 doGet(request, response);
 }
} 
