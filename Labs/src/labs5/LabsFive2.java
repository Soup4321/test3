package labs5;
//Write a method to remove all white spaces from a char array?
public class LabsFive2 {
	//variables
	
	private String myString;
	
	
	
	
	
	
	
	
	
	public LabsFive2(String myString) {
		super();
		this.myString = myString;
	}









	public String removeWhite() {
		char[] letters = myString.toCharArray();
		//returning complete and putting this as a placeholder and 
		//storage for the string
		String complete = "";
		//Int i starts at 0 in the index, while index is less than the 
		//length, each time it loops it increases index by 1
		for(int i = 0; i < letters.length; i++) {
			
			// if the index of the current index number's character is not equal to space;
			//complete = complete + that character at the current index#
			//then this character gets stored in the String "complete". 
			if(letters[i] != (' ')) {
				complete += letters[i];
			}
			
		}
		
		
		return complete;
	}









	public String getMyString() {
		return myString;
	}









	public void setMyString(String myString) {
		this.myString = myString;
	}
	
	
	
	
	
	
	
	

}
