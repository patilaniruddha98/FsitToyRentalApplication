package customer;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CartActivity extends ToyServiceImpl {

	static RentalAmount r1 = new RentalAmount();
	static RentalAmount r2 = new RentalAmount();
	static RentalAmount r3 = new RentalAmount();
	static RentalAmount r4 = new RentalAmount();
	static RentalAmount r5 = new RentalAmount();
	static RentalAmount r6 = new RentalAmount();
	static RentalAmount r7 = new RentalAmount();
	static RentalAmount r8 = new RentalAmount();
	static RentalAmount r9 = new RentalAmount();
	static RentalAmount r10 = new RentalAmount();

	public static void cart_activity() throws Exception {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int x = 1;
		do {
			try {

				System.out.println("enter 0 to add in a cart else 1 to go back else 2 to explore through toy type: ");
				
				int z = s.nextInt();
				x = 2;
				if (z == 0) {
					System.out.println("your cart contains: ");

					if (arr[0] == 0) {
						arr[0] = t.getToyId();
					}

					if (arr[1] == 0) {
						arr[1] = t1.getToyId();
					}
					if (arr[2] == 0) {
						arr[2] = t2.getToyId();
					}
					if (arr[3] == 0) {
						arr[3] = t3.getToyId();
					}
					if (arr[4] == 0) {
						arr[4] = t4.getToyId();
					}
					if (arr[5] == 0) {
						arr[5] = t5.getToyId();
					}
					if (arr[6] == 0) {
						arr[6] = t6.getToyId();
					}
					if (arr[7] == 0) {
						arr[7] = t7.getToyId();
					}
					if (arr[8] == 0) {
						arr[8] = t8.getToyId();
					}
					if (arr[9] == 0) {
						arr[9] = t9.getToyId();
					}

					CustomerServiceImpl hi = new CustomerServiceImpl();
					hi.display();

				} else if (z == 1) {
					EnterAge.age();

				} else if (z == 2) {

					System.out.println("type of toys available: ");

					TypeSearch rentalService = new TypeSearch(); // list the toy types available
					List<Toy> ToyTypeList = rentalService.getToys();
					for (Toy toytype : ToyTypeList) {// print the list of types of toys available
						System.out.println(toytype);
					}
					EnterYourType.mytype();

				}

				else {
					System.out.println("wrong input");
					CartActivity.cart_activity();
				}

			} catch (InputMismatchException e) {
				System.out.println("invalid input");

			}

		} while (x == 1);
	}
}
