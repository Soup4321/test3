package labs3;

public class NonAndRepeating {

	public static void main(String[] args) {
		// Write a program to display first non repeated character of a string then the
		// repeating characters. E.g. input morning should display morignn.

		String test = "morning";
		System.out.println(sort(test));

	}

	private static String sort(String test) {
		char[] myArray = test.toCharArray();

		String single = "";
		String duplicate = "";
		int count = 0;

		for (int i = 0; i < myArray.length; i++) {
			count = 0;

			for (int j = 0; j < myArray.length; j++) {
				if (myArray[i] == myArray[j]) {
					count++;
				}
			}
			if (count == 1) {
				single += myArray[i];

			} else {
				duplicate += myArray[i];
			}
		}
		String ans = single + duplicate;

		return ans;
	}

}
