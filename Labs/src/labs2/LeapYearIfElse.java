package labs2;

import java.util.Scanner;

public class LeapYearIfElse {

	public static void main(String[] args) {
		// We are requesting and storing the entered value
		leapYear();
		sdf
		public static void leapYear() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please input a year: ");
		int input = myScanner.nextInt();

		if (input % 4 != 0) {
			System.out.println("This is not a leap year.");
		} else if (input % 100 != 0) {
			System.out.println("This is a leap year");
		} else if (input % 400 == 0) {
			System.out.println("This is a leap year");
		} else {
			System.out.println("This is not a leap year");
		}
	}
	}

