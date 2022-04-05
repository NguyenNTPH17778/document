package kkkk;

import java.beans.Beans;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;


@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ArrayList<Student> list = new ArrayList();
	
	public StudentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/views/form.jsp").forward(request, response);
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
		 request.setCharacterEncoding("UTF-8");
		 response.setCharacterEncoding("UTF-8");
		Student sv = new Student();
		   BeanUtils.populate(sv, request.getParameterMap());
			list.add(sv);
			request.setAttribute("bean", "list");
			request.getRequestDispatcher("/views/form.jsp").forward(request, response);
			System.out.println(list.size());
			
			
		} catch (Exception e) {
			
		}
		
	}

}
