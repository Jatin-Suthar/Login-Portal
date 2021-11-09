package primaryPackage;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
//import jakarta.servlet.annotation.*;

public class Servlet1 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<h1> Welcome to my servlet </h1>");

		String name = req.getParameter("user_name");
		String pass = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		
		String condition = req.getParameter("condition");
		if(condition!=null) {
			if(condition.equals("checked")) {
				out.println("<h2>" + name + "</h2>");
				out.println("<h2>" + pass + "</h2>");
				out.println("<h2>" + email + "</h2>");
				out.println("<h2>" + gender + "</h2>");
				out.println("<h2>" + course + "</h2>");
				
				RequestDispatcher rd = req.getRequestDispatcher("success");
				rd.forward(req, res);
			}else {
				out.println("<h2> Please check all the details and fill the checkbox </h2>");
			}
		}else {
			out.println("<h2> Please check all the details and fill the checkbox </h2>");
			
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
	}
}
