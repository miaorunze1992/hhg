package co.jp.netwisdom.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.key.dbManager.JdbcTemplate;
import co.jp.netwisdom.entity.Userinfo;
import co.jp.netwisdom.entity.UserinfoAndHobby;
import co.jp.netwisdom.mapping.UserinfoAndHobbyMapping;

public class UserinfoDAO {
	
	private JdbcTemplate template = new JdbcTemplate();
	
	public boolean insertUserinfo(Userinfo userinfo){
		int row = 0;
		
		String sql = "insert into userinfo (username,password,sex,major,intro) values (?,?,?,?,?)";
		
		Object[] values = {
				userinfo.getUsername(),
				userinfo.getPassword(),
				userinfo.getSex(),
				userinfo.getMajor(),
				userinfo.getIntro()
		};
		try {
			row = template.updata(sql, values);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return (row == 1);
	}

	
	public List<UserinfoAndHobby> selectUserInfoAndHobby(String username){
		
		String sql = "select ui.username,ui.password,ui.sex,ui.major,hb.hobby,ui.intro from userinfo ui left join hobby hb on ui.username=hb.username where 1=1";
		
		sql = sql + " and ui.username = '" + username + "' ";
			
		
		List<UserinfoAndHobby> list = new ArrayList<>();
		
		try {
			list = template.selete(sql, new UserinfoAndHobbyMapping());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
	public List<UserinfoAndHobby> selectUserInfoAndHobby(String username,String sex,String major){
		
		String sql = "select ui.username,ui.password,ui.sex,ui.major,hb.hobby,ui.intro from userinfo ui left join hobby hb on ui.username=hb.username where 1=1";
		
		if(!username.equals("")){
			sql = sql + " and ui.username = '" + username + "' ";
			
		}
		
		if(sex!=null){
			sql = sql + " and sex = '" + sex + "' ";
			
		}
		
		if(!major.equals("")){
			sql = sql + " and major = '" + major + "' ";
			
		}
		
		List<UserinfoAndHobby> list = new ArrayList<>();
		
		try {
			list = template.selete(sql, new UserinfoAndHobbyMapping());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
		
		
		
	}
}
 