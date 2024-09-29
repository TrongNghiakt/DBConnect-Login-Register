package vn.iotstar.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.iotstar.models.User;

@WebServlet(urlPatterns = "/waiting")
public class WaitingController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		if (session != null && session.getAttribute("account") != null) {
			User u = (User) session.getAttribute("account");
			req.setAttribute("username", u.getUserName());
			if (u.getRoleid() == 2) {
				req.getRequestDispatcher("/views/admin/category-list.jsp").forward(req, resp);
			} else if (u.getRoleid() == 3) {
				req.getRequestDispatcher("/views/home.jsp").forward(req, resp);
			} else {
				resp.sendRedirect(req.getContextPath() + "/home");
			}

		} else {
			resp.sendRedirect(req.getContextPath() + "/login");
		}
	}

}
