package com.aniruddha.FSIT_Toy_Application;

import java.util.InputMismatchException;
import java.util.Scanner;

import customer.Customer;

public class App {

	public static void main(String[] args) throws Exception {

		// First page of application

		int w = 1;// passing a loop when unexpected exception occurs
		do {
			try {
				@SuppressWarnings("resource")
				Scanner s1 = new Scanner(System.in);
				System.out.println("WELCOME TO ANI's TOY STORE");
				System.out.println("new user!!  enter 0 to register");
				System.out.println("enter 1 to login");
				int e = s1.nextInt();// statement that may cause an Exception
				w = 2;

				if (e == 0) {

					Customer.registration(); // redirect to registration page

				} else if (e == 1) {
					Customer.LoginPage(); // redirect to Login page
				} else {
					System.out.println("invalid input");
					App.main(args);
				}
			} catch (InputMismatchException e) {
				System.out.println("invalid input");

			}
		} while (w == 1);

	}

}
