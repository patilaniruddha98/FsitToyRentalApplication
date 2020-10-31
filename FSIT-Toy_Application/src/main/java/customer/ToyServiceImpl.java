package customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import databaseConnection.DbUtility;

public class ToyServiceImpl implements ToyService {

	// initializing the objects of Toy class for displaying the toys information
	// that customer want to know
	protected static Toy t = new Toy();
	protected static Toy t1 = new Toy();
	protected static Toy t2 = new Toy();
	protected static Toy t3 = new Toy();
	protected static Toy t4 = new Toy();
	protected static Toy t5 = new Toy();
	protected static Toy t6 = new Toy();
	protected static Toy t7 = new Toy();
	protected static Toy t8 = new Toy();
	protected static Toy t9 = new Toy();
	protected static int[] arr = new int[10];

	// inserting new toys into the database
	public void insert() {

	}

// searching the toys 
	public void search() {

		int x = 1;
		do {
			try {

				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.println(
						"enter 0 to search toys with respect to age and 1 to search toys with respect to type of toy");
				System.out.println("enter 2 to return the toy");
				System.out.println("enter 3 to check your order details");

				int a = s.nextInt();
				if (a == 0) {

					EnterAge.age();// redirect to the page -search toys with respect to age group

				} else if (a == 1) {

					System.out.println("type of toys available: ");

					TypeSearch rentalService = new TypeSearch(); // list the toy types available
					List<Toy> ToyTypeList = rentalService.getToys();
					for (Toy toytype : ToyTypeList) {// print the list of types of toys available
						System.out.println(toytype);
					}
					EnterYourType.mytype();// redirect to the page- search toys with respect to toy type

				} else if (a == 2) {

					ToyServiceImpl.returnToy();

				} else if (a == 3) {

					CustomerServiceImpl ayhy = new CustomerServiceImpl();
					ayhy.search();

				} else {
					System.out.println("wrong input");
					ToyServiceImpl m = new ToyServiceImpl();// creating an object of same class
					m.search();// calling the search() method after wrong input
				}
				x = 2;
			} catch (Exception e) {
				System.out.println("wrong input");// catching Exception
			}
		} while (x == 1);// run in loop after exception occurs
	}

