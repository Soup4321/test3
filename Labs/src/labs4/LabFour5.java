package labs4;

public class LabFour5 {
//	Given a string and a non-negative int n, return a larger string that is n 
//			copies of the original string.

	public static void main(String[] args) {

		int n = 2;
		String s = "tacos";
		System.out.println(stringTimes(s, n));
	}

	public static String stringTimes(String str, int n) {
		String s = "";

		for (int i = 0; i < n; i++) {
			// s = s + str;
			s += str;
		}
		return s;
	}
}
