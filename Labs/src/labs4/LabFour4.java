package labs4;

public class LabFour4 {
//	Count the number of "xx" in the given string. 
//	We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	public static void main(String[] args) {
		// print out the input method countxx with the input string
		System.out.println(countxx("abcxx"));

//created a method called countxx that takes in a single sting as its parameter
	}

	public static int countxx(String pair) {
		// change to lowercase
		String pair2 = pair.toLowerCase();
		// established here so that it could come out of the loop
		int sum = 0;
		// starts at 0 and goes until it reached the end of the LENGTH of the string
		// however we subtracted 1 to account for the index
		for (int i = 0; i < pair2.length() - 1; i++) {
			if (pair2.charAt(i) == pair2.charAt(i + 1) && pair2.charAt(i) == 'x') {
				sum += 1;
			}
		}

		return sum;
	}

}
