<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<form method="POST"action="/PH17778_NguyenThiNguyen_Lab5_310322/category/store">

		<div>
			<label>Tên danh mục</label>
			<input type="text" name="ten" />
		</div>
		<div>
			<label>Người tạo</label>
			<select name="user_id">
			<c:forEach items="${ dsUser }" var="user">
				<option value="${ user.id }">
					${ user.hoTen }
				</option>
			</c:forEach>
			</select>
		</div>
		<button>Thêm mới</button>

</form>