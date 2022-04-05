<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Tam Giác</h1>
	<form action="/Lab2_SOF3011/Bai1" method="POST">
		<div>
			<label> Cạnh a </label> <input type="number" name="canhA" />
		</div>
		<br>
		<div>
			<label> Cạnh b </label> <input type="number" name="canhB" />
		</div>
		<br>
		<div>
			<label> Cạnh c </label> <input type="number" name="canhC" />
		</div>
		<br>
		<div>
			<select name="chon">
				<option value="0"> Tính Diện Tích </option>
				<option value="1"> Tính Chu Vi </option>
			</select>
		</div>
		<hr>
		<div>
			<button>Tính</button>
		</div>
		<h3>${ message }</h3>
	</form>
</body>
</html>