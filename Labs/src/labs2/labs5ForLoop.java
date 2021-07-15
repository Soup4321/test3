package labs2;
import java.util.Scanner;

public class labs5ForLoop {
	/*
	 * Write a method to prompt the user for a letter of the alphabet and 
	 *display it's numerical value.
	 */
	
	public static void main(String[] args) {
		//call a scanner
		 Scanner myScanner= new Scanner(System.in);

         String characterToSearch= myScanner.next();

         String text = "abcdefghijklmnopqrstuvwxyz";
         for (int x=0;x<26;x++ )
         {

             char thisCharacter=text.charAt(x);


             String myChar = Character.toString(thisCharacter);

             System.out.println(myChar);
             System.out.println(characterToSearch);

             char characterTwo=characterToSearch.charAt(0);

             int outputInt=x+1;

             if (thisCharacter==characterTwo)

             {

                     System.out.println("The Charcter is number: " + outputInt + " in the alphabet");
             }

         }
         //System.out.println(charAtZero); // Prints f
     }
}

        


