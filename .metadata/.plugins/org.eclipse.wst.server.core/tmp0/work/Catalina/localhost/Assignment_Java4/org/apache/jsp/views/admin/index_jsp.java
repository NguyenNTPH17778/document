/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.59
 * Generated at: 2022-03-30 17:54:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import BussinessLayer.Entities.Admin;
import BussinessLayer.ServiceBUS.ServiceDAO_Admin;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1647341880520L));
    _jspx_dependants.put("jar:file:/C:/Users/84868/eclipse-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Assignment_Java4/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("BussinessLayer.ServiceBUS.ServiceDAO_Admin");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("BussinessLayer.Entities.Admin");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");

	if(session.getAttribute("admin") == null){
		return;
	}


      out.write('\r');
      out.write('\n');

	
	ServiceDAO_Admin svDao_Admin = new ServiceDAO_Admin();
	List<Admin> ad = svDao_Admin.selectAll();
	request.setAttribute("indexadmin",ad);


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Admin </title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <header>\r\n");
      out.write("         <img src=\"../images/Banner4.jpg\" alt=\"\" width=\"100%\">\r\n");
      out.write("            <ul class=\"nav nav-tabs\" id=\"myTab\" role=\"tablist\" >\r\n");
      out.write("                <li class=\"nav-item\" role=\"presentation\">\r\n");
      out.write("                  <button class=\"nav-link active\" id=\"home-tab\" data-bs-toggle=\"tab\" data-bs-target=\"#home\" type=\"button\" role=\"tab\" aria-controls=\"home\" aria-selected=\"true\">Home</button>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\" role=\"presentation\">\r\n");
      out.write("                  <button class=\"nav-link\" id=\"profile-tab\" data-bs-toggle=\"tab\" data-bs-target=\"#profile\" type=\"button\" role=\"tab\" aria-controls=\"profile\" aria-selected=\"false\">Quản lý admin</button>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\" role=\"presentation\">\r\n");
      out.write("                  <button class=\"nav-link\" id=\"contact-tab\" data-bs-toggle=\"tab\" data-bs-target=\"#contact\" type=\"button\" role=\"tab\" aria-controls=\"contact\" aria-selected=\"false\">Quản lý nhân viên</button>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("              \r\n");
      out.write("             \r\n");
      out.write("              <div class=\"tab-content\" id=\"myTabContent\">\r\n");
      out.write("                <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\r\n");
      out.write("                    <span class=\"text-danger m-3 h2\">Hello</span><br>\r\n");
      out.write("                  \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <div class=\"tab-pane fade\" id=\"profile\" role=\"tabpanel\" aria-labelledby=\"profile-tab\">\r\n");
      out.write("                    <span class=\"text-danger fw-bold h2 mt-3 mb-4\">Quản lý admin</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <form action=\"\" method=\"post\">          \r\n");
      out.write("                       \r\n");
      out.write("                        <div>\r\n");
      out.write("                        	<label for=\"name\" class=\"form-label\">\r\n");
      out.write("                            Họ tên</label>\r\n");
      out.write("                            <input type=\"text\" name=\"hoten\" id=\"hoten\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                       \r\n");
      out.write("                        \r\n");
      out.write("                          <div class=\"mb-3\">\r\n");
      out.write("                 			 <label for=\"exampleInputEmail1\" class=\"form-label\">Email</label>\r\n");
      out.write("                 			 <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" name=\"email\" >\r\n");
      out.write("                		 </div>\r\n");
      out.write("                           \r\n");
      out.write("                         <div>\r\n");
      out.write("                         	 <label for=\"diachi\" class=\"form-label\"> Địa chỉ</label>\r\n");
      out.write("                       		 <input type=\"text\" name=\"diachi\" id=\"diachi\" class=\"form-control\"> \r\n");
      out.write("                         </div>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                       <div>\r\n");
      out.write("                       		 <label for=\"passwd\" class=\"form-label\">Password</label>\r\n");
      out.write("                          <input type=\"password\" name=\"password\" id=\"passwd\" class=\"form-control\">\r\n");
      out.write("                       \r\n");
      out.write("                       </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div>\r\n");
      out.write("                        <label for=\"phone\" class=\"form-label\"> Phone</label>\r\n");
      out.write("                        <input type=\"text\" name=\"sdt\" id=\"phone\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                       <div>\r\n");
      out.write("                       		 <label for=\"tentk\" class=\"form-label\">\r\n");
      out.write("                            Tài khoản\r\n");
      out.write("                        </label>\r\n");
      out.write("                         <input type=\"text\" name=\"tentk\" id=\"tentk\" class=\"form-control\">\r\n");
      out.write("                       </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                        	<div class=\"col-1\"><button class=\"btn btn-outline-success mt-2\" value=\"0\" name=\"add\">Add</button></div>\r\n");
      out.write("                        	<div class=\"col-1\"><button class=\"btn btn-outline-success mt-2\" value=\"1\" name=\"update\">Update</button></div>\r\n");
      out.write("                        	<div class=\"col-1\"><button class=\"btn btn-outline-success mt-2\" value=\"2\" name=\"delete\">Delete</button></div>\r\n");
      out.write("                        	<div class=\"col-9\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("                    <table class=\"table table-bordered table-responsive mt-3\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            \r\n");
      out.write("                            <th>Họ tên</th>\r\n");
      out.write("                            <th>Địa chỉ</th>\r\n");
      out.write("                            <th>Password</th>\r\n");
      out.write("                            <th>Phone</th>\r\n");
      out.write("                            <th>Tài khoản</th>\r\n");
      out.write("                \r\n");
      out.write("                        </thead>\r\n");
      out.write("						\r\n");
      out.write("						<tbody>\r\n");
      out.write("							");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("						\r\n");
      out.write("						</tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"tab-pane fade\" id=\"contact\" role=\"tabpanel\" aria-labelledby=\"contact-tab\">\r\n");
      out.write("                    <span class=\"h2 text-danger fw-bold mt-3 mb-4\">Quản lý nhân viên</span>\r\n");
      out.write("                    \r\n");
      out.write("                    <form action=\"\" method=\"post\">          \r\n");
      out.write("                        <div>\r\n");
      out.write("                        	<label for=\"id_ad\" class=\"form-label \" >\r\n");
      out.write("                           Id_Admin</label>\r\n");
      out.write("                            <input type=\"text\" name=\"id_ad\" id=\"id_ad\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div>\r\n");
      out.write("                        	<label for=\"name\" class=\"form-label\">\r\n");
      out.write("                            Họ tên</label>\r\n");
      out.write("                            <input type=\"text\" name=\"username\" id=\"username\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                        <label>GioiTinh</label>\r\n");
      out.write("                        	<div class=\"col-1\">\r\n");
      out.write("                        		 <div class=\"form-check\">\r\n");
      out.write("                          		 	 <input class=\"form-check-input\" type=\"radio\" name=\"gioitinh\" id=\"flexRadioDefault1\" value=\"0\" checked>\r\n");
      out.write("                           			 <label class=\"form-check-label\" for=\"flexRadioDefault1\"> Nam</label>\r\n");
      out.write("                        	 	</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"col-1\">\r\n");
      out.write("								<div class=\"form-check\">\r\n");
      out.write("                           			<input class=\"form-check-input\" type=\"radio\" name=\"gioitinh\" id=\"flexRadioDefault2\" value=\"1\" >\r\n");
      out.write("                            		<label class=\"form-check-label\" for=\"flexRadioDefault2\"> Nữ</label>			\r\n");
      out.write("								</div>\r\n");
      out.write("                        	</div>\r\n");
      out.write("                        	\r\n");
      out.write("                        	<div class=\"col-10\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                       \r\n");
      out.write("\r\n");
      out.write("                          <div class=\"mb-3\">\r\n");
      out.write("                 			 <label for=\"exampleInputEmail1\" class=\"form-label\">Email</label>\r\n");
      out.write("                 			 <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" >\r\n");
      out.write("                		 </div>\r\n");
      out.write("                           \r\n");
      out.write("                           \r\n");
      out.write("                          <div>\r\n");
      out.write("                       		 <label for=\"passwd\" class=\"form-label\">Password</label>\r\n");
      out.write("                          	<input type=\"password\" name=\"passwd\" id=\"passwd\" class=\"form-control\">\r\n");
      out.write("                      	 </div>\r\n");
      out.write("                      	 \r\n");
      out.write("                      	  \r\n");
      out.write("                        \r\n");
      out.write("                        <div>\r\n");
      out.write("                       		 <label for=\"phone\" class=\"form-label\"> Phone</label>\r\n");
      out.write("                       		 <input type=\"text\" name=\"phone\" id=\"phone\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                           \r\n");
      out.write("                           \r\n");
      out.write("                         <div>\r\n");
      out.write("                         	 <label for=\"diachi\" class=\"form-label\"> Địa chỉ</label>\r\n");
      out.write("                       		 <input type=\"text\" name=\"diachi\" id=\"diachi\" class=\"form-control\"> \r\n");
      out.write("                         </div>\r\n");
      out.write("                        \r\n");
      out.write("                          <div>\r\n");
      out.write("                         	 <label for=\"status\" class=\"form-label\">Trạng Thái</label>\r\n");
      out.write("                       		 <input type=\"text\" name=\"status\" id=\"status\" class=\"form-control\"> \r\n");
      out.write("                         </div>\r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("                       <div>\r\n");
      out.write("                       		<label for=\"tentk\" class=\"form-label\"> Tài khoản</label>\r\n");
      out.write("                        	 <input type=\"text\" name=\"tentk\" id=\"tentk\" class=\"form-control\">\r\n");
      out.write("                       </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                        	<div class=\"col-1\"><button class=\"btn btn-outline-success mt-4\" value=\"0\" name=\"addNV\">Add</button></div>\r\n");
      out.write("                        	<div class=\"col-1\"><button class=\"btn btn-outline-success mt-4\" value=\"1\" name=\"updateNV\">Update</button></div>\r\n");
      out.write("                        	<div class=\"col-1\"><button class=\"btn btn-outline-success mt-4\" value=\"2\" name=\"deleteNV\">Delete</button></div>\r\n");
      out.write("                        	<div class=\"9\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <span class=\"h4 text-warning \">Danh sách nhân viên</span><br>\r\n");
      out.write("                    <table class=\"table table-bordered table-responsive m-2\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <th>Id_NV</th>\r\n");
      out.write("                            <th>Id_AD</th>\r\n");
      out.write("                            <th>HoTen</th>\r\n");
      out.write("                            <th>Giới tính</th>\r\n");
      out.write("                            <th>Email</th>\r\n");
      out.write("                            <th>Password</th>\r\n");
      out.write("                            <th>Phone</th>\r\n");
      out.write("                            <th>Địa chỉ</th>\r\n");
      out.write("                            <th>Trạng thái</th>\r\n");
      out.write("                            <th>TenTK</th>\r\n");
      out.write("                            \r\n");
      out.write("                           \r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("							\r\n");
      out.write("                        </tbody>\r\n");
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                    \r\n");
      out.write("				</div>\r\n");
      out.write("              \r\n");
      out.write("        </header>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>   \r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /views/admin/index.jsp(119,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      // /views/admin/index.jsp(119,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/views/admin/index.jsp(119,7) '${indexadmin}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${indexadmin}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("								<tr>\r\n");
            out.write("									<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.hoten}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("									<td> ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.diachi}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("									<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(" </td>\r\n");
            out.write("									<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.sdt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("  </td>\r\n");
            out.write("									<td> ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.tentk}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(" </td>\r\n");
            out.write("		\r\n");
            out.write("								\r\n");
            out.write("								\r\n");
            out.write("								 </tr>\r\n");
            out.write("						\r\n");
            out.write("							");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
