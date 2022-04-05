package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public loginServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/views/login.jsp")
		.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hoten = request.getParameter("fullname");
		String diachi = request.getParameter("address");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		String sdt = request.getParameter("phone");
		String gioitinh = request.getParameter("gender1");
		System.out.println(hoten + "||" + diachi + "||" + email + "||" + pass + "||" + sdt  + "||" + gioitinh   );
		
		response.sendRedirect(
				"/SOF3011_IT16309"+"/HelloSerlet"
				);

	}

}
