package com.labb;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		super(msg);
	}

}
public class MyExceptionHandler {

	public void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("You cannot vote");
		} else
			System.out.println("you can vote");
	}

	public static void main(String[] args) {
		MyExceptionHandler myObj = new MyExceptionHandler();

		try {
			myObj.validate(10);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("you are just a kid go away hahahaha");
		}

	}

}
