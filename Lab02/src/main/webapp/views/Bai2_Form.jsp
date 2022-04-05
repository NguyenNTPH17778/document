<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1> Đăng Kí </h1>
	<form method="POST" action="/Lab2_SOF3011/Bai2_3">
		<div>
			<label> Tên Đăng Nhập: </label> <input type="text" name="username" />
		</div>
		<div>
			<label> Password: </label> <input type="password" name="password" />
		</div>
		<div>
			<label> Giới Tính: </label> 
			<input type="radio" name="gioiTinh" value="true" /> Nam 
			<input type="radio" name="gioiTinh" value="false" /> Nữ
		</div>
		<div>
			<label> Tình Trạng Hôn Nhân: </label>
			 <input type="checkbox" name="tinhTrang" value="true" /> Đã có gia đình
		</div>
		<div>
			<label> Quốc Tịch </label>
			<select name="quocTich">
				<option value="VN"> Việt Nam </option>
				<option value="USA"> Mỹ </option>
				<option value="USA"> Thai Lan </option>
				<option value="USA"> Han Quoc </option>
				<option value="USA"> Canada </option>
			</select>
		</div>
		<div>
			<label> Sở Thích: </label>
			 <input type="checkbox" name="soThich" value="R" /> Đọc Sách
			 <input type="checkbox" name="soThich" value="T" /> Du Lịch
			 <input type="checkbox" name="soThich" value="M" /> Nghe Nhạc
			 <input type="checkbox" name="soThich" value="O" /> Khác
		</div>
		<div>
			<label> Ghi Chú </label>
			<textarea rows="3" cols="30" name="ghiChu"></textarea>
		</div>
		<hr>
		<button>Đăng kí</button>
	</form>
</body>
</html>