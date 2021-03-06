package co.jp.netwisdom.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jp.netwisdom.dao.UserinfoDAO;
import co.jp.netwisdom.dto.UserinfoAndHobbyDTO;
import co.jp.netwisdom.entity.UserinfoAndHobby;

public class InitServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		System.out.println(username);
		
		UserinfoDAO dao = new UserinfoDAO();
		List<UserinfoAndHobby> list = dao.selectUserInfoAndHobby(username);
		
		// 创建一个存放UserinfoAndHobbyDTO的List
		List<UserinfoAndHobbyDTO> dtos = new ArrayList<>();
		
		// 创建一个存放name的容器 List
		List<String> nameList = new ArrayList<>();
		
		for(UserinfoAndHobby one:list){
			// 判断nameList里面有没有当前循环的名字
			// 不包含的情况
			if(!nameList.contains(one.getUsername())){
				// 把当前循环的名字放入nameList里面
				nameList.add(one.getUsername());
				// 通过构造方法创建dto
				UserinfoAndHobbyDTO dto = new UserinfoAndHobbyDTO(
						one.getUsername(),
						one.getPassword(),
						one.getSex(),
						one.getMajor(),
						one.getIntro()
						);
				List<String> hobbyList = new ArrayList<>();
				// 把当前循环的hobby放入hobbyList当中
				hobbyList.add(one.getHobby());
				// 给dto的hobbyList属性设置，存有当前循环的hobbyList。
				dto.setHobbyList(hobbyList);
				dtos.add(dto);
			// 包含的情况
			}else{
				// 循环dtos，找到与当前名字相符合的dto
				for(UserinfoAndHobbyDTO dto:dtos){
					// 外层循环的名字==dto的名字
					if(dto.getUsername().equals(one.getUsername())){
						// 向当前dto的hobbyList当中放入当前循环的hobby
						dto.getHobbyList().add(one.getHobby());
					}
				}
			}
			
		}
		
		req.setAttribute("dto", dtos.get(0));
				
		req.getRequestDispatcher("register.jsp").forward(req, resp);
				
	
	
	}

}
