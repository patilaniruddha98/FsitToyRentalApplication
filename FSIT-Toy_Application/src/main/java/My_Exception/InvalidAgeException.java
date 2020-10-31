package My_Exception;

import customer.EnterAge;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception {
	public InvalidAgeException() throws InvalidAgeException {
		super("invalid Age");
		System.out.println("invalid age");
		EnterAge.age();
	}

}
