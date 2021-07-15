package labs1;

/**
 * 
 author Joe
 *
 */

public class Welcome {
	// start to code
	protected int number = 4;
	
	//main method
	public static void main(String[] args) {
		//defining a variable
		int number = 5;
		String name = "Joel";
		System.out.println("Welcome to Java");
		
		System.out.println("Hello World!");
		
		
		//control flow statement
		
//		if(number >= 10) {
//			System.out.println("You are rich");
//		}
//			if(number <= 5) {
//				System.out.println("You are poor");
//		} 
		
		// another way to write an if statement in single line
		//variable       condition
		// called a ternary operator 
		String result =(number > 10) ? "You are rich" : "You are broke";	
		System.out.println(result);
		System.out.printf("Formated value PI = %.2f", Math.PI);
	}
}
