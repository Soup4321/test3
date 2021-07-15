package labs3;

public class RemoveACharicter {

	public static void main(String[] args) {

        int index = 0;

        String str = "Averange";
        str = str.toLowerCase();
        String letter = "a";
        index = str.indexOf(letter);
        ///System.out.println(charRemoveAt(str, index));
        String Result=removeChar(str,letter);

        System.out.println(Result);
      

        }


//     public static String charRemoveAt(String str, int index) {
//
//
//
//        return str.substring(0, index) + str.substring(index + 1);
 //       } 

    public static String removeChar(String inputString, String stringToFind)


    {
        int index=inputString.indexOf(stringToFind);

        do {



        inputString=inputString.substring(0,index) + inputString.substring(index+1);

        index=inputString.indexOf(stringToFind);


    }while(index!=-1); 

        return inputString;
}
    
    
    
}
