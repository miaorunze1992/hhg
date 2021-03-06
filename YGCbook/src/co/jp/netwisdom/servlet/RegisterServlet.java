package co.jp.netwisdom.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jp.netwisdom.dao.HobbyDAO;
import co.jp.netwisdom.dao.UserinfoDAO;
import co.jp.netwisdom.entity.Hobby;
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

		
		// 0 1 2
		String[] hobbyArray  = req.getParameterValues("hobby");
		
		List<Hobby> hobbyList = new ArrayList<Hobby>(); 
		
		// 转换数据
		for (String hobbyRs : hobbyArray) {
			Hobby hobbyOne = new Hobby(username,hobbyRs);
			hobbyList.add(hobbyOne);
		}
		
		HobbyDAO daoForH = new HobbyDAO();
		boolean rs2 = daoForH.insertHobby(hobbyList);
		
		
		if(rs1 && rs2){
			System.out.println("用户注册成功");
			req.getRequestDispatcher("userSuccess.jsp").forward(req, resp);
		}else{
			System.out.println("用户注册失败");
			req.getRequestDispatcher("userFail.jsp").forward(req, resp);
		}
		
	
	
	}
	
	

}
