package vn.iotstar.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/uploadmulti")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
		maxFileSize = 1024 * 1024 * 10, // 10MB
		maxRequestSize = 1024 * 1024 * 50) // 50MB

public class UploadFileMultipart extends HttpServlet {
	/**
	* 
	*/
	private static final long serialVersionUID = -5980513639422411283L;
	public static final String SAVE_DIRECTORY = "uploads";

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/views/uploadfilemulti.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException, SecurityException {

		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		try {
			String name = req.getParameter("name");
			Part part = req.getPart("image");
			String realPath = req.getServletContext().getRealPath("/uploads");
			String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();

			if (!Files.exists(Paths.get(realPath))) {
				Files.createDirectory(Paths.get(realPath));
			}

			part.write(realPath + "/" + filename);
			PrintWriter out = resp.getWriter();
			try {
				out.print("<h2> Tên: " + name + "</h2>");
				out.print("<img src='uploads/" + filename + "'>");
			} catch (Exception e) {

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
