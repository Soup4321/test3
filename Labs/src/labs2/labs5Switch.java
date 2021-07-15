package labs2;
import java.util.Scanner;

public class labs5Switch {
	

	public static void main(String[] args) {
		Scanner prompt = new Scanner(System.in);
		System.out.println("Please enter a letter of the alphabet");
		char letter = prompt.next().charAt(0);
		
		switch (letter) {
		case 'a':
			System.out.println("The corresponding number is 1.");
			break;
		
		case 'b':
			System.out.println("The corresponding number is 2.");
			break;

		case 'c':
			System.out.println("The corresponding number is 3.");
			break;

		case 'd':
			System.out.println("The corresponding number is 4.");
			break;

		case 'e':
			System.out.println("The corresponding number is 5.");
			break;

		case 'f':
			System.out.println("The corresponding number is 6.");
			break;

		case 'g':
			System.out.println("The corresponding number is 7.");
			break;

		case 'h':
			System.out.println("The corresponding number is 8.");
			break;

		case 'i':
			System.out.println("The corresponding number is 9.");
			break;

		case 'j':
			System.out.println("The corresponding number is 10.");
			break;

		case 'k':
			System.out.println("The corresponding number is 11.");
			break;

		case 'l':
			System.out.println("The corresponding number is 12.");
			break;

		case 'm':
			System.out.println("The corresponding number is 13.");
			break;

		case 'n':
			System.out.println("The corresponding number is 14.");
			break;

		case 'o':
			System.out.println("The corresponding number is 15.");
			break;

		case 'p':
			System.out.println("The corresponding number is 16.");
			break;

		case 'q':
			System.out.println("The corresponding number is 17.");
			break;

		case 'r':
			System.out.println("The corresponding number is 18.");
			break;

		case 's':
			System.out.println("The corresponding number is 19.");
			break;

		case 't':
			System.out.println("The corresponding number is 20.");
			break;

		case 'u':
			System.out.println("The corresponding number is 21.");
			break;

		case 'v':
			System.out.println("The corresponding number is 22.");
			break;

		case 'w':
			System.out.println("The corresponding number is 23.");
			break;

		case 'x':
			System.out.println("The corresponding number is 24.");
			break;

		case 'y':
			System.out.println("The corresponding number is 25.");
			break;

		case 'z':
			System.out.println("The corresponding number is 26.");
			break;
						
		default:
			System.out.println("You did not enter a letter, please try again.");
			break;
		}
	
		
	}

}


