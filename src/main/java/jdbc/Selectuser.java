package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import dao.User;


public class Selectuser {
	public List<User> select(){
		Connection ct = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<User> list = new ArrayList<User>();
		try {
			ct = DBconnection.getConnection();
			String sql = "select * from user";
			ps = ct.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				String account = rs.getString("account");
				String pwd = rs.getString("pwd");
				String mail = rs.getString("mail");
				User user = new User(account, pwd, mail);
				list.add(user);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}
