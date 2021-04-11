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

public class SearchByName extends HttpServlet {
	private RegistrationService service = null;

	public SearchByName() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.service = new RegistrationServiceImpl();
		super.init(config);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doPost from SearchByName");
		String name = req.getParameter("name");
		System.out.println("name from req: " + name);
		RegistrationEntity entity = this.service.validateAndFindByName(name);
		System.out.println(entity + "from service");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>Search By name</h1>");
		writer.println("<form action=\"search\" method=\"post\">\r\n"
				+ "Search By Name<input type=\"text\" name=\"name\"/>\r\n"
				+ "<input type=\"submit\" value=\"Search\">\r\n" + "</form>\r\n");
		if (entity != null) {
			writer.println("<p>Search results are found</br> " + entity.getName() + "</br> " + entity.getPhoneNo()
					+ " </br>" + entity.getCompany() + "" + "</br>" + entity.getEmail() + "</br>" + entity.getProject()
					+ " </p>");
		}

	else {
		writer.println("<p style='color:red'>No results found</p>");
	}
}}
