package labs3;

public class RemoveDup {

	public static void main(String[] args) {

		String test = "mississippi".toLowerCase();
		System.out.println(remover(test));

	}

	public static String remover(String test) {
		char[] letters = test.toCharArray();

		String output = "";
		int count = 0;

		for (int i = 0; i < letters.length; i++) {
			count = 0;

			for (int j = 0; j < letters.length; j++) {
				if (letters[i] == letters[j]) {
					count++;
				}
			}
			if (count <= 1) {
				output += letters[i];
			}
		}
		return output;
	}

}