	// displaying the information of toys that customer want to know
	public void display() {

		try {
			Connection conn = DbUtility.getNetwork();

			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			System.out.println("enter toy id which you want to take on rent: ");
			int d = s.nextInt();
			String sql = "select*from toy where toy_id=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, d);
			ResultSet rs = stmt.executeQuery();

			if (arr[0] == 0) {
				while (rs.next()) {
					// invoking the data about toys from the toy table
					t.setToyId(rs.getInt("Toy_id"));
					t.setToyName(rs.getString("Toy_name"));
					t.setToyType(rs.getString("Toy_type"));
					t.setMaxAge(rs.getInt("min_age"));
					t.setMinAge(rs.getInt("max_age"));
					t.setPrice(rs.getInt("price"));
					t.setQuantity(rs.getInt("quantity"));
					t.setRentalAmount(rs.getInt("rental_amount"));

				}
				// displaying the data related to toys which is invoking from database
				System.out.println("Toy id:        " + t.getToyId());
				System.out.println("Toy name:      " + t.getToyName());
				System.out.println("Toy type:      " + t.getToyType());
				System.out.println("Minimum age:   " + t.getMinAge());
				System.out.println("Maximum age:   " + t.getMaxAge());
				System.out.println("Price:         " + t.getPrice());
				System.out.println("Quantity:      " + t.getQuantity());
				System.out.println("Rental amount: " + t.getRentalAmount());

				CartActivity.cart_activity();// redirect to page where cart activities are going to happen
			} else if (arr[0] != 0 && arr[1] == 0) {
				while (rs.next()) {
					// invoking the data about toys from the toy table
					t1.setToyId(rs.getInt("Toy_id"));
					t1.setToyName(rs.getString("Toy_name"));
					t1.setToyType(rs.getString("Toy_type"));
					t1.setMaxAge(rs.getInt("min_age"));
					t1.setMinAge(rs.getInt("max_age"));
					t1.setPrice(rs.getInt("price"));
					t1.setQuantity(rs.getInt("quantity"));
					t1.setRentalAmount(rs.getInt("rental_amount"));

				}
				// displaying the data related to toys which is invoking from database
				System.out.println("Toy id:        " + t1.getToyId());
				System.out.println("Toy name:      " + t1.getToyName());
				System.out.println("Toy type:      " + t1.getToyType());
				System.out.println("Minimum age:   " + t1.getMinAge());
				System.out.println("Maximum age:   " + t1.getMaxAge());
				System.out.println("Price:         " + t1.getPrice());
				System.out.println("Quantity:      " + t1.getQuantity());
				System.out.println("Rental amount: " + t1.getRentalAmount());

				CartActivity.cart_activity();// redirect to page where cart activities are going to happen

			} else if (arr[0] != 0 && arr[1] != 0 && arr[2] == 0) {
				while (rs.next()) {
					// invoking the data about toys from the toy table
					t2.setToyId(rs.getInt("Toy_id"));
					t2.setToyName(rs.getString("Toy_name"));
					t2.setToyType(rs.getString("Toy_type"));
					t2.setMaxAge(rs.getInt("min_age"));
					t2.setMinAge(rs.getInt("max_age"));
					t2.setPrice(rs.getInt("price"));
					t2.setQuantity(rs.getInt("quantity"));
					t2.setRentalAmount(rs.getInt("rental_amount"));

				}
				// displaying the data related to toys which is invoking from database
				System.out.println("Toy id:        " + t2.getToyId());
				System.out.println("Toy name:      " + t2.getToyName());
				System.out.println("Toy type:      " + t2.getToyType());
				System.out.println("Minimum age:   " + t2.getMinAge());
				System.out.println("Maximum age:   " + t2.getMaxAge());
				System.out.println("Price:         " + t2.getPrice());
				System.out.println("Quantity:      " + t2.getQuantity());
				System.out.println("Rental amount: " + t2.getRentalAmount());

				CartActivity.cart_activity();// redirect to page where cart activities are going to happen
			} else if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] == 0) {
				while (rs.next()) {
					// invoking the data about toys from the toy table
					t3.setToyId(rs.getInt("Toy_id"));
					t3.setToyName(rs.getString("Toy_name"));
					t3.setToyType(rs.getString("Toy_type"));
					t3.setMaxAge(rs.getInt("min_age"));
					t3.setMinAge(rs.getInt("max_age"));
					t3.setPrice(rs.getInt("price"));
					t3.setQuantity(rs.getInt("quantity"));
					t3.setRentalAmount(rs.getInt("rental_amount"));

				}
				// displaying the data related to toys which is invoking from database
				System.out.println("Toy id:        " + t3.getToyId());
				System.out.println("Toy name:      " + t3.getToyName());
				System.out.println("Toy type:      " + t3.getToyType());
				System.out.println("Minimum age:   " + t3.getMinAge());
				System.out.println("Maximum age:   " + t3.getMaxAge());
				System.out.println("Price:         " + t3.getPrice());
				System.out.println("Quantity:      " + t3.getQuantity());
				System.out.println("Rental amount: " + t3.getRentalAmount());

				CartActivity.cart_activity();// redirect to page where cart activities are going to happen

			} else if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 && arr[4] == 0) {
				while (rs.next()) {
					// invoking the data about toys from the toy table
					t4.setToyId(rs.getInt("Toy_id"));
					t4.setToyName(rs.getString("Toy_name"));
					t4.setToyType(rs.getString("Toy_type"));
					t4.setMaxAge(rs.getInt("min_age"));
					t4.setMinAge(rs.getInt("max_age"));
					t4.setPrice(rs.getInt("price"));
					t4.setQuantity(rs.getInt("quantity"));
					t4.setRentalAmount(rs.getInt("rental_amount"));

				}
				// displaying the data related to toys which is invoking from database
				System.out.println("Toy id:        " + t4.getToyId());
				System.out.println("Toy name:      " + t4.getToyName());
				System.out.println("Toy type:      " + t4.getToyType());
				System.out.println("Minimum age:   " + t4.getMinAge());
				System.out.println("Maximum age:   " + t4.getMaxAge());
				System.out.println("Price:         " + t4.getPrice());
				System.out.println("Quantity:      " + t4.getQuantity());
				System.out.println("Rental amount: " + t4.getRentalAmount());

				CartActivity.cart_activity();// redirect to page where cart activities are going to happen

			} else if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 && arr[4] != 0 && arr[5] == 0) {
				while (rs.next()) {
					// invoking the data about toys from the toy table
					t5.setToyId(rs.getInt("Toy_id"));
					t5.setToyName(rs.getString("Toy_name"));
					t5.setToyType(rs.getString("Toy_type"));
					t5.setMaxAge(rs.getInt("min_age"));
					t5.setMinAge(rs.getInt("max_age"));
					t5.setPrice(rs.getInt("price"));
					t5.setQuantity(rs.getInt("quantity"));
					t5.setRentalAmount(rs.getInt("rental_amount"));

				}
				// displaying the data related to toys which is invoking from database
				System.out.println("Toy id:        " + t5.getToyId());
				System.out.println("Toy name:      " + t5.getToyName());
				System.out.println("Toy type:      " + t5.getToyType());
				System.out.println("Minimum age:   " + t5.getMinAge());
				System.out.println("Maximum age:   " + t5.getMaxAge());
				System.out.println("Price:         " + t5.getPrice());
				System.out.println("Quantity:      " + t5.getQuantity());
				System.out.println("Rental amount: " + t5.getRentalAmount());

				CartActivity.cart_activity();// redirect to page where cart activities are going to happen

			} else if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 && arr[4] != 0 && arr[5] != 0
					&& arr[6] == 0) {
				while (rs.next()) {
					// invoking the data about toys from the toy table
					t6.setToyId(rs.getInt("Toy_id"));
					t6.setToyName(rs.getString("Toy_name"));
					t6.setToyType(rs.getString("Toy_type"));
					t6.setMaxAge(rs.getInt("min_age"));
					t6.setMinAge(rs.getInt("max_age"));
					t6.setPrice(rs.getInt("price"));
					t6.setQuantity(rs.getInt("quantity"));
					t6.setRentalAmount(rs.getInt("rental_amount"));

				}
				// displaying the data related to toys which is invoking from database
				System.out.println("Toy id:        " + t6.getToyId());
				System.out.println("Toy name:      " + t6.getToyName());
				System.out.println("Toy type:      " + t6.getToyType());
				System.out.println("Minimum age:   " + t6.getMinAge());
				System.out.println("Maximum age:   " + t6.getMaxAge());
				System.out.println("Price:         " + t6.getPrice());
				System.out.println("Quantity:      " + t6.getQuantity());
				System.out.println("Rental amount: " + t6.getRentalAmount());

				CartActivity.cart_activity();// redirect to page where cart activities are going to happen

			} else if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 && arr[4] != 0 && arr[5] != 0
					&& arr[6] != 0 && arr[7] == 0) {
				while (rs.next()) {
					// invoking the data about toys from the toy table
					t7.setToyId(rs.getInt("Toy_id"));
					t7.setToyName(rs.getString("Toy_name"));
					t7.setToyType(rs.getString("Toy_type"));
					t7.setMaxAge(rs.getInt("min_age"));
					t7.setMinAge(rs.getInt("max_age"));
					t7.setPrice(rs.getInt("price"));
					t7.setQuantity(rs.getInt("quantity"));
					t7.setRentalAmount(rs.getInt("rental_amount"));

				}
				// displaying the data related to toys which is invoking from database
				System.out.println("Toy id:        " + t7.getToyId());
				System.out.println("Toy name:      " + t7.getToyName());
				System.out.println("Toy type:      " + t7.getToyType());
				System.out.println("Minimum age:   " + t7.getMinAge());
				System.out.println("Maximum age:   " + t7.getMaxAge());
				System.out.println("Price:         " + t7.getPrice());
				System.out.println("Quantity:      " + t7.getQuantity());
				System.out.println("Rental amount: " + t7.getRentalAmount());

				CartActivity.cart_activity();// redirect to page where cart activities are going to happen

			} else if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 && arr[4] != 0 && arr[5] != 0
					&& arr[6] != 0 && arr[7] != 0 && arr[8] == 0) {
				while (rs.next()) {
					// invoking the data about toys from the toy table
					t8.setToyId(rs.getInt("Toy_id"));
					t8.setToyName(rs.getString("Toy_name"));
					t8.setToyType(rs.getString("Toy_type"));
					t8.setMaxAge(rs.getInt("min_age"));
					t8.setMinAge(rs.getInt("max_age"));
					t8.setPrice(rs.getInt("price"));
					t8.setQuantity(rs.getInt("quantity"));
					t8.setRentalAmount(rs.getInt("rental_amount"));

				}
				// displaying the data related to toys which is invoking from database
				System.out.println("Toy id:        " + t8.getToyId());
				System.out.println("Toy name:      " + t8.getToyName());
				System.out.println("Toy type:      " + t8.getToyType());
				System.out.println("Minimum age:   " + t8.getMinAge());
				System.out.println("Maximum age:   " + t8.getMaxAge());
				System.out.println("Price:         " + t8.getPrice());
				System.out.println("Quantity:      " + t8.getQuantity());
				System.out.println("Rental amount: " + t8.getRentalAmount());

				CartActivity.cart_activity();// redirect to page where cart activities are going to happen

			} else if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 && arr[4] != 0 && arr[5] != 0
					&& arr[6] != 0 && arr[7] != 0 && arr[8] != 0 && arr[9] == 0) {
				while (rs.next()) {
					// invoking the data about toys from the toy table
					t9.setToyId(rs.getInt("Toy_id"));
					t9.setToyName(rs.getString("Toy_name"));
					t9.setToyType(rs.getString("Toy_type"));
					t9.setMaxAge(rs.getInt("min_age"));
					t9.setMinAge(rs.getInt("max_age"));
					t9.setPrice(rs.getInt("price"));
					t9.setQuantity(rs.getInt("quantity"));
					t9.setRentalAmount(rs.getInt("rental_amount"));

				}
				// displaying the data related to toys which is invoking from database
				System.out.println("Toy id:        " + t9.getToyId());
				System.out.println("Toy name:      " + t9.getToyName());
				System.out.println("Toy type:      " + t9.getToyType());
				System.out.println("Minimum age:   " + t9.getMinAge());
				System.out.println("Maximum age:   " + t9.getMaxAge());
				System.out.println("Price:         " + t9.getPrice());
				System.out.println("Quantity:      " + t9.getQuantity());
				System.out.println("Rental amount: " + t9.getRentalAmount());

				CartActivity.cart_activity();// redirect to page where cart activities are going to happen

			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void returnToy() {
		int v = 1;
		do {
			try {
				Connection conn = DbUtility.getNetwork();

				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.print("Enter the rental Id: ");
				int z = s.nextInt();
				v = 2;
				String sql = "update toy_rental set toy_status=? where customer_id=? and Rental_id=?";
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setString(1, "Returned");
				stmt.setInt(2, Customer.getCustomerId());
				stmt.setInt(3, z);
				stmt.executeUpdate();

				System.out.println("Thank you !!");
				System.out.println("your package will be picked by a courier service");

				System.out.println("enter 5  to go home  or 6 to log out or enter any integer to return another item:");
				int d = s.nextInt();
				if (d == 5) {
					ToyServiceImpl bye = new ToyServiceImpl();
					bye.search();

				} else if (d == 6) {
					LoggingOff.loggingMeOff();

				} else {
					ToyServiceImpl.returnToy();

				}

				stmt.close();
				conn.close();

			} catch (Exception e) {
				System.out.println("invalid input");

			}
		} while (v == 1);

	}

}
