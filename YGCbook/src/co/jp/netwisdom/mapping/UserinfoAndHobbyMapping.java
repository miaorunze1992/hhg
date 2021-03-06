package co.jp.netwisdom.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.key.dbManager.IResultSetMapping;
import co.jp.netwisdom.entity.UserinfoAndHobby;

public class UserinfoAndHobbyMapping implements IResultSetMapping{

	@Override
	public UserinfoAndHobby mapping(ResultSet rs) throws SQLException {
		int i = 1;
		UserinfoAndHobby userinfoAndHobby = new UserinfoAndHobby(
				rs.getString(i++),
				rs.getString(i++),
				rs.getString(i++),
				rs.getString(i++),
				rs.getString(i++),
				rs.getString(i++));
		
		return userinfoAndHobby;
	}

}
