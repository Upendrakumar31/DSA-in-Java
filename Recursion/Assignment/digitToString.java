package Recursion.Assignment;

public class digitToString {
    static String digit[] = { "zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void digitToString(int number){
        if(number == 0){
            return;
        }
        int lastDigit = number % 10;
        digitToString(number/10);
        System.out.print(digit[lastDigit] + " ");
    }

    public static void main(String[] args) {
        digitToString(1947);
    }
    
}
