<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
  
  
  <table>
  	<thead>
  		<th> MaSV </th>
  		<th> HoTen </th>
  		<th> GioiTinh </th>
  		<th> ChuyenNganh </th>
  		<th> SDT </th>
  		<th> Email </th>
  		<th> ThoiGian </th>
  		
  	</thead>
  	
  	<tbody >
  	
  	<c:forEach var="sv" items="list"> 
  		<tr>
  			<td>${ sv.maSv }</td>
  			<td>${ sv.hoTen }</td>
  			<td>
  				<c:if test="${ sv.gioiTinh }">Nam</c:if>
  				<c:if test="${ !sv.gioiTinh }">Nu</c:if>
  			
  			</td>
  			<td>${ sv.chuyenNganh }</td>
  			<td>${ sv.sdt }</td>
  			<td>${ sv.email }</td>
  			<td> <fmt:formatDate value="${ sv.thoiGian }" pattern="EE,dd/MM/yyyy"/> </td>
  			
  		</tr>
  	
  	</c:forEach>
  	
  	
  	</tbody>
  
  
  
  </table>