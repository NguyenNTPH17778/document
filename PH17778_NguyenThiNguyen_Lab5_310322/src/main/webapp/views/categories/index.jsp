<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>

<c:if test="${ empty ds }">
	<p class="alert alert-warning">Không có dữ liệu</p>
</c:if>

<c:if test="${ !empty ds }">
<table class="table">
		<thead class="table-danger">
		    <th>Id</th>
			<th>Tên</th>
			<th colspan="2">Thao tác</th>
		</thead>
		<tbody>
			<c:forEach items="${ ds }" var="category">
				<tr>
					<td>${category.id }</td>
					<td>${category.ten }</td>
					<td>
						<a href="/PH17778_NguyenThiNguyen_Lab5_310322/category/edit?id=${category.id}" class="btn btn-outline-primary">Cập nhật</a>
					</td>
					<td>
						<a href="/PH17778_NguyenThiNguyen_Lab5_310322/category/delete?id=${category.id}"class="btn btn-outline-danger">Xóa</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</c:if>