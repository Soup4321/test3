package labs4;

public class LabFour1 {

	public static void main(String[] args) {
		
		//declaring variables
		int a = 2;
		int b = 10;
		
		//making int object called myReturn 
		int myReturn = sumIfSameLength(a,b);
		System.out.println(myReturn);
		
		
		
		//Given 2 non-negative ints, a and b, return their sum, so long as the 
		//sum has the same number of digits as a. If the sum has more digits 
		//than a, just return a without b. 

	}
	
	
	public static int sumIfSameLength(int input1, int input2)


    {
        int sum= input1+input2;

        String sumString=String.valueOf(sum);
        String a=String.valueOf(input1);

        if (sumString.length()>a.length())    {
            return input1;

        }
        else {
        return sum; 
        }
    }
}
