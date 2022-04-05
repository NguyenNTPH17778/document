<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	
	<form action="/SOF3011_IT16309/login" method="post" >
	
	<div>
	<label>FullName</label>
	<input type="fullname" name="fullname"/>
	</div>
	
	<div>
	<label>Address</label>
	<input type="address" name="address"/>
	</div>
	
	<div>
	<label>Email</label>
	<input type="email" name="email"/>
	</div>
	
	<div>
	<label>Password</label>
	<input type="password" name="password"/>
	</div>
	
	<div>
	<label>PhoneNumber</label>
	<input type="phone" name="phone"/>
	</div>
	
	<div>
	<label>Gender</label>
	
	 <div >
	 	<input type="radio" name="gender1"/>
	 	<label>Nam</label>
	 	
	 	<input type="radio" name="gender2"/>
		 <label>Nu</label>
	 </div>

	 	
	
	</div>
	
	<button>Dang nhap</button>
</form>
	
</body>
</html>