package controller.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.form_data.java.RegisterData;

@WebServlet({
	"/users/index",
	"/users/show",
	"/users/create",
	"/users/store",
	"/users/edit",
	"/users/update",
	"/users/delete",
})
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		
		if (uri.contains("index")) {
			this.index(request, response);
		} else if (uri.contains("create")) {
			this.create(request, response);
		} else if (uri.contains("edit")) {
			this.edit(request, response);
		} else if (uri.contains("show")) {
			this.show(request, response);
		} else if (uri.contains("delete")) {
			this.delete(request, response);
		}
	}
	

	private void index(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		RegisterData o1 = new RegisterData("Nguyen Van A", "HN", "123456","0868451259",1, 0),
				o2 = new RegisterData("Nguyen Van B", "HN", "123456","0868451259",1, 0),
				o3 = new RegisterData("Nguyen Van C", "HN", "123456","0868451259",1, 0);
		
		List<RegisterData> ds = new ArrayList<RegisterData>();
		ds.add(o1);
		ds.add(o2);
		ds.add(o3);
		
		
		
		request.setAttribute("ds",ds);
		request.setAttribute("now",new Date());
		request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
	}

	private void create(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		
	}

	private void edit(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
	}

	private void show(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
	}

	private void delete(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri2 = request.getRequestURI();
		
		if (uri2.contains("store")) {
			this.store(request, response);
		} else if (uri2.contains("update")) {
			this.update(request, response);
		}else {
			//404
		}
	}
	
	private void store(
			HttpServletRequest request,
			HttpServletResponse response
		) throws ServletException, IOException {
		}
	
	private void update(
			HttpServletRequest request,
			HttpServletResponse response
		) throws ServletException, IOException {
		}
	
	
}