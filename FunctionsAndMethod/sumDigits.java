package FunctionsAndMethod;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit : ");
        int digits = sc.nextInt();
        System.out.println("Sum of the digits is " + sumDigits(digits));
    }
    public static int sumDigits(int n){
        int sumOfDigits = 0;
        while (n>0) {
            int lastDigits = n % 10;
            sumOfDigits += lastDigits;
            n/=10;
        }
        return sumOfDigits;
    }
}
