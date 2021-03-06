package co.jp.netwisdom.dao;

import java.sql.SQLException;
import java.util.List;

import cn.key.dbManager.JdbcTemplate;
import co.jp.netwisdom.entity.Hobby;

public class HobbyDAO {
	
	private JdbcTemplate template = new JdbcTemplate();
	
	public boolean insertHobby(List<Hobby> list){
		
		int row = 0;
		
		String sql = "insert into hobby (username,hobby) values (?,?)";
		
		for (Hobby hobby : list) {
			
			Object[] values = {
					hobby.getUsername(),
					hobby.getHobby()
			};
			
			try {
				row = template.updata(sql, values);
				if(row !=1){
					break;
				}
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return (row == 1);
	}
	

}
