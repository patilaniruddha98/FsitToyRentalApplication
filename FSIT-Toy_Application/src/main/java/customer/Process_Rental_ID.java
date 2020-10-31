package customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import databaseConnection.DbUtility;

public class Process_Rental_ID extends ToyServiceImpl {
	static Rental_ID z1 = new Rental_ID();
	static Rental_ID z2 = new Rental_ID();
	static Rental_ID z3 = new Rental_ID();
	static Rental_ID z4 = new Rental_ID();
	static Rental_ID z5 = new Rental_ID();
	static Rental_ID z6 = new Rental_ID();
	static Rental_ID z7 = new Rental_ID();
	static Rental_ID z8 = new Rental_ID();
	static Rental_ID z9 = new Rental_ID();
	static Rental_ID z10 = new Rental_ID();

	public static void myrentalId_1() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Customer.getCustomerId());
		stmt.setInt(2, t.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			z1.setRentalId(rs.getInt("Rental_id"));
		}

		System.out.println("your order id for item 1: " + z1.getRentalId());

		rs.close();
		stmt.close();
		conn.close();

	}

	// *****************************************************************************************************************

	public static void myrentalId_2() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Customer.getCustomerId());
		stmt.setInt(2, t1.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			z2.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 2: " + z2.getRentalId());
		rs.close();
		stmt.close();
		conn.close();

	}

	// *****************************************************************************************************************

	public static void myrentalId_3() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Customer.getCustomerId());
		stmt.setInt(2, t2.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			z3.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 3: " + z3.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// *****************************************************************************************************************

	public static void myrentalId_4() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Customer.getCustomerId());
		stmt.setInt(2, t3.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			z4.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 4: " + z4.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// *************************************************************************************************************************
	public static void myrentalId_5() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Customer.getCustomerId());
		stmt.setInt(2, t4.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			z5.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 5: " + z5.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// *************************************************************************************************************************
	public static void myrentalId_6() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Customer.getCustomerId());
		stmt.setInt(2, t5.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			z6.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 6: " + z6.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// *************************************************************************************************************************
	public static void myrentalId_7() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Customer.getCustomerId());
		stmt.setInt(2, t6.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			z7.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 7: " + z7.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// *************************************************************************************************************************
	public static void myrentalId_8() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Customer.getCustomerId());
		stmt.setInt(2, t7.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			z8.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 8: " + z8.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// ***********************************************************************************************
	public static void myrentalId_9() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Customer.getCustomerId());
		stmt.setInt(2, t8.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			z9.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 9: " + z9.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// ***********************************************************************************************
	public static void myrentalId_10() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Customer.getCustomerId());
		stmt.setInt(2, t9.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			z10.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 10: " + z10.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

}
