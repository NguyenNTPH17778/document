package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dangky")
public class DangKy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DangKy() {
        super();
    }

	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		request.getRequestDispatcher("/views/Bai3/Bai3.jsp").forward(request, response);
	}

	protected void doPost(
			HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		String nameString = request.getParameter("name");
		String pasString = request.getParameter("pass");
		String genderString = request.getParameter("gender").equals("1") ? "Nam" : "Nữ";
		String simpleString = request.getParameter("simple").equals("1") ? "Có gia đình" : "Độc thân";
		String countryString = request.getParameter("country");
		String hobbies[] = request.getParameterValues("hobbies");
		StringBuilder sb = new StringBuilder();
		for (String item : hobbies) {
			sb.append(item).append(",");
		}
		
		String noteString = request.getParameter("note");
		request.setAttribute("name", nameString);
		request.setAttribute("pass", pasString);
		request.setAttribute("gender", genderString);
		request.setAttribute("simple", simpleString);
		request.setAttribute("country", countryString);
		request.setAttribute("hobbies", sb.toString());
		request.setAttribute("note", noteString);
		request.getRequestDispatcher("/views/Bai3/results.jsp").forward(request, response);
	}

}
