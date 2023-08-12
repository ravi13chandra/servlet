package Operations;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class controller extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int a= Integer.parseInt(req.getParameter("first"));
		int b= Integer.parseInt(req.getParameter("Second"));
		int c=a+b;
		
		resp.getWriter().print(c);
		
		
		
	
	}
	

}
