<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>

	<h2> 
		<fmt:formatDate value="${ now }"
			pattern="dd/MM/yyyy"
		
		/>
		
	</h2>



	<c:if test="${ empty ds }">
		<p class="alert alert-warning ">Khong co du lieu </p>
	</c:if>
	
	<c:if test="${ !empty ds }">
		<table class="table">
			<thead>
				<th>Họ tên </th>
				<th>Giới tính </th>
				<th> SĐT</th>
				<th>Email </th>
				<th> Diachi</th>
				<th> Pass</th>
					
			</thead>
		
			<tbody>
				<c:forEach items="${ ds }" var="User">
					<tr>
						<td>${ User.hoTen }</td>
						<td>
						<c:choose>
							<c:when test="${ User.gioiTinh == 1 }">Nam</c:when>
							<c:when test="${ User.gioiTinh == 0 }">Nu</c:when>
							<c:otherwise> - </c:otherwise>
						
						</c:choose>
						</td>
						<td>${ User.sdt }</td>
						<td>${ User.email }</td>
						<td>${ User.password }</td>
					
					</tr>
				</c:forEach>
			
			</tbody>
		</table>
	</c:if>