package customer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Delete_Items extends CustomerServiceImpl {
	public static void delete() {

		int g = 1;
		do {
			try {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.println("enter toy id that you want to delete from the cart: ");
				int delete = s.nextInt();
				g = 2;
				int count = 0;
				for (int i = 0; i < arr.length; i++) {
					if (delete == arr[i]) {

						for (int j = i; j < arr.length - 1; j++) {
							arr[j] = arr[j + 1];
						}
						count++;
						break;
					}

				}

				if (count == 0) {
					System.out.println("item not found in cart");
					CustomerServiceImpl hi1 = new CustomerServiceImpl();
					hi1.display();
				}
			} catch (InputMismatchException e) {
				System.out.println("invalid input");
			}

		} while (g == 1);

	}

}
