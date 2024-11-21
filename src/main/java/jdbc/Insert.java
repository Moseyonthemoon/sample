package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Insert {
	public int insert(String account,String pwd,String mail) {
		Connection ct = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			ct = DBconnection.getConnection();
			String sql = "insert user(account,pwd,mail) values(?,?,?);";
			ps = ct.prepareStatement(sql);
			ps.setString(1, account);
			ps.setString(2, pwd);
			ps.setString(3, mail);
			row = ps.executeUpdate();
		}catch(Exception o) {
			
		}finally {
			DBconnection.close(null, ps, ct);
		}
		return row;
	}
}
