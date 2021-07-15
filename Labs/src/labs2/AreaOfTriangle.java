package labs2;

/*2. Write a method to prompt the user for base-width and height of a triangle, 
then calculate the area of the Triangle. */
import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter the Base of the Triangle: ");
		double inputBase = myScanner.nextDouble();
		System.out.println("Enter the Height of the Triangle: ");
		double inputHeight = myScanner.nextDouble();
		
		double myArea = findArea(inputBase, inputHeight);
		System.out.println("The Area of the Triangle is: " + myArea );
		
	}
	
	public static double findArea(double inputBase, double inputHeight) {
		
		
		double area=(inputBase*inputHeight/2);
		return area;
		
	}
	

}
