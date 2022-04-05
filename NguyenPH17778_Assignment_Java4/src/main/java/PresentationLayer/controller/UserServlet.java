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

import BussinessLayer.Entities.User;
import BussinessLayer.ServiceBUS.ServiceDAO_User;

@WebServlet({"/admin/login", "/admin/index"})
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServiceDAO_User sv_us;
    public UserServlet() {
        super();
      sv_us  = new ServiceDAO_User();
        // TODO Auto-generated constructor stub
    }
    
    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    	String email = request.getParameter("email");  
    	String pass = request.getParameter("password");  
    	User ad =  sv_us.loginUser(email, pass);
    	
    	if(ad != null) {
    		HttpSession session=request.getSession();
    		session.setAttribute("admin", email);
    		request.getRequestDispatcher("/views/admin/user/index.jsp").forward(request, response);
    		
    	}else {
    		request.getRequestDispatcher("/views/admin/user/login.jsp").forward(request, response);
    	}
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		
		if(uri.contains("login")) {	
			request.getRequestDispatcher("/views/admin/user/login.jsp").forward(request, response);
		}
		
		if(uri.contains("index")) {
			
		request.getRequestDispatcher("/views/admin/user/index.jsp").forward(request, response);
		}
		
	}
	
	
	private void index(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String x = request.getParameter("add");
		if(x != null) {
			User user = new User();
			try {
				BeanUtils.populate(user, request.getParameterMap());
				if(sv_us.addUser(user) == null) {// call lan 2  , Them 2 lan a`
					request.getRequestDispatcher("/views/admin/user/index.jsp").forward(request, response);
				}else {
					request.getRequestDispatcher("/views/admin/user/index.jsp").forward(request, response);
				}
				
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		request.getRequestDispatcher("/views/admin/user/index.jsp").forward(request, response);
		
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
				login(request, response);
				index(request, response);
			}
			
			

	
		} catch (Exception e) {
			
		}
		
		


	}

}