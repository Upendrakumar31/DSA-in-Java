package Strings.AssignmentQuestion;
import java.util.Arrays;


public class anagrams {
    public static void main(String[] args) {
       String str1 = "earth";
       String str2 = "heart";

       // Convert string to lowercase so that we don't have to check it for lowercase and uppercase separately //
       
       str1.toLowerCase();
       str2.toLowerCase();
       
       // Next step to check the length of both the strings if they length are different then it will not be a anagrams //

       if(str1.length()==str2.length()){

        // Convert it into char array //

        char[] str1charArray = str1.toCharArray();
        char[] str2charArray = str2.toCharArray();
        
        // Now sort the char array //
        
        Arrays.sort(str1charArray);
        Arrays.sort(str2charArray);

        // If the sorted arrays are same and identical then strings are anagrams //

        boolean result = Arrays.equals(str1charArray, str2charArray);
        if(result){
            System.out.println(str1 + " and " + str2 + " are anagrams of each other");
        }else{
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
       }
       // This else is for if the length is not same //
       else{
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
    }
}

