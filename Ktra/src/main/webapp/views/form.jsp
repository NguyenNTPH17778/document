<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
		<div class="row">
			<div class="col-3"></div>
			<div class="col-6">
				<form action="StudentServlet" method="post" class="form-control">
		
			<lable> Mã sinh viên</lable>
			<input class="form-control" name="maSv">
			
			<lable> Họ tên</lable>
			<input class="form-control" name="hoTen">
			
			<div>  
				<lable> Giới Tính</lable>
				<input class="form-check-input" name="gioiTinh" type="radio" value="true">Nam
				<input class="form-check-input" name="gioiTinh" type="radio" value="false">Nu
			</div>
			
			<lable> Chuyên Ngành</lable>
			<select class="form-select" name="chuyenNganh" >
				<option vlaue="MKT">Marketing </option>
				<option vlaue="UDPM">Ứng dụng phần mềm  </option>
				<option vlaue="TKDH">Thiết kế đồ họa </option>
				<option vlaue="QTKS">Quản trị khách sạn </option>
				<option vlaue="QTKD">Quản trị kinh doanh </option>
			</select>
			
			<lable> Số điện thoại</lable>
			<input class="form-control" name="sdt">
			
			<lable> Email</lable>
			<input class="form-control" name="email">
			
			<lable> Thời gian</lable>
			<input class="form-control" name="thoiGian" type="date"> 
			
		</form>
			</div>
			<div class="col-3"></div>
					
		</div>
		
		<jsp:include page="/views/table.jsp">
			<jsp:param value="${ name }" name="list"/>
		
		</jsp:include>
	
</body>
</html>