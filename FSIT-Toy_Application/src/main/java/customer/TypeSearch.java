package customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import databaseConnection.DbUtility;

public class TypeSearch {
	List<Toy> ToyTypeList;

	public List<Toy> getToys() {
		try {
			Connection conn = DbUtility.getNetwork();

			String sql = "select distinct toy_type from toy";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ToyTypeList = new ArrayList<Toy>();

			while (rs.next()) {
				Toy toy = new Toy();
				toy.setToyType(rs.getString("toy_type"));
				ToyTypeList.add(toy);
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return ToyTypeList;
	}

}
