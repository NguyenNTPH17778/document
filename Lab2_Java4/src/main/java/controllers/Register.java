package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Register() {
        super();
    }

	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		request.getRequestDispatcher("/views/Bai2/Bai2.jsp").forward(request, response);
	}

	protected void doPost(
			HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		String nameString = request.getParameter("name");
		String pasString = request.getParameter("pass");
		String genderString = request.getParameter("gender").equals("1") ? "Nam" : "Nữ";
		String simpleString = request.getParameter("simple").equals("1") ? "Đã có gia đình" : "Độc thân";
		String countryString = request.getParameter("country");
		String noteString = request.getParameter("note");
		request.setAttribute("name", nameString);
		request.setAttribute("pass", pasString);
		request.setAttribute("gender", genderString);
		request.setAttribute("simple", simpleString);
		request.setAttribute("country", countryString);
		request.setAttribute("note", noteString);
		request.getRequestDispatcher("/views/result.jsp").forward(request, response);
	}

}
