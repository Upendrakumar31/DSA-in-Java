package Strings;

public class palindrome {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "Madam";
        System.out.println(isPalindrome(str));
    }
}
