package com.xworkz.web.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.web.entity.RegistrationEntity;
import com.xworkz.web.service.RegistrationService;
import com.xworkz.web.service.RegistrationServiceImpl;

public class DisplayAll extends HttpServlet {
	private RegistrationService service;

	public DisplayAll() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.service = new RegistrationServiceImpl();
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doGet from displayAllService");
		List<RegistrationEntity> listFromService = this.service.getAll();
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");

		if (listFromService != null && !listFromService.isEmpty()) {
			System.out.println("list is found with size : " + listFromService.size());
			writer.println("<h1>Results found, total : " + listFromService.size() + "</h1>");
			writer.println("<table border='1'>");
			Iterator<RegistrationEntity> iterator = listFromService.iterator();
			while (iterator.hasNext()) {
				RegistrationEntity reg = iterator.next();
				writer.println("<tr>");
				writer.println("<td>" + reg.getName() + "</td>");
				writer.println("<td>" + reg.getCompany() + "</td>");
				writer.println("<td>" + reg.getEmail() + "</td>");
				writer.println("<td>" + reg.getProject() + "</td>");
				writer.println("<td>" + reg.getPhoneNo() + "</td>");
				writer.println("</tr>");
			}
		} else {
			System.out.println("list is empty");
			writer.println("<h1>Results not found</h1>");

		}
		writer.println("</body>");
		writer.println("</html>");
	}
}
