package labs2;

import java.util.Scanner;

public class Labs5loop {

	public static void main(String[] args) {
		System.out.println(charToNum());

	}
	public static int charToNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
				String letter = input.nextLine();
		
				input.close();
				int num = letter.charAt(0);
				return num;
	}

}
