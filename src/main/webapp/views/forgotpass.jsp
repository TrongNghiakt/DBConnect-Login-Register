<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forgot Password</title>
</head>
<body>
	<c:if test="${alert !=null}">
		<h3 class="alert alertdanger">${alert}</h3>
	</c:if>


	<form action="/ltweb/forgot" method="POST">
		<h1>Quên mật khẩu</h1>
		<br>

		<!-- Email Field -->
		<label for="email">Email:</label> <input type="email" name="email"
			required><br>

		<!-- Username Field -->
		<label for="username">User name:</label> <input type="text"
			name="username" required><br>

		<!-- Old Password Field -->
		<label for="oldPassword">Old password:</label> <input type="password"
			name="oldpass" required><br>

		<!-- New Password Field -->
		<label for="newPassword">New password:</label> <input type="password"
			name="newpass" required><br>

		<!-- Confirm New Password Field -->
		<label for="confirmPassword">Confirm New Password:</label> <input
			type="password" name="confirmpass" required><br> <input
			type="submit" value="Change Password">
	</form>
</body>
</html>
