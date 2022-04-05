package Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Bai1")
public class Bai1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Bai1Servlet() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/views/Bai1.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double a = Double.parseDouble(request.getParameter("canhA"));
		double b = Double.parseDouble(request.getParameter("canhB"));
		double c = Double.parseDouble(request.getParameter("canhC"));
		
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			double chuVi = (a + b + c);
			String chon = request.getParameter("chon");
			if (chon.contains("0")) {
				double dienTich = Math.sqrt(chuVi * (a + b - c) * (a + c - b) * (b + c - a) / 4);
				request.setAttribute("message", "Dien tich tam giac la:  "  + dienTich);
			} else {
				request.setAttribute("message", "Chu vi tam giac la: "  + chuVi);
			}
		} else {
			request.setAttribute("message", "Khong thoa man cac canh cua mot tam giac");
		}
		
		doGet(request, response);
	}

}
