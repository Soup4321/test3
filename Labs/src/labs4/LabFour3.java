package labs4;

public class LabFour3 {
//	You have a green lottery ticket, with ints a, b, and c on it. If the numbers
//	are all different from each other, the result is 0. If all of the numbers 
//	are the same, the result is 20. If two of the numbers are the same, the 
//	result is 10.

	public static void main(String[] args) {

//		int a = 1;
//		int b = 1;
//		int c = 1;

		System.out.println(greenTicket(1, 2, 1));

	}

	public static int greenTicket(int a, int b, int c) {
		int sum = 0;

		if (a == b && b == c) {
			sum = 20;
		} else if (a != b && b != c) {
			sum = 0;
		} else {
			sum = 10;
		}
		return sum;
	}
}