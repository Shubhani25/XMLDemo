
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Second extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=  response.getWriter();
		
		ServletConfig config = getServletConfig();
		String place = config.getInitParameter("meeting-place");
		String date = config.getInitParameter("meeting-date");
		
		out.println("<h1>Welcome form second</h1>");
		
		out.println("<h4>Meeting at : "+place+"</h4>");
		out.println("<h4>Meeting at : "+date+"</h4>");
		
		out.println("<a href=index.jsp>Home</a>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}