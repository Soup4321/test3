package labs2;
//. Write a method to prompt the user for an Integer then display the same value 
//with one decimal place. eg user enter "15 " result is: "You entered 15, the new "
//		+ "value is 15.0".

import java.util.Scanner;

public class IntToDouble {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter an Whole number: ");
		int wholeNum = myScanner.nextInt();
		
		
		changeToDouble(wholeNum);
		
		System.out.println("The double value for " + wholeNum );
		System.out.println("Is: " + changeToDouble(wholeNum));
		
		myScanner.close();
		
	}
	
	public static double changeToDouble(int wholeNum) {
		
	
	int i = wholeNum;
	double d = (double) i;
	return d;
	
	}
	
}
