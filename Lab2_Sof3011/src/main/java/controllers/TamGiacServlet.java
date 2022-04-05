package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/TamGiacServlet","/dientich","/chuvi"})
public class TamGiacServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public TamGiacServlet() {
        super();
    }

	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		request.getRequestDispatcher("/views/Bai1/Bai1.jsp").forward(request, response);
	}

	
	protected void doPost(
			HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		String aString = request.getParameter("a");
		String bString = request.getParameter("b");
		String cString = request.getParameter("c");
		String uriString = request.getRequestURI();
		double a = Double.parseDouble(aString);	
		double b = Double.parseDouble(bString);
		double c = Double.parseDouble(cString);
		if ((a+b)<c || (a+c)<b || (b+c)<a) {
			request.setAttribute("messages", "Cạnh của tam giác không hợp lệ!");
		} else {
			if (uriString.contains("dientich")) {
				request.setAttribute("messages", "Diện tích của tam giác là: " + dientich(a, b, c));
			} 
			if (uriString.contains("chuvi")) {
				request.setAttribute("messages", "Chu vi của tam giác là: " + chuvi(a, b, c));
			}
		}
		request.getRequestDispatcher("/views/Bai1.jsp").forward(request, response);
	}
	public double chuvi(double a, double b, double c) {
		return a+b+c;
	}
	
	public double dientich(double a, double b, double c) {
		double nuaP = chuvi(a, b, c)/2;
		return Math.sqrt(nuaP*nuaP*(nuaP-a)*nuaP*(nuaP-b)*nuaP*(nuaP-c));
	}

}
