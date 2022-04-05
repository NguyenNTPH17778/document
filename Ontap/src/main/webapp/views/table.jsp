<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<table class="table">
	<thead >
		<th>Mã sinh viên </th>
		<th> Họ tên</th>
		<th> Giới tính</th>
		<th> Chuyên ngành</th>
		<th> Số điện thoại</th>
		<th>Email</th>
		<th>Thời gian</th>
	</thead>
	
	<tbody>
		<c:forEach var="sv" items="${list}">
			<tr> 
				<td>${sv.maSv }</td>
				<td>${sv.hoTen }</td>
				<td>
					<c:if test="${ sv.gioiTinh }">Nam</c:if>
					<c:if test="${ !sv.gioiTinh }">Nu</c:if>
				
				</td>
				<td>${sv.chuyenNganh }</td>
				<td>${sv.sdt }</td>
				<td>${sv.email }</td>
				<td> <fmt:formatDate value="${ sinhvien.thoiGian }" pattern="EEE, dd/MM/yyyy"/></td>			
			</tr>
		</c:forEach>
	
	</tbody>


</table>