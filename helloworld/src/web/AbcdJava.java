package web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AbcdJava extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Hello you clicked abcdlink ?");
	response.getWriter().print("I know you clicked it");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		Date date=new Date();
		if(date.getHours()>12) {
			resp.getWriter().print("Hello Mr "+name+",, Good Afternoon");	
		}
		else
		{
			resp.getWriter().print("Hello Mr "+name+",, Good morning");	
		}
	
	}

}
