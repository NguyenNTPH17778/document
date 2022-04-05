package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import beans.form_data.RegisterData;

@WebServlet("/RegisterServerlet")
public class RegisterServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RegisterServerlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//commons beansutil --> apache 
		RegisterData bean = new RegisterData();
		try {
			BeanUtils.populate(bean, request.getParameterMap());
		}catch ( Exception  e) {
			e.printStackTrace();
		}
		System.out.println(bean.getHoten());
		System.out.println(bean.getDiachi());
		System.out.println(bean.getGioitinh());
		System.out.println(bean.getEmail());
		System.out.println(bean.getPassword());
		System.out.println(bean.getSodienthoai());
		System.out.println(bean.getLoaiKH());
		
	}

}
