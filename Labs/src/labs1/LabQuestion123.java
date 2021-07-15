package labs1;

public class LabQuestion123 {
	/*
	 * write a method called max3, min3 that computes the 
	 * maximum, minimum, and median
	 *  value of 3 integers
	 * 
	 */

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 5;
		int num3 = 10; 
		
		System.out.println("---------MENU----------");
		System.out.println("The maximum value is: " + max3(num1, num2, num3));
		System.out.println("The minimum value is: " + min3(num1, num2, num3));
		System.out.println("The median value is: " + median3(num1, num2, num3));
		
	}
	
	//write a method called "max3" that computes the maximum value of THREE integers
	
	/*
	 * method with 3 parameters, integers specifically
	 * compute the maximum value
	 */ 
	
	//1. MAX FUNCTION
	public static int max3(int num1, int num2, int num3) {
		System.out.println("========================");
		int solution = 0;
		if(num1 > num2 && num1 > num3) {
			solution = num1;
			return solution;
		}
		if(num3 > num2 && num2 > num3) {
			solution = num3;
			return solution;
		}
		else {
			solution = num3;
			return solution;
		}
	}
	
	/* min3
	 * return can only return value of the in
	 * instead of void using int: has to have a return
	 * RETURN matches with "int" within "public static int"
	 */
	
	// 2.MIN FUNCTION
	public static int min3(int num1, int num2, int num3)	{
		System.out.println("======================");
		int solution =0;
		if(num1 < num2 && num1 < num3) {
			solution = num1;
			return solution;
		}
		if(num3 < num2 && num2 < num3) {
			solution = num3;
			return solution;
		}
		else {
			solution = num3;
			return solution;
		}
	}
	// 2.MEDIAN FUNCTION
	public static int median3(int num1, int num2, int num3)	{
		int max = max3(num1, num2, num3);
		int min = min3(num1, num2, num3);
		int sum = num1 + num2 + num3;
		
		int solution = sum - max - min;
		return solution;

	}            
}
