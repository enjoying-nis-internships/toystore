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
		
			<form name="registration_form" id='registration_form' class="form-inline">
		<div class="width:80%;">
		        <div >
		            <label for="firstname" class="sr-only"></label>
		            <input id="firstname" class="form-control input-group-lg reg_name" type="text" name="firstname"
		                   title="Enter first name"
		                   placeholder="First name"/>
		        </div>
		        <div class="form-group">
		            <label for="lastname" class="sr-only"></label>
		            <input id="lastname" class="form-control input-group-lg reg_name" type="text" name="lastname"
		                   title="Enter last name"
		                   placeholder="Last name"/>
		        </div>
				<div >
			        <label for="age" class="sr-only"></label>
			        <input id="age" class="form-control input-group-lg" type="text" autocapitalize='off' name="age"
			               title="Enter age"
			               placeholder="age"/>
			    </div>
			    <div >
			        <label for="gender" class="sr-only"></label>
			        <input id="gender" class="form-control input-group-lg" type="text" autocapitalize='off' name="gender"
			               title="Enter gender"
			               placeholder="gender"/>
			    </div>
			    <div >
			        <label for="email" class="sr-only"></label>
			        <input id="email" class="form-control input-group-lg" type="text" autocapitalize='off' name="email"
			               title="Enter email"
			               placeholder="email"/>
			    </div>
			
			    <div >
			        <label for="password" class="sr-only"></label>
			        <input id="password" class="form-control input-group-lg" type="password" name="password"
			               title="Enter password"
			               placeholder="Password"/>
			    </div>
			    <div >
			        <label for="password" class="sr-only"></label>
			        <input id="Cpassword" class="form-control input-group-lg" type="password" name="password"
			               title="Enter password"
			               placeholder="ConfirmPassword"/>
			    </div>
		</div>
    		</form>
    	</div>
	</div>
</body>
</html>