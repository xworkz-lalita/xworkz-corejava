package com.xworkz.maja.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServelet extends HttpServlet {
	public RegisterServelet() {
		System.out.println("created register servelet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked dopost method");
		String name = req.getParameter("name");
		String hobbies = req.getParameter("hobbies");
		String email = req.getParameter("email");
		String location = req.getParameter("location");

		System.out.println(name + " " + hobbies + " " + location + " " + email);
		if (name != null && location != null && email != null && hobbies != null) {
			System.out.println("Registration is successful");
			RequestDispatcher reqDispatcher = req.getRequestDispatcher("/index.jsp");
			req.setAttribute("message", "Registartion is successful");
			reqDispatcher.forward(req, resp);
		} else {
			System.out.println("Registration is not success");
		}
	}
}
