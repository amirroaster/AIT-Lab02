import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CurrentTimeServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		PrintWriter out = response.getWriter();
		
		out.println("Hello World!" + "</br>");
		out.println( sdf.format(cal.getTime()) );
	}

}


