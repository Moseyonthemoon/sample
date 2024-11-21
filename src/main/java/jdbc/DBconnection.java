package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnection {
	public static String driver = "com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://127.0.0.1:3306/pets?useSSL=false&serverTimezone=UTC";
	public static final String user = "root";
	public static final String password = "123456";
	static {
		try {
			Class.forName(driver);
		}catch(Exception o){
			
		}
	}
	public static Connection getConnection() {
		Connection ct = null;
		try {
			ct = DriverManager.getConnection(url, user, password);
		}catch(Exception o){
			
		}
		return ct;
	}
	public static void close(ResultSet rs,Statement stat,Connection conn) {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(stat!=null) {
				stat.close();
			}
			if(conn!=null) {
				conn.close();
			}
		}catch(Exception o){
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DBconnection.getConnection());
	}

}
