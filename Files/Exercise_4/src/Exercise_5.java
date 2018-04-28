

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Exercise_5")
public class Exercise_5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Exercise_5() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		PrintWriter out = response.getWriter();
		
		out.println( sdf.format(cal.getTime()) + "</br>" );
		
		Enumeration<String> params = request.getParameterNames();
		String firstName = params.nextElement();
		String firstNameValue = request.getParameter(firstName);
		String lastName = params.nextElement();
		String lastNameValue = request.getParameter(lastName);
		String gender = params.nextElement();
		String genderValue = request.getParameter(gender);
		
		if(genderValue.equals("male"))
		{
			out.println("Welcome Mr. " + firstNameValue + " " + lastNameValue);
		}
		else
		{
			out.println("Welcome Miss. " + firstNameValue + " " + lastNameValue);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		PrintWriter out = response.getWriter();
		
		out.println( sdf.format(cal.getTime()) + "</br>" );
		
		Enumeration<String> params = request.getParameterNames();
		String firstName = params.nextElement();
		String firstNameValue = request.getParameter(firstName);
		String lastName = params.nextElement();
		String lastNameValue = request.getParameter(lastName);
		String gender = params.nextElement();
		String genderValue = request.getParameter(gender);
		
		if(genderValue.equals("male"))
		{
			out.println("Welcome Mr. " + firstNameValue + " " + lastNameValue);
		}
		else
		{
			out.println("Welcome Miss. " + firstNameValue + " " + lastNameValue);
		}
	}

}
