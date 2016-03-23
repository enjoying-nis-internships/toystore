<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<p style="text-align:center;">Registration </p>
		<div class="span7 offset5">
		
			<form name="registration_form" id='registration_form' class="form-inline" method="post">
	
				<div>
		            <input id="username" class="form-control input-group-lg reg_name" type="text" name="username"
		                   title="Enter username"
		                   placeholder="Username"/>
		        </div>
		        <br />
		        <div>
		            <input id="firstname" class="form-control input-group-lg reg_name" type="text" name="firstname"
		                   title="Enter first name"
		                   placeholder="First name"/>
		        </div>
		        <br />
		        <div>
		            <input id="lastname" class="form-control input-group-lg reg_name" type="text" name="lastname"
		                   title="Enter last name"
		                   placeholder="Last name"/>
		        </div>
		        <br />
			    <div>
			        <input id="email" class="form-control input-group-lg" type="text" autocapitalize='off' name="email"
			               title="Enter email"
			               placeholder="Email"/>
			    </div>
				<br />
			    <div>
			        <input id="password" class="form-control input-group-lg" type="password" name="password"
			               title="Enter password"
			               placeholder="Password"/>
			    </div>
			    <br />
			    <div>
			        <input id="Cpassword" class="form-control input-group-lg" type="password" name="cpassword"
			               title="Enter password"
			               placeholder="Confirm Password"/>
			    </div>
			    <br />
			    <div>
			    	<input type="submit" class="btn btn-lg" value="Register"/>
			    </div>
    		</form>
    	</div>
	</div>
</body>
</html>