package PresentationLayer.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import BussinessLayer.Entities.Admin;
import BussinessLayer.ServiceBUS.ServiceDAO_Admin;


@WebServlet({"/admin/login", "/admin/index"})
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	
	ServiceDAO_Admin svDao_Admin;
    public AdminServlet() {
    	super();
    	svDao_Admin = new ServiceDAO_Admin();
        
    }
    
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Admin ad;
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		ad = svDao_Admin.loginAdmin(email, pass);
		
		if(ad == null) {
			request.getRequestDispatcher("/views/admin/login.jsp").forward(request, response);
		}else {
//			HttpSession session = request.getSession();
//			session.setAttribute("admin", email);
			request.getRequestDispatcher("/views/admin/index.jsp").forward(request, response);
//			System.out.println(session.getAttribute("admin"));			
		}
	}
	
	private void index(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String x = request.getParameter("add");
		if(x != null) {
			Admin admin = new Admin();
			try {
				BeanUtils.populate(admin, request.getParameterMap());
				svDao_Admin.add(admin);
				if(svDao_Admin.add(admin) == null) {
					request.getRequestDispatcher("/views/admin/index.jsp").forward(request, response);
				}else {
					request.getRequestDispatcher("/views/admin/index.jsp").forward(request, response);
				}
				
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		request.getRequestDispatcher("/views/admin/index.jsp").forward(request, response);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		
		if(uri.contains("login")) {
		
		
			login(request, response);
		}
		
		if(uri.contains("index")) {
			
			try {
				index(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");
			response.getCharacterEncoding();
	
			String uri = request.getRequestURI();
			if(uri.contains("login")) {
				
				login(request, response);
			}
			

			if(uri.contains("index")) {
				
				index(request, response);
			}
			
			

	
		} catch (Exception e) {
		}
		
		
	
	}

}