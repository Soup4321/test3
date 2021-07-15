package labs2;
//Question 1
//	Write a method to prompt the user to enter the radius of the circle then 
//calculate the area and circumference of the circle.
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double num = myScanner.nextDouble();//store the input
		
		CreateCircle myCircle = new CreateCircle();/*made a circle object from 
		the create circle class*/
		
		myCircle.findCircumference(num);/*calling on the class "CreateCircle" and 
		Input "num" from scanner*/
		System.out.println("The circumference of the circle is: " + myCircle.circumference);
		
		myCircle.findDiameter(num);
		
		myCircle.findArea(num);
		
		System.out.println("The area of the circle is: " + myCircle.area);
		
		myScanner.close();
	}
	


}
