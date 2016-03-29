<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<p style="text-align: center;">Registration</p>
		<div class="span7 offset5">
			<c:url var="saveUser" value="/save"/>
			<form:form method="POST" action="${saveUser}" modelAttribute="userForm">
				<div class="width:80%;">
					<div>
						<div>
							<label class="col-sm-2">Username</label>
							<form:input path="username" type="text" />
							<form:errors path="username"/>
						</div>
						<br />
						<div>
							<label class="col-sm-2">Firstname</label>
							<form:input path="firstName" type="text" />
							<form:errors path="firstName"/>
						</div>
						<br />
						<div>
							<label class="col-sm-2">Lastame</label>
							<form:input path="lastName" type="text" />
							<form:errors path="lastName"/>
						</div>
						<br />
						<div>
							<label class="col-sm-2">Email</label>
							<form:input path="email" type="text" />
							<form:errors path="email"/>
						</div>
						<br />
						<div>
							<label class="col-sm-2">Password</label>
							<form:input path="password" type="password" />
							<form:errors path="password"/>
						</div>
						<br />
						<div>
							<label class="col-sm-2">Confirm password</label>
							<form:input path="cpassword" type="password" />
							<form:errors path="cpassword"/>
						</div>
						<br />
						<div>
							<input type="submit" class="btn btn-lg" value="Register" />
						</div>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>