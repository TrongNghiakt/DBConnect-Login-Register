package vn.iotstar.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.iotstar.models.User;
import vn.iotstar.services.IUserService;
import vn.iotstar.services.impl.UserServiceImpl;

@WebServlet(urlPatterns = "/forgot")
public class ForgotController extends HttpServlet {
	IUserService service = new UserServiceImpl();
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
		String email = req.getParameter("email");
		String username = req.getParameter("username");
		String oldPassword = req.getParameter("oldpass");
		String newPassword = req.getParameter("newpass");
		String confirmPassword = req.getParameter("confirmpass");
		String alertMsg = "";
		if (!newPassword.equals(confirmPassword)) {
			alertMsg = "Mật khẩu cũ và mới không trùng khớp. Vui lòng nhập lại!";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/views/forgotpass.jsp").forward(req, resp);
		}

		boolean emailExists = service.checkExistEmail(email);
		if (!emailExists) {
			req.setAttribute("alert", "Email không tồn tại hoặc Email tương ứng với username không chính xác.");
			req.getRequestDispatcher("/views/forgotpass.jsp").forward(req, resp);
			return;
		}

		User user = service.findByUserName(username);
		if (user == null || !user.getEmail().equals(email)) {
			req.setAttribute("alert", "Username và email không khớp.");
			req.getRequestDispatcher("/views/forgotpass.jsp").forward(req, resp);
			return;
		}

		boolean isValidOldPass = service.verifyOldPass(username, email, oldPassword);

		if (isValidOldPass) {
			// Update the password
			boolean isUpdated = service.updatePassword(username, newPassword);

			if (isUpdated) {
				req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
			} else {
				alertMsg = "Cập nhật mật khẩu thất bại. Vui lòng nhập lại!";
				req.setAttribute("alert", alertMsg);
				req.getRequestDispatcher("/views/forgotpass.jsp").forward(req, resp);
			}
		} else {
			alertMsg = "Mật khẩu cũ không chính xác. Vui lòng nhập lại!";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/views/forgotpass.jsp").forward(req, resp);
		}
	}

}
