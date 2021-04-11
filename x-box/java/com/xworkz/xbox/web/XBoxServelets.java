package com.xworkz.xbox.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XBoxServelets extends HttpServlet{
public XBoxServelets() {
System.out.println("Created"+this.getClass().getSimpleName());
}
@Override
	public void init(ServletConfig config) throws ServletException {
System.out.println("Invoked init method in XBox Servelet");
}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String game=req.getParameter("game");
	String gameType=req.getParameter("gameType");
	String series=req.getParameter("series");
	String code=req.getParameter("uname");
	String email=req.getParameter("email");
	System.out.println(game);
	System.out.println(gameType);
	System.out.println(series);
	System.out.println(code);
	System.out.println(email);
	resp.setContentType("text/html");
	PrintWriter writer=resp.getWriter();
	writer.println("<html>");
	writer.println("<body>");
	writer.println("<h1>");
	writer.println("<b>");
	writer.println("Game order is successful.....");
	writer.println("</b>");
	writer.println("<h1>");
	writer.println("</body>");
	writer.println("</html>");
	}
@Override
	public void destroy() {
		System.out.println("Invoked destroy method in xboxservelet");
	}
}
