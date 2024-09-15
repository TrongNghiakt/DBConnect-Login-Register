package vn.iotstar.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/forgot")
public class ForgotController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/views/forgotpass.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("email");
		String oldPassword = req.getParameter("oldpass");
		String newPassword = req.getParameter("newpass");
		String confirmPassword = req.getParameter("confirmpass");

		HttpSession session = req.getSession();
		String email = (String) session.getAttribute("email");

		if (!newPassword.equals(confirmPassword)) {
			req.setAttribute("errorMessage", "New passwords do not match.");
			req.getRequestDispatcher("/forgot.jsp").forward(req, resp);
			return;
		}
	}

}
