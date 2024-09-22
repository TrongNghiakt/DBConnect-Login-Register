<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@ taglib prefix="fn" uri="jakarta.tags.functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up</title>

</head>
<body>

	<div class="main">
		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<c:if test="${alert !=null}">
							<h3 class="alert alertdanger">${alert}</h3>
						</c:if>
						<form action="/ltweb/register" method="post" class="register-form"
							id="register-form">
							<h2 class="form-title">Sign up</h2>

							<div class="form-group">
								<label for="username"> <b>Username: </b><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="username" id="username"
									placeholder="Your Username" required />
							</div>
							<div class="form-group">
								<label for="password"><b>Password: </b><i
									class="zmdi zmdi-lock"></i></label> <input type="password"
									name="password" id="password" placeholder="Password" required />
							</div>
							<div class="form-group">
								<label for="password"><b>Repeat Password: </b><i
									class="zmdi zmdi-lock-outline"></i></label> <input type="password"
									name="password" id="re_pass" placeholder="Repeat your password"
									required />
							</div>
							<div class="form-group">
								<label for="fullname"> <b>Full Name: </b><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fullname" id="fullname"
									placeholder="Your Name" required />
							</div>
							<div class="form-group">
								<label for="email"><b>Email: </b><i
									class="zmdi zmdi-email"></i></label> <input type="email" name="email"
									id="email" placeholder="Your Email" required />
							</div>
							<div class="form-group">
								<label for="phone"><b>Phone: </b><i
									class="zmdi zmdi-lock-outline"></i></label> <input type="text"
									name="phone" id="contact" placeholder="Contact no" />
							</div>
							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" /> <label for="agree-term"
									class="label-agree-term"><span><span></span></span>I
									agree all statements in <a
									href="https://www.register.it/company/legal/condizioni-generali.html?lang=en"
									class="term-service">Terms of service</a></label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="register" id="signup"
									class="form-submit" value="Register" />
							</div>

							<input type="button" name="login" id="login" value="Login" />
						</form>
						<script>
							document
									.getElementById("login")
									.addEventListener(
											"click",
											function() {
												window.location.href = "/ltweb/views/login.jsp"; 
											});
						</script>

					</div>
				</div>
			</div>
		</section>
	</div>
</body>
</html>