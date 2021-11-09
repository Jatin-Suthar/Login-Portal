package primaryPackage;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SuccessServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<h2> this is success servlet </h2>");
		out.println("<p> Successfully working </p>");
	}
}
