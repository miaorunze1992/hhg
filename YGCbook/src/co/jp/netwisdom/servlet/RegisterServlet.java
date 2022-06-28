package co.jp.netwisdom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jp.netwisdom.dao.UserinfoDAO;
import co.jp.netwisdom.entity.Userinfo;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String username  = req.getParameter("username");
		String password  = req.getParameter("password");
		String sex  = req.getParameter("sex");
		String major  = req.getParameter("major");
		String intro  = req.getParameter("intro");
		
		Userinfo userinfo = new Userinfo(username,password,sex,major,intro);
		UserinfoDAO daoForU = new UserinfoDAO();
		boolean rs1 = daoForU.insertUserinfo(userinfo);
		if(rs1){
			System.out.println("用户表插入成功");
		}else{
			System.out.println("用户爱好表插入失败");
		}
		
		String[] hobby  = req.getParameterValues("hobby");
		
		System.out.println(username);
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
