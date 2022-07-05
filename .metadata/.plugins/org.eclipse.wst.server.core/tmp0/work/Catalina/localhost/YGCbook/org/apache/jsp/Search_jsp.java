/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2022-07-05 08:21:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import co.jp.netwisdom.dto.UserinfoAndHobbyDTO;
import java.util.List;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>用户查询</title>\r\n");
 List<UserinfoAndHobbyDTO> dtos = (List<UserinfoAndHobbyDTO>)request.getAttribute("dtos");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"search\" method=\"get\">\r\n");
      out.write("\t\t<label for=\"username\">姓名：</label>\r\n");
      out.write("\t\t<input type=\"text\" id=\"username\" name=\"username\" />\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<label for=\"sex1\">性别：</label>\r\n");
      out.write("\t\t<input type=\"radio\" id=\"sex1\" name=\"sex\" value=\"0\" />男\r\n");
      out.write("\t\t<input type=\"radio\" id=\"sex1\" name=\"sex\" value=\"1\" />女\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<label for=\"major\">专业：</label>\r\n");
      out.write("\t\t<select id=\"major\" name=\"major\">\r\n");
      out.write("\t\t\t<option value=\"\">-</option>\r\n");
      out.write("\t\t\t<option value=\"0\">计算机</option>\r\n");
      out.write("\t\t\t<option value=\"1\">数学</option>\r\n");
      out.write("\t\t\t<option value=\"2\">英语</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"提交\" />\r\n");
      out.write("\t\t<input type=\"reset\" value=\"重置\" />\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>姓名</th>\r\n");
      out.write("\t\t\t<th>性别</th>\r\n");
      out.write("\t\t\t<th>专业</th>\r\n");
      out.write("\t\t\t<th>爱好</th>\r\n");
      out.write("\t\t\t<th>简介</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
 if(dtos!=null){ 
      out.write("\r\n");
      out.write("\t\t\t");
 for(UserinfoAndHobbyDTO dto :dtos){
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(dto.getUsername() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(dto.getSex().replace("0", "男").replace("1", "女"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(dto.getMajor().replace("0", "计算机").replace("1", "数学").replace("2", "英语") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t");
      out.print(dto.getHobbyList().contains("0")?"足球":"");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print(dto.getHobbyList().contains("1")?"篮球":"");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print(dto.getHobbyList().contains("2")?"网球":"");
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(dto.getIntro() );
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
