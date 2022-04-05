package Controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;
import org.apache.commons.beanutils.BeanUtils;

import bean.form_data.dangKiData;

@WebServlet("/Bai2_3")
public class Bai2_Bai3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Bai2_Bai3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/views/Bai2_Form.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		dangKiData bean = new dangKiData();
		try {
			BeanUtils.populate(bean, request.getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String user = bean.getUsername();
		String pass = bean.getPassword();
		boolean gioiTinh = bean.isGioiTinh();
		String quocTich = bean.getQuocTich();
		String ghiChu = bean.getGhiChu();
		boolean tinhTrang = bean.isTinhTrang();
		String[] soThich = bean.getSoThich();
		
		request.setAttribute("user", "Ten dang nhap: " + user);
		request.setAttribute("pass", "Mat khau: " + pass);
		request.setAttribute("gioiTinh", "Gioi tinh: " + gioiTinh);
		request.setAttribute("quocTich", "Quoc tich: " + quocTich);
		request.setAttribute("ghiChu", "Ghi Chu: " + ghiChu);
		request.setAttribute("tinhTrang", "Tinh trang hon nhan: " + tinhTrang);
		request.setAttribute("soThich", "So thich: " + Arrays.toString(soThich));
		
		System.out.println(user);
		System.out.println(pass);
		System.out.println(gioiTinh);
		System.out.println(quocTich);
		System.out.println(ghiChu);
		System.out.println(tinhTrang);
		System.out.println(Arrays.toString(soThich));
		
		request.getRequestDispatcher("/views/Bai2_Result.jsp").forward(request, response);
	}

}
