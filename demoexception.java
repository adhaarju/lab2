package com.lab;

public class demoexception {
	public static void main(String[] args) {
		try {
			int result = 100 / 0;
		} catch (ArithmeticException e) {
			//System.out.println(e.printStackTrace());
			System.out.println(e.getStackTrace());
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}
}
