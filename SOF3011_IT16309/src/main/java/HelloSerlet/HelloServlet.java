package HelloSerlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public HelloServlet() {
        super();
        
    }

	
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response
			) throws ServletException, IOException {
		
		request.setAttribute("views", "/views/Welcome.jsp");

		request.getRequestDispatcher("/views/layout.jsp")
		.forward(request, response);
//		response.getWriter().
//		append("Hello IT16309 ");
	}

	
	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response
			) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
