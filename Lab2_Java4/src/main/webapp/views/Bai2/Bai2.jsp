<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Dang ky</h1>
	<form action="/Lab2_Sof3011/register" method= "post">
		Ten dang nhap: <input type="text" name="name"><br>
		Mat khau: <input type="password" name="pass"><br>
		Gioi tinh: <input type="radio" name="gender" value="1">Nam 
		<input type="radio" name="gender" value="0">Nu <br>
		<input type="checkbox" name="simple" value="1">Da co gia dinh <br>
		Quoc tich: <select name="country">
			<option value="vn">Viet Nam</option>
			<option value="nb">Nhat Ban</option>
			<option value="hq">Han Quoc</option>
		</select> <br>
		Ghi chu:
		<textarea name="note"></textarea>
		<hr>
		<button>Gui</button>
	</form>
</body>
</html>