package labs1;

public class LabQuestion567 {

	public static void main(String[] args) {
//		5. Write a method "isFactor" which takes two integers (k and n) and 
//		returns true iff ("if and only if") k is a factor of n.
		
			isFactor(3, 9);
			isPerfect(28);
			isPrime(7);
	}
	//public 
	//static belongs to this class. do not need to create instance
		public static boolean isFactor(int k, int n) {
			if(n % k == 0) {
				System.out.println("This is a factor.");
				return true;
				} else {
					System.out.println("This is not a factor.");
					return false;
				}
		}
		
		/* 6. Write a method "isPerfect" which takes an integer and returns true 
		iff that integer is a perfect number Your method MUST call the
		"isFactor" method you wrote for problem #5.
		*/
		
		int perfectN;
		public static int sum = 0;
		public static void isPerfect(int perfectN) {
			for(int x = 1; x < perfectN; x++)
			{
			if(isFactor(x,perfectN)==true)	{
				sum=sum+x;
				System.out.println("The sum is " + sum);
			}
			}
		
		if(sum == perfectN) {
			System.out.println("This is a perfect number");
		} else {
			System.out.println("This is not a perfect number.");
		}
		}
		/*7. Write a method "isPrime" which takes an integer and returns true 
		iff it is a prime number. Your method MUST call the "isFactor" method 
		you wrote for problem #5.
		*/
		
	
		//while (x<a);
		int a=0;
		
		public static void isPrime(int a)
		{
			int x = 2;
			if(a<x) {
				System.out.println("This is not a prime number.");
			}
			while(x<a) {
				if(isFactor(x,a)==true)
					{System.out.println("This is not a prime number.");
					break;	
						}
				else if (x==(a-1))
				{
					System.out.println("This is a prime number.");
					break;
				}
				else  
				{
					x++;
				}
		}
		}
		
			
		
		
}
