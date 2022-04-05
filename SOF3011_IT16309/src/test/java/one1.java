

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/one1")
public class one1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public one1() {
        super();
    }
    	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getParameterMap();
		String txt = request.getParameter("submit");
		request.setAttribute("submit", txt);
		request.getRequestDispatcher("/views/demo.jsp").forward(request, response);
	
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String txt = request.getParameter("submit");
//		request.setAttribute("submit", txt);
//		request.getRequestDispatcher("/views/demo.jsp").forward(request, response);
	}

}
