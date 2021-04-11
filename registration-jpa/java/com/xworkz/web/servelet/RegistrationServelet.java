package com.xworkz.web.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.web.entity.RegistrationEntity;
import com.xworkz.web.repository.RegistrationRepo;
import com.xworkz.web.repository.RegistrationRepoImpl;
import com.xworkz.web.service.RegistrationService;
import com.xworkz.web.service.RegistrationServiceImpl;

public class RegistrationServelet extends HttpServlet {

	private RegistrationService service;

	public RegistrationServelet() {
		System.out.println("Created " + this.getClass().getSimpleName());

	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.service = new RegistrationServiceImpl();
		super.init(config);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoking post method");
		String name = req.getParameter("name");
		System.out.println(name);
		String phoneNo = req.getParameter("phoneNo");
		System.out.println(phoneNo);
		String company = req.getParameter("company");
		System.out.println(company);
		String email = req.getParameter("email");
		System.out.println(email);
		String project = req.getParameter("project");
		System.out.println(project);

		RegistrationEntity entity = new RegistrationEntity();
		entity.setName(name);
		entity.setPhoneNo(phoneNo);
		entity.setCompany(company);
		entity.setEmail(email);
		entity.setProject(project);
		
		resp.setContentType("text/html");

		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("Contact Status");
		writer.println("</h1>");
		writer.println("<h3>");
		boolean save =this. service.validateAndSave(entity);
		if (save) {
			System.out.println("information saved");
			writer.println("Registered with this is successful" + name);
		} else {
			System.out.println("information is not saved");
			writer.println("Registered with this is not successful" + name);
		}
		writer.println("</h3>");
		writer.println("<a href='index.html'>click here to add more contacts </a>");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();
	}
}
