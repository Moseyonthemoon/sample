package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.Pet;
import dao.User;


public class Selectpet {
	public static List<Pet> select(){
		Connection ct = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Pet> list = new ArrayList<Pet>();
		try {
			ct = DBconnection.getConnection();
			String sql = "select * from pet";
			ps = ct.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String amount = rs.getString("amount");
				String type = rs.getString("type");
				String comment = rs.getString("comment");
				Pet pet = new Pet(name, amount, type, comment);
				list.add(pet);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}
