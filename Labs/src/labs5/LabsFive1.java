package labs5;
//1. Write a method to count the number of occurrences of the letter ‘a’ in a char array?

public class LabsFive1 {

	public char letter;
	public String mystring;
	
	
	
	
	
	

	public LabsFive1(char letter, String mystring) {
		super();
		this.letter = letter;
		this.mystring = mystring;
	}







	public int counter() {
		char[] letters = mystring.toCharArray();

		int sum = 0;

		for (int i = 0; i < letters.length; i++) {

			if (letters[i] == letter) {
				sum++;
			}

		}

		return sum;

	}







	public char getLetter() {
		return letter;
	}







	public void setLetter(char letter) {
		this.letter = letter;
	}







	public String getMystring() {
		return mystring;
	}







	public void setMystring(String mystring) {
		this.mystring = mystring;
	}
	
	
	

}
