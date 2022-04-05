<%@page import="BussinessLayer.Entities.User"%>
<%@page import="BussinessLayer.ServiceBUS.ServiceDAO_User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>

<%@page import="java.util.List"%>

<%
//	if(session.getAttribute("admin") == null){
	//	return;
//	}

%>
<%
	ServiceDAO_User sv_us = new ServiceDAO_User();
	List<User> ad = sv_us.selectAll();
	request.setAttribute("indexadmin",ad);

%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin </title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <header>
         <img src="../images/Banner4.jpg" alt="" width="100%">
            <ul class="nav nav-tabs" id="myTab" role="tablist" >
                <li class="nav-item" role="presentation">
                  <button class="nav-link active" id="home-tab" data-bs-toggle="tab" data-bs-target="#home" type="button" role="tab" aria-controls="home" aria-selected="true">Home</button>
                </li>
                <li class="nav-item" role="presentation">
                  <button class="nav-link" id="profile-tab" data-bs-toggle="tab" data-bs-target="#profile" type="button" role="tab" aria-controls="profile" aria-selected="false">Quản lý admin</button>
                </li>
                <li class="nav-item" role="presentation">
                  <button class="nav-link" id="contact-tab" data-bs-toggle="tab" data-bs-target="#contact" type="button" role="tab" aria-controls="contact" aria-selected="false">Quản lý nhân viên</button>
                </li>
              </ul>
              
             
              <div class="tab-content" id="myTabContent">
                <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                    <span class="text-danger m-3 h2">Hello</span><br>
                  
                </div>
                
                
                <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                    <span class="text-danger fw-bold h2 mt-3 mb-4">Quản lý User</span>
                    <br>
                    <form action="" method="post">          
                       
                        <div>
                        	<label for="name" class="form-label">
                            Họ tên</label>
                            <input type="text" name="hoten" id="hoten" class="form-control">
                        </div>
                       
                       <div class="row">
                        <label>GioiTinh</label>
                        	<div class="col-1">
                        		 <div class="form-check">
                          		 	 <input class="form-check-input" type="radio" name="gioitinh" id="flexRadioDefault1" value="0" checked>
                           			 <label class="form-check-label" for="flexRadioDefault1"> Nam</label>
                        	 	</div>
							</div>
							
							<div class="col-1">
								<div class="form-check">
                           			<input class="form-check-input" type="radio" name="gioitinh" id="flexRadioDefault2" value="1" >
                            		<label class="form-check-label" for="flexRadioDefault2"> Nữ</label>			
								</div>
                        	</div>
                        	
                        	<div class="col-10"></div>
                        </div>
                        
                        
                         <div>
                        <label for="phone" class="form-label"> Phone</label>
                        <input type="text" name="sdt" id="phone" class="form-control">
                        </div>
                        
                        
                        <div>
                         	 <label for="diachi" class="form-label"> Địa chỉ</label>
                       		 <input type="text" name="diachi" id="diachi" class="form-control"> 
                         </div>
                        
                          <div class="mb-3">
                 			 <label for="exampleInputEmail1" class="form-label">Email</label>
                 			 <input type="email" class="form-control" id="exampleInputEmail1" name="email" >
                		 </div>
                           
       
                        
                       <div>
                       		 <label for="passwd" class="form-label">Password</label>
                          <input type="password" name="password" id="passwd" class="form-control">
                       
                       </div>
                        
                       
                        
                        
                       <div>
                       		 <label for="avatar" class="form-label">
                           Avatar
                        </label>
                         <input type="file" name="avatar" id="avatar" class="form-control">
                       </div>
                        
                        <div class="row">
                        	<div class="col-1"><button class="btn btn-outline-success mt-2" value="0" name="add">Add</button></div>
                        	<div class="col-1"><button class="btn btn-outline-success mt-2" value="1" name="update">Update</button></div>
                        	<div class="col-1"><button class="btn btn-outline-success mt-2" value="2" name="delete">Delete</button></div>
                        	<div class="col-9"></div>
                        </div>
                        
                        
                    </form>
                
                </div>
                
                <div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="contact-tab">
                       <table class="table table-bordered table-responsive mt-3">
                        <thead>
                            
                            <th>HoTen</th>
                            <th>GioiTinh</th>
                            <th>SDT</th>
                            <th>DiaChi</th>
                            <th>Email</th>
                            <th>Password</th>
                            <th>Avatar</th>

                
                        </thead>
						
						<tbody>
							<c:forEach var="item" items="${indexadmin}" >
								<tr>
									<td>${item.hoten}</td>
									<td>${item.gioiTinh}</td>
									<td>${item.sdt}</td>
									<td>${item.diaChi}</td>
									<td> ${item.email}</td>
									<td>${item.password} </td>
									<td>${item.avatar}  </td>			
								 </tr>
						
							</c:forEach>
						
						</tbody>
                    </table>
                    
				</div>
              
        </header>
    </div>
    <script src="../js/jquery.min.js"></script>
    <script src="../js/popper.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
</body>
</html>   