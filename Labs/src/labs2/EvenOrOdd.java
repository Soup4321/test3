package labs2;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		//initiate scanner and import up top
		Scanner myScanner = new Scanner(System.in);
		//what the scanner says
		System.out.println("Enter a number: ");
		//named the scanner input
		int input = myScanner.nextInt();
		
		//findNum is the input we got from scanner
		findNum(input);
		
		myScanner.close();
		
		

	}//declare variable ---> since its static we wont have to define it;
	//but if its not static need to declare.
	//define variables
	//int test = 0;
	
	//findNum is the name of the method, "int num" means we have 
		public static void findNum(int num) {
			int test = num % 2;
			if(test == 0) {
				System.out.println("The number is even");
			}
			else {
				System.out.println("The number is odd");
			}
		}

}
