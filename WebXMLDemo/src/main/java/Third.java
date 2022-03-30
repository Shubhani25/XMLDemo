
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Third extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=  response.getWriter();
		
		ServletConfig config = getServletConfig();
		String necessities = config.getInitParameter("NecessitiesToBeTakenCare");
		String vaccination = config.getInitParameter("VaccinatedOrNot?");
		
		out.println("<h1>Welcome form third</h1>");
		out.println("<h5>Basic Necessities to be taken care of "+necessities+"</h5>");
		out.println("<h5>Are You Completely Vaccinated?"+vaccination+"</h5>");
		out.println("<a href=index.jsp>Home</a>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}