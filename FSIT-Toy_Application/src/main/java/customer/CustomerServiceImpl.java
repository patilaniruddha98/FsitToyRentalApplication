package customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.InputMismatchException;
import java.util.Scanner;

import databaseConnection.DbUtility;

public class CustomerServiceImpl extends CartActivity implements CustomerService {

	@Override
	public void insert() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			Connection conn = DbUtility.getNetwork();

			if (arr[0] != 0) {
				String sql1 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount,fine,toy_status)"
						+ "values(?,?,?,?,?,?,?,?)";
				PreparedStatement stmt1 = conn.prepareStatement(sql1);
				stmt1.setInt(1, Customer.getCustomerId());
				stmt1.setInt(2, arr[0]);
				stmt1.setString(3, GetDate.getStartdate());
				stmt1.setString(4, GetDate.getEnddate());
				stmt1.setInt(5, r1.getRent());
				stmt1.setLong(6, r1.getTotalAmount());
				stmt1.setInt(7, 0);
				stmt1.setString(8, "On Rent");
				stmt1.executeUpdate();
				stmt1.close();
				Process_Rental_ID.myrentalId_1();

				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[1] != 0) {
				String sql2 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount,fine,toy_status)"
						+ "values(?,?,?,?,?,?,?,?)";
				PreparedStatement stmt2 = conn.prepareStatement(sql2);
				stmt2.setInt(1, Customer.getCustomerId());
				stmt2.setInt(2, arr[1]);
				stmt2.setString(3, GetDate.getStartdate());
				stmt2.setString(4, GetDate.getEnddate());
				stmt2.setInt(5, r2.getRent());
				stmt2.setLong(6, r2.getTotalAmount());
				stmt2.setInt(7, 0);
				stmt2.setString(8, "On Rent");
				stmt2.executeUpdate();

				stmt2.close();
				Process_Rental_ID.myrentalId_2();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}

			// *********************************************************************************************************************************
			if (arr[2] != 0) {
				String sql3 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount,fine,toy_status)"
						+ "values(?,?,?,?,?,?,?,?)";
				PreparedStatement stmt3 = conn.prepareStatement(sql3);
				stmt3.setInt(1, Customer.getCustomerId());
				stmt3.setInt(2, arr[2]);
				stmt3.setString(3, GetDate.getStartdate());
				stmt3.setString(4, GetDate.getEnddate());
				stmt3.setInt(5, r3.getRent());
				stmt3.setLong(6, r3.getTotalAmount());
				stmt3.setInt(7, 0);
				stmt3.setString(8, "On Rent");
				stmt3.executeUpdate();
				stmt3.close();
				Process_Rental_ID.myrentalId_3();

				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************
			if (arr[3] != 0) {
				String sql4 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount,fine,toy_status)"
						+ "values(?,?,?,?,?,?,?,?)";
				PreparedStatement stmt4 = conn.prepareStatement(sql4);
				stmt4.setInt(1, Customer.getCustomerId());
				stmt4.setInt(2, arr[3]);
				stmt4.setString(3, GetDate.getStartdate());
				stmt4.setString(4, GetDate.getEnddate());
				stmt4.setInt(5, r4.getRent());
				stmt4.setLong(6, r4.getTotalAmount());
				stmt4.setInt(7, 0);
				stmt4.setString(8, "On Rent");
				stmt4.executeUpdate();
				stmt4.close();
				Process_Rental_ID.myrentalId_4();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[4] != 0) {
				String sql5 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount,fine,toy_status)"
						+ "values(?,?,?,?,?,?,?,?)";
				PreparedStatement stmt5 = conn.prepareStatement(sql5);
				stmt5.setInt(1, Customer.getCustomerId());
				stmt5.setInt(2, arr[4]);
				stmt5.setString(3, GetDate.getStartdate());
				stmt5.setString(4, GetDate.getEnddate());
				stmt5.setInt(5, r5.getRent());
				stmt5.setLong(6, r5.getTotalAmount());
				stmt5.setInt(7, 0);
				stmt5.setString(8, "On Rent");
				stmt5.executeUpdate();
				stmt5.close();
				Process_Rental_ID.myrentalId_5();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[5] != 0) {
				String sql6 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount,fine,toy_status)"
						+ "values(?,?,?,?,?,?,?,?)";
				PreparedStatement stmt6 = conn.prepareStatement(sql6);
				stmt6.setInt(1, Customer.getCustomerId());
				stmt6.setInt(2, arr[5]);
				stmt6.setString(3, GetDate.getStartdate());
				stmt6.setString(4, GetDate.getEnddate());
				stmt6.setInt(5, r6.getRent());
				stmt6.setLong(6, r6.getTotalAmount());
				stmt6.setInt(7, 0);
				stmt6.setString(8, "On Rent");
				stmt6.executeUpdate();
				stmt6.close();
				Process_Rental_ID.myrentalId_6();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[6] != 0) {
				String sql7 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount,fine,toy_status)"
						+ "values(?,?,?,?,?,?,?,?)";
				PreparedStatement stmt7 = conn.prepareStatement(sql7);
				stmt7.setInt(1, Customer.getCustomerId());
				stmt7.setInt(2, arr[6]);
				stmt7.setString(3, GetDate.getStartdate());
				stmt7.setString(4, GetDate.getEnddate());
				stmt7.setInt(5, r7.getRent());
				stmt7.setLong(6, r7.getTotalAmount());
				stmt7.setInt(7, 0);
				stmt7.setString(8, "On Rent");
				stmt7.executeUpdate();
				stmt7.close();
				Process_Rental_ID.myrentalId_7();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[7] != 0) {
				String sql8 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount,fine,toy_status)"
						+ "values(?,?,?,?,?,?,?,?)";
				PreparedStatement stmt8 = conn.prepareStatement(sql8);
				stmt8.setInt(1, Customer.getCustomerId());
				stmt8.setInt(2, arr[7]);
				stmt8.setString(3, GetDate.getStartdate());
				stmt8.setString(4, GetDate.getEnddate());
				stmt8.setInt(5, r8.getRent());
				stmt8.setLong(6, r8.getTotalAmount());
				stmt8.setInt(7, 0);
				stmt8.setString(8, "On Rent");
				stmt8.executeUpdate();
				stmt8.close();
				Process_Rental_ID.myrentalId_8();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[8] != 0) {
				String sql9 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount,fine,toy_status)"
						+ "values(?,?,?,?,?,?,?,?)";
				PreparedStatement stmt9 = conn.prepareStatement(sql9);
				stmt9.setInt(1, Customer.getCustomerId());
				stmt9.setInt(2, arr[8]);
				stmt9.setString(3, GetDate.getStartdate());
				stmt9.setString(4, GetDate.getEnddate());
				stmt9.setInt(5, r9.getRent());
				stmt9.setLong(6, r9.getTotalAmount());
				stmt9.setInt(7, 0);
				stmt9.setString(8, "On Rent");
				stmt9.executeUpdate();
				stmt9.close();
				Process_Rental_ID.myrentalId_9();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[9] != 0) {
				String sql10 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount,fine,toy_status)"
						+ "values(?,?,?,?,?,?,?,?)";
				PreparedStatement stmt10 = conn.prepareStatement(sql10);
				stmt10.setInt(1, Customer.getCustomerId());
				stmt10.setInt(2, arr[9]);
				stmt10.setString(3, GetDate.getStartdate());
				stmt10.setString(4, GetDate.getEnddate());
				stmt10.setInt(5, r10.getRent());
				stmt10.setLong(6, r10.getTotalAmount());
				stmt10.setInt(7, 0);
				stmt10.setString(8, "On Rent");
				stmt10.executeUpdate();
				stmt10.close();
				Process_Rental_ID.myrentalId_10();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}

			conn.close();

			System.out.println("your order is placed");
			int h = 1;
			do {
				try {
					System.out.println("enter 5  to go home  or any integer to log out :");
					int d = s.nextInt();
					h = 2;
					if (d == 5) {
						ToyServiceImpl bye = new ToyServiceImpl();
						bye.search();

					} else {
						LoggingOff.loggingMeOff();

					}
				} catch (InputMismatchException e) {
					System.out.println("invalid input");

				}
			} while (h == 1);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void search() {
		int h = 1;
		do {
			try {
				Connection conn = DbUtility.getNetwork();

				String sql = "select*from toy_rental where customer_id=?";
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setInt(1, Customer.getCustomerId());

				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					System.out.println("");
					System.out.println("");
					System.out.println("Reantal Id:               " + rs.getInt("Rental_Id"));

					System.out.println("Toy Id:                   " + rs.getInt("Toy_Id"));
					System.out.println("Start Date:               " + rs.getString("Rental_Start_Date"));
					System.out.println("End Date:                 " + rs.getString("Rental_End_Date"));
					System.out.println("Rental Amount Per Day:    " + rs.getInt("Rental_Amount_Per_Day"));
					System.out.println("Total Amount:             " + rs.getInt("Total_Amount"));
					System.out.println("Fine:                     " + rs.getInt("Fine"));
					System.out.println("Toy Status:               " + rs.getString("Toy_Status"));

				}
				int m = 1;
				do {
					try {
						System.out.print("Enter 0 to go home else any integer to log out:  ");
						@SuppressWarnings("resource")
						Scanner s = new Scanner(System.in);
						int o = s.nextInt();
						m = 2;
						if (o == 0) {
							ToyServiceImpl obj = new ToyServiceImpl();
							obj.search();
						} else {
							LoggingOff.loggingMeOff();
						}

					} catch (Exception e) {
						System.out.println("Invalid Input");
					}
				} while (m == 1);

				h = 2;

			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (h == 1);

	}

	@Override
	public void display() {
		if (arr[0] != 0) {
			System.out.println("item " + 1 + ": ");
			System.out.println("			Toy id         " + arr[0]);
			System.out.println("			Toy name:      " + t.getToyName());
			System.out.println("			Toy type:      " + t.getToyType());
			System.out.println("			Minimum age:   " + t.getMinAge());
			System.out.println("			Maximum age:   " + t.getMaxAge());
			System.out.println("			Price:         " + t.getPrice());
			System.out.println("			Quantity:      " + t.getQuantity());
			System.out.println("			Rental amount: " + t.getRentalAmount());

		}

		if (arr[0] != 0 && arr[1] == 0) {
			int b = 1;
			do {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.println(
						"enter 0 to add another item in a cart and enter 1 to take on rent else enter any integer value to remove item from the cart ");

				try {
					int d1 = s.nextInt();
					b = 2;
					if (d1 == 0) {
						ToyServiceImpl p = new ToyServiceImpl();
						p.search();

					} else if (d1 == 1) {
						BookToy.finaliseOrder();
					} else {
						Delete_Items.delete();
						System.out.println("your cart is empty");
						ToyServiceImpl bye = new ToyServiceImpl();
						bye.search();

					}
				} catch (InputMismatchException e) {
					System.out.println("invalid input");
				}
			} while (b == 1);
		}

		if (arr[1] != 0) {
			System.out.println("item " + 2 + ": ");
			System.out.println("			Toy id         " + arr[1]);
			System.out.println("			Toy name:      " + t1.getToyName());
			System.out.println("			Toy type:      " + t1.getToyType());
			System.out.println("			Minimum age:   " + t1.getMinAge());
			System.out.println("			Maximum age:   " + t1.getMaxAge());
			System.out.println("			Price:         " + t1.getPrice());
			System.out.println("			Quantity:      " + t1.getQuantity());
			System.out.println("			Rental amount: " + t1.getRentalAmount());

		}
		if (arr[0] != 0 && arr[1] != 0 && arr[2] == 0) {
			int b = 1;
			do {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.println(
						"enter 0 to add another item in a cart and enter 1 to take on rent else enter any integer value to remove item from the cart ");
				try {
					int d2 = s.nextInt();
					b = 2;
					if (d2 == 0) {
						ToyServiceImpl p = new ToyServiceImpl();
						p.search();
					} else if (d2 == 1) {
						BookToy.finaliseOrder();
					} else {
						Delete_Items.delete();
						CustomerServiceImpl hi1 = new CustomerServiceImpl();
						hi1.display();
					}
				} catch (InputMismatchException e) {
					System.out.println("invalid input");
				}
			} while (b == 1);
		}
		if (arr[2] != 0) {
			System.out.println("item " + 3 + ": ");
			System.out.println("			Toy id         " + arr[2]);
			System.out.println("			Toy name:      " + t2.getToyName());
			System.out.println("			Toy type:      " + t2.getToyType());
			System.out.println("			Minimum age:   " + t2.getMinAge());
			System.out.println("			Maximum age:   " + t2.getMaxAge());
			System.out.println("			Price:         " + t2.getPrice());
			System.out.println("			Quantity:      " + t2.getQuantity());
			System.out.println("			Rental amount: " + t2.getRentalAmount());

		}
		if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] == 0) {
			int b = 1;
			do {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.println(
						"enter 0 to add another item in a cart and enter 1 to take on rent else enter any integer value to remove item from the cart ");
				try {
					int d3 = s.nextInt();
					b = 2;
					if (d3 == 0) {
						ToyServiceImpl p = new ToyServiceImpl();
						p.search();

					} else if (d3 == 1) {
						BookToy.finaliseOrder();
					} else {
						Delete_Items.delete();
						CustomerServiceImpl hi1 = new CustomerServiceImpl();
						hi1.display();
					}
				} catch (InputMismatchException e) {
					System.out.println("invalid input");
				}
			} while (b == 1);
		}
		if (arr[3] != 0) {
			System.out.println("item " + 4 + ": ");
			System.out.println("			Toy id         " + arr[3]);
			System.out.println("			Toy name:      " + t3.getToyName());
			System.out.println("			Toy type:      " + t3.getToyType());
			System.out.println("			Minimum age:   " + t3.getMinAge());
			System.out.println("			Maximum age:   " + t3.getMaxAge());
			System.out.println("			Price:         " + t3.getPrice());
			System.out.println("			Quantity:      " + t3.getQuantity());
			System.out.println("			Rental amount: " + t3.getRentalAmount());

		}
		if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 && arr[4] == 0) {
			int b = 1;
			do {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.println(
						"enter 0 to add another item in a cart and enter 1 to take on rent else enter any integer value to remove item from the cart ");
				try {
					int d4 = s.nextInt();
					b = 2;
					if (d4 == 0) {
						ToyServiceImpl p = new ToyServiceImpl();
						p.search();

					} else if (d4 == 1) {
						BookToy.finaliseOrder();
					} else {
						Delete_Items.delete();
						CustomerServiceImpl hi1 = new CustomerServiceImpl();
						hi1.display();
					}
				} catch (InputMismatchException e) {
					System.out.println("invalid input");
				}
			} while (b == 1);
		}

		if (arr[4] != 0) {
			System.out.println("item " + 5 + ": ");
			System.out.println("			Toy id         " + arr[4]);
			System.out.println("			Toy name:      " + t4.getToyName());
			System.out.println("			Toy type:      " + t4.getToyType());
			System.out.println("			Minimum age:   " + t4.getMinAge());
			System.out.println("			Maximum age:   " + t4.getMaxAge());
			System.out.println("			Price:         " + t4.getPrice());
			System.out.println("			Quantity:      " + t4.getQuantity());
			System.out.println("			Rental amount: " + t4.getRentalAmount());

		}
		if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 && arr[4] != 0 && arr[5] == 0) {
			int b = 1;
			do {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.println(
						"enter 0 to add another item in a cart and enter 1 to take on rent else enter any integer value to remove item from the cart ");
				try {
					int d5 = s.nextInt();
					b = 2;
					if (d5 == 0) {
						ToyServiceImpl p = new ToyServiceImpl();
						p.search();

					} else if (d5 == 1) {
						BookToy.finaliseOrder();
					} else {
						Delete_Items.delete();
						CustomerServiceImpl hi1 = new CustomerServiceImpl();
						hi1.display();
					}
				} catch (InputMismatchException e) {
					System.out.println("invalid input");
				}
			} while (b == 1);
		}
		if (arr[5] != 0) {
			System.out.println("item " + 6 + ": ");
			System.out.println("			Toy id         " + arr[5]);
			System.out.println("			Toy name:      " + t5.getToyName());
			System.out.println("			Toy type:      " + t5.getToyType());
			System.out.println("			Minimum age:   " + t5.getMinAge());
			System.out.println("			Maximum age:   " + t5.getMaxAge());
			System.out.println("			Price:         " + t5.getPrice());
			System.out.println("			Quantity:      " + t5.getQuantity());
			System.out.println("			Rental amount: " + t5.getRentalAmount());

		}
		if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 && arr[4] != 0 && arr[5] != 0 && arr[6] == 0) {
			int b = 1;
			do {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.println(
						"enter 0 to add another item in a cart and enter 1 to take on rent else enter any integer value to remove item from the cart ");
				try {
					int d6 = s.nextInt();
					b = 2;
					if (d6 == 0) {
						ToyServiceImpl p = new ToyServiceImpl();
						p.search();

					} else if (d6 == 1) {
						BookToy.finaliseOrder();
					} else {
						Delete_Items.delete();
						CustomerServiceImpl hi1 = new CustomerServiceImpl();
						hi1.display();
					}
				} catch (InputMismatchException e) {
					System.out.println("invalid input");
				}
			} while (b == 1);
		}
		if (arr[6] != 0) {
			System.out.println("item " + 7 + ": ");
			System.out.println("			Toy id         " + arr[6]);
			System.out.println("			Toy name:      " + t6.getToyName());
			System.out.println("			Toy type:      " + t6.getToyType());
			System.out.println("			Minimum age:   " + t6.getMinAge());
			System.out.println("			Maximum age:   " + t6.getMaxAge());
			System.out.println("			Price:         " + t6.getPrice());
			System.out.println("			Quantity:      " + t6.getQuantity());
			System.out.println("			Rental amount: " + t6.getRentalAmount());

		}
		if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 && arr[4] != 0 && arr[5] != 0 && arr[6] != 0
				&& arr[7] == 0) {
			int b = 1;
			do {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.println(
						"enter 0 to add another item in a cart and enter 1 to take on rent else enter any integer value to remove item from the cart ");
				try {
					int d7 = s.nextInt();
					b = 2;
					if (d7 == 0) {
						ToyServiceImpl p = new ToyServiceImpl();
						p.search();

					} else if (d7 == 1) {
						BookToy.finaliseOrder();
					} else {
						Delete_Items.delete();
						CustomerServiceImpl hi1 = new CustomerServiceImpl();
						hi1.display();
					}
				} catch (InputMismatchException e) {
					System.out.println("invalid input");
				}
			} while (b == 1);
		}
		if (arr[7] != 0) {
			System.out.println("item " + 8 + ": ");
			System.out.println("			Toy id         " + arr[7]);
			System.out.println("			Toy name:      " + t7.getToyName());
			System.out.println("			Toy type:      " + t7.getToyType());
			System.out.println("			Minimum age:   " + t7.getMinAge());
			System.out.println("			Maximum age:   " + t7.getMaxAge());
			System.out.println("			Price:         " + t7.getPrice());
			System.out.println("			Quantity:      " + t7.getQuantity());
			System.out.println("			Rental amount: " + t7.getRentalAmount());

		}
		if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 && arr[4] != 0 && arr[5] != 0 && arr[6] != 0
				&& arr[7] != 0 && arr[8] == 0) {
			int b = 1;
			do {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.println(
						"enter 0 to add another item in a cart and enter 1 to take on rent else enter any integer value to remove item from the cart ");
				try {
					int d8 = s.nextInt();
					b = 2;
					if (d8 == 0) {
						ToyServiceImpl p = new ToyServiceImpl();
						p.search();

					} else if (d8 == 1) {
						BookToy.finaliseOrder();
					} else {
						Delete_Items.delete();
						CustomerServiceImpl hi1 = new CustomerServiceImpl();
						hi1.display();
					}
				} catch (InputMismatchException e) {
					System.out.println("invalid input");
				}
			} while (b == 1);
		}
		if (arr[8] != 0) {
			System.out.println("item " + 9 + ": ");
			System.out.println("			Toy id         " + arr[8]);
			System.out.println("			Toy name:      " + t8.getToyName());
			System.out.println("			Toy type:      " + t8.getToyType());
			System.out.println("			Minimum age:   " + t8.getMinAge());
			System.out.println("			Maximum age:   " + t8.getMaxAge());
			System.out.println("			Price:         " + t8.getPrice());
			System.out.println("			Quantity:      " + t8.getQuantity());
			System.out.println("			Rental amount: " + t8.getRentalAmount());

		}
		if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 && arr[4] != 0 && arr[5] != 0 && arr[6] != 0
				&& arr[7] != 0 && arr[8] != 0 && arr[9] == 0) {
			int b = 1;
			do {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.println(
						"enter 0 to add another item in a cart and enter 1 to take on rent else enter any integer value to remove item from the cart ");
				try {
					int d9 = s.nextInt();
					b = 2;
					if (d9 == 0) {
						ToyServiceImpl p = new ToyServiceImpl();
						p.search();

					} else if (d9 == 1) {
						BookToy.finaliseOrder();
					} else {
						Delete_Items.delete();
						CustomerServiceImpl hi1 = new CustomerServiceImpl();
						hi1.display();
					}
				} catch (InputMismatchException e) {
					System.out.println("invalid input");
				}
			} while (b == 1);
		}
		if (arr[9] != 0) {
			System.out.println("item " + 10 + ": ");
			System.out.println("			Toy id         " + arr[9]);
			System.out.println("			Toy name:      " + t9.getToyName());
			System.out.println("			Toy type:      " + t9.getToyType());
			System.out.println("			Minimum age:   " + t9.getMinAge());
			System.out.println("			Maximum age:   " + t9.getMaxAge());
			System.out.println("			Price:         " + t9.getPrice());
			System.out.println("			Quantity:      " + t9.getQuantity());
			System.out.println("			Rental amount: " + t9.getRentalAmount());

		}
		if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 && arr[4] != 0 && arr[5] != 0 && arr[6] != 0
				&& arr[7] != 0 && arr[8] != 0 && arr[9] != 0) {
			System.out.println("cart is full");

			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);

			System.out.println("enter 1 to take on rent else enter any integer value to remove item from the cart ");
			int d9 = s.nextInt();
			if (d9 == 1) {
				BookToy.finaliseOrder();

			} else {
				Delete_Items.delete();
				CustomerServiceImpl hi1 = new CustomerServiceImpl();
				hi1.display();

			}
		}

	}

}
