package customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.naming.InvalidNameException;

import databaseConnection.DbUtility;

public class Customer {
	String CustomerName;
	String CustomerPassword;
	String CustomerCity;
	int CustomerZip;
	String CustomerCountry;
	String CustomerState;
	static int customerId;

	/**
	 * @param customerName
	 * @param customerPassword
	 * @param customerCity
	 * @param customerZip
	 * @param customerCountry
	 * @param customerState
	 */

	Scanner s = new Scanner(System.in);

	// Getter Setter for storing and getting the information about customer in
	// database and for login credentials
	public String getCustopmerName() {
		return CustomerName;
	}

	public void setCustopmerName(String customerName) {
		this.CustomerName = customerName;
	}

	public String getCustomerPassword() {
		return CustomerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.CustomerPassword = customerPassword;
	}

	public String getCustomerCity() {
		return CustomerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.CustomerCity = customerCity;
	}

	public int getCustomerZip() {
		return CustomerZip;
	}

	public void setCustomerZip(int customerZip) {
		this.CustomerZip = customerZip;
	}

	public String getCustomerCountry() {
		return CustomerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.CustomerCountry = customerCountry;
	}

	public String getCustomerState() {
		return CustomerState;
	}

	public void setCustomerState(String customerState) {
		this.CustomerState = customerState;
	}

	public static int getCustomerId() {
		return customerId;
	}

	public static void setCustomerId(int customerId) {
		Customer.customerId = customerId;
	}

	Customer(String name) throws InvalidNameException {
		if (name.length() < 6) {
			throw new InvalidNameException();
		}

	}

	Customer(String customerPassword, String customerCity, int customerZip, String customerCountry, // overloading the
																									// constructor
			String customerState) {

		this.CustomerPassword = customerPassword;
		setCustomerPassword(this.CustomerPassword);

		this.CustomerCity = customerCity;
		setCustomerCity(this.CustomerCity);

		this.CustomerZip = customerZip;
		setCustomerZip(this.CustomerZip);

		this.CustomerCountry = customerCountry;
		setCustomerCountry(this.CustomerCountry);

		this.CustomerState = customerState;
		setCustomerState(this.CustomerState);

	}

	// Registration page
	public static void registration() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int x = 1;
		do {
			try {
				Connection conn = DbUtility.getNetwork();
				System.out.print("customer name: ");
				String k = s.nextLine();
				String regex = "^[a-zA-Z]+$";
				if (k.matches(regex)) {
					Customer obj1 = new Customer(k);
					obj1.setCustopmerName(k);
					// System.out.println(obj1.getCustopmerName());

					String sql1 = "insert into Customer(customer_name) values(?)";
					PreparedStatement stmt1 = conn.prepareStatement(sql1);
					stmt1.setString(1, obj1.getCustopmerName());
					stmt1.executeUpdate();

					stmt1.close();

					String sql2 = "select customer_id from customer where customer_name=?";
					PreparedStatement stmt2 = conn.prepareStatement(sql2);
					stmt2.setString(1, obj1.getCustopmerName());
					ResultSet rs2 = stmt2.executeQuery();
					while (rs2.next()) {
						GetCustomerId.setId(rs2.getInt("customer_id"));
					}
					rs2.close();
					stmt2.close();
					conn.close();
					x = 2;
				} else {
					System.out.println("customer name should not contain any symbol and integer value");
				}
			} catch (InvalidNameException e) {
				System.out.println("customer name should contain minimum 6 characters");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (x == 1);

		System.out.print("Password: ");
		Customer obj2 = new Customer(s.nextLine(), null, x, null, null);// override the constructor

		System.out.print("City: ");
		Customer obj3 = new Customer(obj2.getCustomerPassword(), s.nextLine(), x, null, null);// override the
																								// constructor

		System.out.print("Zip: ");
		Customer obj4 = new Customer(obj3.getCustomerPassword(), obj3.getCustomerCity(), s.nextInt(), null, null);// override
																													// the
																													// constructor
		s.nextLine();
		System.out.print("country: ");
		Customer obj5 = new Customer(obj4.getCustomerPassword(), obj4.getCustomerCity(), obj4.getCustomerZip(), // override
																												// the
																												// constructor
				s.nextLine(), null);

		System.out.print("State: ");
		Customer obj6 = new Customer(obj5.getCustomerPassword(), obj5.getCustomerCity(), obj5.getCustomerZip(), // override
																												// the
																												// constructor
				obj5.getCustomerCountry(), s.nextLine());

		try {
			Connection conn = DbUtility.getNetwork();
			String sql3 = "update customer set pass_word=?, city=?,state=?, zip=?,country=? where customer_id=?";
			PreparedStatement stmt = conn.prepareStatement(sql3);
			stmt.setString(1, obj6.getCustomerPassword());
			stmt.setString(2, obj6.getCustomerCity());
			stmt.setString(3, obj6.getCustomerState());
			stmt.setInt(4, obj6.getCustomerZip());
			stmt.setString(5, obj6.getCustomerCountry());
			stmt.setInt(6, GetCustomerId.getId());
			stmt.execute();

			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("registration is done");
		System.out.println("you can login now");
		Customer.LoginPage();

	}

	Customer(String customerName, String customerPassword) {// overloading the constructor
		this.CustomerName = customerName;
		setCustopmerName(this.CustomerName);

		this.CustomerPassword = customerPassword;
		setCustomerPassword(this.CustomerPassword);
	}

	// Login page
	public static void LoginPage() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("Customer Name: ");
		Customer log1 = new Customer(s.nextLine(), null);

		System.out.print("Password: ");
		Customer log2 = new Customer(log1.getCustopmerName(), s.nextLine());

		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select * from customer where Customer_name=? and Pass_word=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, log2.getCustopmerName());
			stmt.setString(2, (log2.getCustomerPassword()));
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {

				System.out.println("Welcome " + log2.getCustopmerName());

				log2.setCustomerState(rs.getString("State"));
				log2.setCustomerCity(rs.getString("city"));
				log2.setCustomerCountry(rs.getString("country"));
				log2.setCustomerZip(rs.getInt("zip"));
				Customer.setCustomerId(rs.getInt("customer_id"));
				// System.out.println(Customer.getCustomerId());
				ToyServiceImpl bye = new ToyServiceImpl();
				bye.search();

			} else {

				System.out.println("username or password is incorrect");
				// CustomerServiceImpl customerService = new CustomerServiceImpl();
				// customerService.getCustomers();
				Customer.LoginPage();
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			

			e.printStackTrace();

		}
	}

}
