package Pamula;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings({ "serial" })
public class A_project extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		//Addition-------------------------------------------------------------------------------
		int i =	Integer.parseInt(req.getParameter("num1"));
		int j =	Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		PrintWriter out = res.getWriter();
		out.println("The Sum of \t\t"+i+" and "+j+" is "+k);
		out.println();
		
		//Subtraction------------------------------------------------------------------------------
		int i1 =	Integer.parseInt(req.getParameter("num1"));
		int j1 =	Integer.parseInt(req.getParameter("num2"));
		int k1=i1-j1;
		PrintWriter out1 = res.getWriter();
		out1.println("The Subtraction of \t"+i1+" and "+j1+" is "+k1);
		out.println();
		
		//Multiplication---------------------------------------------------------------------------
		int i2 =	Integer.parseInt(req.getParameter("num1"));
		int j2 =	Integer.parseInt(req.getParameter("num2"));
		int k2=i2*j2;
		PrintWriter out2 = res.getWriter();
		out2.println("The Multiplication of \t"+i2+" and "+j2+" is "+k2);
		out.println();
		
		//Division----------------------------------------------------------------------------------
		int i3 =	Integer.parseInt(req.getParameter("num1"));
		int j3 =	Integer.parseInt(req.getParameter("num2"));
		int k3=i3/j3;
		PrintWriter out3 = res.getWriter();
		out3.println("The Division of \t"+i3+" and "+j3+" is "+k3);
		out.println();
		
		//Module-----------------------------------------------------------------------------------
		int i4 =	Integer.parseInt(req.getParameter("num1"));
		int j4 =	Integer.parseInt(req.getParameter("num2"));
		int k4=i4%j4;
		PrintWriter out4 = res.getWriter();
		out4.println("The Module of \t\t"+i4+" and "+j4+" is "+k4);
		out.println();
		
	}
	
}
