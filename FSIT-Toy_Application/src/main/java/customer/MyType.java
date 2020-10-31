package customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import databaseConnection.DbUtility;

public class MyType {

	public static void craft() {
		// TODO Auto-generated method stub
		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select toy_id,toy_name from Toy where toy_type='Craft'";
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {

				System.out.println("Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name" + rs.getString("toy_name"));

			}

			rs.close();
			stmt.close();
			conn.close();
			ToyServiceImpl p = new ToyServiceImpl();
			p.display();
		} catch (Exception e) {

		}

	}

	public static void electric() {
		// TODO Auto-generated method stub
		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select toy_id,toy_name from Toy where toy_type='Electric'";
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {

				System.out.println("Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name" + rs.getString("toy_name"));

			}

			rs.close();
			stmt.close();
			conn.close();
			ToyServiceImpl p = new ToyServiceImpl();
			p.display();
		} catch (Exception e) {

		}

	}

	public static void activity() {
		// TODO Auto-generated method stub
		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select toy_id,toy_name from Toy where toy_type='Activity'";
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {

				System.out.println("Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name" + rs.getString("toy_name"));

			}

			rs.close();
			stmt.close();
			conn.close();
			ToyServiceImpl p = new ToyServiceImpl();
			p.display();
		} catch (Exception e) {

		}

	}

	public static void kitchen() {
		// TODO Auto-generated method stub
		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select toy_id,toy_name from Toy where toy_type='Kitchen'";
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {

				System.out.println("Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name" + rs.getString("toy_name"));

			}

			rs.close();
			stmt.close();
			conn.close();
			ToyServiceImpl p = new ToyServiceImpl();
			p.display();
		} catch (Exception e) {

		}

	}

	public static void wheels() {
		// TODO Auto-generated method stub
		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select toy_id,toy_name from Toy where toy_type='Wheels'";
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {

				System.out.println("Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name" + rs.getString("toy_name"));

			}

			rs.close();
			stmt.close();
			conn.close();
			ToyServiceImpl p = new ToyServiceImpl();
			p.display();
		} catch (Exception e) {

		}

	}

	public static void teddy() {
		// TODO Auto-generated method stub
		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select toy_id,toy_name from Toy where toy_type='Teddy'";
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {

				System.out.println("Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name" + rs.getString("toy_name"));

			}

			rs.close();
			stmt.close();
			conn.close();
			ToyServiceImpl p = new ToyServiceImpl();
			p.display();
		} catch (Exception e) {

		}

	}

	public static void babyCar() {
		// TODO Auto-generated method stub
		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select toy_id,toy_name from Toy where toy_type='Baby Car'";
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {

				System.out.println("Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name" + rs.getString("toy_name"));

			}

			rs.close();
			stmt.close();
			conn.close();
			ToyServiceImpl p = new ToyServiceImpl();
			p.display();
		} catch (Exception e) {

		}

	}

	public static void education() {
		// TODO Auto-generated method stub
		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select toy_id,toy_name from Toy where toy_type='Education'";
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {

				System.out.println("Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name" + rs.getString("toy_name"));

			}

			rs.close();
			stmt.close();
			conn.close();
			ToyServiceImpl p = new ToyServiceImpl();
			p.display();
		} catch (Exception e) {

		}

	}

	public static void puzzle() {
		// TODO Auto-generated method stub
		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select toy_id,toy_name from Toy where toy_type='Puzzle'";
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {

				System.out.println("Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name" + rs.getString("toy_name"));

			}

			rs.close();
			stmt.close();
			conn.close();
			ToyServiceImpl p = new ToyServiceImpl();
			p.display();
		} catch (Exception e) {

		}

	}

	public static void built() {
		// TODO Auto-generated method stub
		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select toy_id,toy_name from Toy where toy_type='Built'";
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {

				System.out.println("Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name" + rs.getString("toy_name"));

			}

			rs.close();
			stmt.close();
			conn.close();
			ToyServiceImpl p = new ToyServiceImpl();
			p.display();
		} catch (Exception e) {

		}

	}

	public static void doll() {
		// TODO Auto-generated method stub
		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select toy_id,toy_name from Toy where toy_type='Doll'";
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {

				System.out.println("Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name" + rs.getString("toy_name"));

			}

			rs.close();
			stmt.close();
			conn.close();
			ToyServiceImpl p = new ToyServiceImpl();
			p.display();
		} catch (Exception e) {

		}

	}

	public static void game() {
		// TODO Auto-generated method stub
		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select toy_id,toy_name from Toy where toy_type='Game'";
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {

				System.out.println("Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name" + rs.getString("toy_name"));

			}

			rs.close();
			stmt.close();
			conn.close();
			ToyServiceImpl p = new ToyServiceImpl();
			p.display();
		} catch (Exception e) {

		}

	}

}
