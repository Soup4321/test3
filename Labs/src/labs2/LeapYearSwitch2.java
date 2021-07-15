package labs2;

import java.util.Scanner;

public class LeapYearSwitch2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		

        int y;
        int r;

        // y - denotes the year

        System.out.println ("Enter the year: ");
        y = in.nextInt();
        
        
        //Parameters for leap year. 
        //r denotes the result
        r = y % 400 == 0 || y % 100 == 0 || y % 4 == 0 ? 1 : 0;

        switch (r) {
            case 1:
                System.out.println ("\n" + y+ " is the leap year.");
                break;

            case 0:
                System.out.println ("\n" + y + " is not the leap year.");
                break;

            default:
                System.out.println ("\n" + y + " is not the leap year.");
                
        } 
        in.close();
    }
}
