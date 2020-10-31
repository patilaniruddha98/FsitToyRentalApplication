package customer;

import java.util.Scanner;

public class EnterYourType {
	public static void mytype() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("enter the type of toy you want to be take on rent: ");
		String str = s.nextLine();

		switch (str) {
		case "Craft": {
			MyType.craft();
			break;
		}

		case "Electric": {
			MyType.electric();
			break;
		}

		case "Activity": {
			MyType.activity();
			break;
		}

		case "Kitchen": {
			MyType.kitchen();
			break;
		}

		case "Wheels": {
			MyType.wheels();
			break;
		}

		case "Teddy": {
			MyType.teddy();
			break;
		}

		case "Baby car": {
			MyType.babyCar();
			break;
		}

		case "Education": {
			MyType.education();
			break;
		}

		case "Cycle": {
			MyType.craft();
			break;
		}

		case "Puzzle": {
			MyType.puzzle();
			break;
		}

		case "Built": {
			MyType.built();
			break;
		}

		case "Doll": {
			MyType.doll();
			break;
		}

		case "Game": {
			MyType.game();
			break;
		}
		default: {
			System.out.println("wrong input");

			EnterYourType.mytype();
		}

		}
	}

}
