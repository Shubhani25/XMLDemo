

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class First extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=  response.getWriter();
		
		ServletConfig config =  getServletConfig();
		String name = config.getInitParameter("admin-name");
		String mobile = config.getInitParameter("admin-mobile");
		
		out.println("<h1>Welcome form first</h1>");
		
		out.println("<h5>"+name+"</h5>");
		out.println("<h5>"+mobile+"</h5>");
		
		out.println("<a href=index.jsp>Home</a>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
