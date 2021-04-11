package com.xworkz.web.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.web.entity.RegistrationEntity;
import com.xworkz.web.service.RegistrationService;
import com.xworkz.web.service.RegistrationServiceImpl;

public class SearchByEmailServelet extends HttpServlet{
	private RegistrationService service = null;
public SearchByEmailServelet() {
System.out.println("Created"+this.getClass().getSimpleName());
}
@Override
public void init(ServletConfig config) throws ServletException {
	service=new RegistrationServiceImpl();
	super.init(config);
}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("invoked doPost from SearchByEmail");
	String email = req.getParameter("email");
	System.out.println("email from req: " + email);
	RegistrationEntity entity = this.service.validateAndFindByEmail(email);
	System.out.println(entity + "from service");
	resp.setContentType("text/html");
	PrintWriter writer = resp.getWriter();
	writer.println("<html>");
	writer.println("<body>");
	writer.println("<h1>Search By email</h1>");
	writer.println("<form action=\"search\" method=\"post\">\r\n"
			+ "Search By Email<input type=\"text\" email=\"email\"/>\r\n"
			+ "<input type=\"submit\" value=\"Search\">\r\n" + "</form>\r\n");
	if (entity != null) {
		writer.println("<p>Search results are found</br> " + entity.getName() + "</br> " + entity.getPhoneNo()
				+ " </br>" + entity.getCompany() + "" + "</br>" + entity.getEmail() + "</br>" + entity.getProject()
				+ " </p>");
	}

else {
	writer.println("<p style='color:red'>No results found</p>");
}
}
}

