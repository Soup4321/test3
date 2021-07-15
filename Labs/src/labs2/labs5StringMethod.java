package labs2;
import java.util.Scanner;

public class labs5StringMethod {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter a letter of the alphabet");
		char alpha = myScanner.next().charAt(0);
		
		System.out.println(getNumber(alpha));
		
		myScanner.close();

	}
	static String letter = " abcdefghijklmnopqrstuvwxyz";
	public static int getNumber(char input) {
		int alphaNum = letter.indexOf(input);
		return alphaNum;
	}
	

	
}


