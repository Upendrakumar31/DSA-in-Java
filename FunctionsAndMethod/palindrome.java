package FunctionsAndMethod;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);   
        int palindrome = sc.nextInt();
        if(isPalindrome(palindrome)){
            System.out.println("The number " + palindrome + " is palindrome");
        }else{
            System.out.println("The number " + palindrome + " is not palindrome");
        }
    }
    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int rem = palindrome % 10;
            reverse = reverse * 10 + rem;
            palindrome = palindrome /10;
        }
        if(number == reverse){
            return true;
        }else 
        return false;
    }
}











