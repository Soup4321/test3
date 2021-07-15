package labs3;
//3. Write a program to count the number of vowels and consonants in a string. 
//E.g. if the input is Java the result should be 2 vowels and 2 consonants .
public class CountingVowels {
 public void vowlsConsonants(String inputString)

		    {

		        int numberOfConsontants=0;
		        int numberOfVowels=0;
		        int sentanceLenght=inputString.length();
		        String vowels="aeiouAEIOU";
		        String stringAtIndex;
		        char characterAtIndex;

		        for (int x=0;x<sentanceLenght;x++)

		        {

		            characterAtIndex=inputString.charAt(x);
		            stringAtIndex=Character.toString(characterAtIndex);
		            int isFound=vowels.indexOf(stringAtIndex);
		            if (stringAtIndex == null||(Character.compare(characterAtIndex, ' ')==0))

		            {
		                continue;

		            }


		            else if (isFound!=-1)
		                    {

		                        numberOfVowels=numberOfVowels+1;

		                        System.out.println(stringAtIndex+ " is vowel number "+ numberOfVowels);
		                    }
		            else

		            {
		                numberOfConsontants=numberOfConsontants+1;
		                System.out.println(stringAtIndex+" is consonant number "+ numberOfConsontants);

		            }





		        }
		        System.out.println("there are" +numberOfVowels+ " vowels");
		        System.out.println("there are" +numberOfConsontants+ " consonants");

		        }
//			And main class code to call it:
//			String consonantsAndVowelsCheck="I want to see how many consonants and vowels are in a string";
	//
//			        CountingVowels myVowels=new CountingVowels();
	//
//			        myVowels.vowlsConsonants(consonantsAndVowelsCheck);

}
		




