package vn.iotstar.controllers.admin;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/home", "/admin/home" })
public class HomeController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestURL = req.getRequestURI();
		if (requestURL.contains("/admin/home")) {
			req.getRequestDispatcher("/views/admin/home.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("/views/home.jsp").forward(req, resp);
		}
	}
}
