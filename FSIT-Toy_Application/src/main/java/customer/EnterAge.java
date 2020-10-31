package customer;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.Scanner;

import My_Exception.InvalidAgeException;
import databaseConnection.DbUtility;

public class EnterAge {

	public static void age() throws InvalidAgeException {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("enter the age of the child: ");
		int age = s.nextInt();
		s.nextLine();
		if (age >= 0 && age < 3) {

			try {
				Connection conn = DbUtility.getNetwork();
				String sql = "select toy_id,toy_name from Toy where min_age=1 and max_age=3";
				Statement stmt = conn.createStatement();
				stmt.executeQuery(sql);
				ResultSet rs = stmt.getResultSet();

				while (rs.next()) {
					// invoking and displaying the data about toys
					System.out.println(
							"Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name: " + rs.getString("toy_name"));

				}

				rs.close();
				stmt.close();
				conn.close();
				ToyServiceImpl p = new ToyServiceImpl();
				p.display();

			} catch (Exception e) {

			}

		} else if (age >= 3 && age < 5) {
			try {
				Connection conn = DbUtility.getNetwork();
				String sql = "select toy_id,toy_name from Toy where min_age=3 and max_age=5";
				Statement stmt = conn.createStatement();
				stmt.executeQuery(sql);
				ResultSet rs = stmt.getResultSet();

				while (rs.next()) {
					// invoking and displaying the data about toys
					System.out.println(
							"Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name: " + rs.getString("toy_name"));

				}

				rs.close();
				stmt.close();
				conn.close();

				ToyServiceImpl p = new ToyServiceImpl();
				p.display();

			} catch (Exception e) {

			}

		} else if (age >= 5 && age < 8) {
			try {
				Connection conn = DbUtility.getNetwork();
				String sql = "select toy_id,toy_name from Toy where min_age=5 and max_age=8";
				Statement stmt = conn.createStatement();
				stmt.executeQuery(sql);
				ResultSet rs = stmt.getResultSet();

				while (rs.next()) {
					// invoking and displaying the data about toys
					System.out.println(
							"Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name: " + rs.getString("toy_name"));

				}

				rs.close();
				stmt.close();
				conn.close();

				ToyServiceImpl p = new ToyServiceImpl();
				p.display();

			} catch (Exception e) {

			}

		} else if (age >= 8 && age < 12) {
			try {
				Connection conn = DbUtility.getNetwork();
				String sql = "select toy_id,toy_name from Toy where min_age=8 and max_age=12";
				Statement stmt = conn.createStatement();
				stmt.executeQuery(sql);
				ResultSet rs = stmt.getResultSet();
				// invoking and displaying the data about toys
				while (rs.next()) {

					System.out.println(
							"Toy Id: " + rs.getString("toy_id") + "   " + "Toy Name: " + rs.getString("toy_name"));

				}

				rs.close();
				stmt.close();
				conn.close();

				ToyServiceImpl p = new ToyServiceImpl();// creating the object of ToyServiceImpl
				p.display();

			} catch (Exception e) {

			}

		} else {
			throw new InvalidAgeException();

		}

	}
}
