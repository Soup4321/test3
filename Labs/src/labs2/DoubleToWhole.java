package labs2;

import java.util.Scanner;

public class DoubleToWhole {

	public static void main(String[] args) {
		
			Scanner myScanner = new Scanner(System.in);
			System.out.println("Enter a Double: ");
			double doubleNum = myScanner.nextDouble();
			
			
			changeToWhole(doubleNum);
			
			System.out.println("The double value for " + doubleNum );
			System.out.println("Is: " + changeToWhole(doubleNum));
			
			myScanner.close();
			
		}
		
		public static int changeToWhole(double doubleNum) {
			
		
		
			int i = (int) Math.round(doubleNum);
			return i;

	}

}
