<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<form method="POST"
		action="/PH17778_NguyenThiNguyen_Lab5_310322/category/update?id=${category.id}">
		<div class="row ">
			<label class="col-2">Họ Tên</label>
			<input class="col-7" type="text" name="ten" value="${category.ten }"/>
		</div>
		</br>
		
		<div class="">
			<button class="btn btn-outline-success">Sửa</button>
			<button type="reset" class="btn btn-outline-warning">Xóa form</button>
		</div>
	</form>