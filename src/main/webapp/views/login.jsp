<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri = "jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri = "jakarta.tags.functions" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign in</title>
<script>
function redirectToLogin() { window.location.href =
	"/ltweb/forgot"; }
</script>
<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	
	<form action="/ltweb/login" method="post">
		<h2>Đăng nhập tài khoản</h2>
		<c:if test="${alert !=null}">
			<h3 class="alert alertdanger">${alert}</h3>
		</c:if>
		<section>
			<label class="input login-input">
				<div class="input-group">
					<span class="input-group-addon"><i class="fafa-user"></i></span>
				</div>
			</label>
		</section>
		<section>
			<input type="text" placeholder="Tài khoản" name="username"
				class="form-control"> <input type="text"
				placeholder="Mật khẩu" name="password" class="form-control">
		</section>

		<section>
			<button type="submit">Login</button>
			<label> <input type="checkbox" checked="checked"
				name="remember"> Remember me
			</label>
			
		</section>
		<section>
			<div class="container" >
			<button  id = "sign-up-button" type="button" class="cancelbtn">
				<a>Sign up </a> 
			</button>
			</br>
			</div>
		</section>
	</form>
	<button  class="psw" value="forgot" onclick="redirectToLogin()">
				<a>Forgot password </a> 
			</button>
	 <script>
        // Lắng nghe sự kiện click trên nút sign up
        document.getElementById("sign-up-button").addEventListener("click", function() {
            // Chuyển hướng sang trang đăng ký
            window.location.href = "views/register.jsp";
        });
    </script>
	
</body>
</html>