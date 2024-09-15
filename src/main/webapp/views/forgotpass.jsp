<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="forget" method="POST">
	<label for="username">Email:</label>
    <input type="password" name="email" required><br>
	
    <label for="oldPassword">Old password:</label>
    <input type="password" name="oldpass" required><br>

    <label for="newPassword">New password:</label>
    <input type="password" name="newpass" required><br>

    <label for="confirmPassword">Confirm New Password:</label>
    <input type="password" name="confirmpass" required><br>

    <input type="submit" value="Change Password">
</form>

</body>
</html>