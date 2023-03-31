package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CoronaVaccineEligibility extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		String uname=req.getParameter("uname");
		String address=req.getParameter("address");
		int age=Integer.parseInt(req.getParameter("age"));
		if(age<18)
			writer.println("<h1 style='color:red;text-align:center'> Mr/Ms "+uname +"You are not "
					+ " Eligible for vaccination</h1>");
		else
			writer.println("<h1 style='color:green;text-align:center'> Mr/Ms "+uname +"You are  "
					+ " Eligible for vaccination Make it Happen !!</h1>");
		writer.println("<a href='corona_vaccine.html'><img src='images/home.jfif'></a>");
		
		/*writer.println("<a href='http://localhost:2020/CoronaVaccineApp/corona_vaccine.html'>"
				+ "<img src='images/home.jfif'>"+"</a>");*/
		writer.close();
	}
}
