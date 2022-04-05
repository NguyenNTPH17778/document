<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST"
		action="RegisterServlet">
		<div>
			<label>Name</label>
			<input type="text" name="hoTen" />
		</div>
		<div>
			<label>Address</label>
			<input type="text" name="diaChi" />
		</div>
		<div>
			<label>Email</label>
			<input type="email" name="email" />
		</div>
		<div>
			<label>Password</label>
			<input type="password" name="password" />
		</div>
		<div>
			<label>Phone</label>
			<input type="text" name="sdt" />
		</div>
		<div>
			<label>Gender</label>
			<input type="radio" name="gioiTinh" value="1" />
			<label>Male</label>
			<input type="radio" name="gioiTinh" value="0" />
			<label>Female</label>
		</div>
		<div>
			<label>Customer Type</label>
			<!-- <select name="loaiKH[]" multiple> -->
			<select name="loaiKH">
				<option value="0">Normal</option>
				<option value="1">VIP</option>
			</select>
		</div>
		<div>
			<button>Register</button>
			<button type="reset">Clear form</button>
		</div>
	</form>
</body>
</html>ml>