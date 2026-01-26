package FunctionsAndMethod;

import java.util.Scanner;

public class functions {

    //functions to calculate sum 
    public static void calculateSum( int a ,int b) {
        
       int sum = a+b;
       System.out.println("Sum is : " + sum);
    }

    //functions to calculate multiply of 2 nums
    public static int multiply(int a , int b){
        int product = a * b;
        return product  ;
    }

    //functions to calculate factorial of a nums
    public static int factorial(int n){
        int f = 1 ;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    //functions to calculate binCoeficient
    public static int binCoeficient(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeficient = fact_n/(fact_r * fact_nmr);
        return binCoeficient;
    }

    // //functions to calculate Sum of 2 nums
    // public static int sum(int a,int b){
    //     return a+b;
    // } 

    // //functions to calculate Sum of 3 nums
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }

    //functions to calculate int sum
    public static int sum(int a,int b){
        return a+b;
    }

    // functions to calculate float sum
    public static float sum(float a,float b){
        return a+b;
    }

    //functions to check Prime nums

    public static boolean isPrime(int n){
        //corner cases
        if (n == 2) {
            return true;
        }
        for( int i=2; i<=Math.sqrt(n); i++){   
            if (n % i == 0){      //completely dividing
                return false;
            }
        }
        return true;
    }

    //print primes in the given range
    public static void primesInRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    //conversion of binToDec 
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
       while (binNum > 0) {
        int lastDigit = binNum % 10;
        decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
        pow++;
        binNum = binNum /  10;
       }
       System.out.println("Binar num of " +  myNum + " is = " +decNum);
    }  

    //conversion of decToBin
    public static void decTOBin(int n){
        int pow = 0;
        int binNum = 0;
        while ( n > 0) {
           int rem = n % 2;
            binNum = binNum + (rem   * (int)Math.pow(10, pow));
            pow++;
            n = n/2; 
        }
        System.out.println("Decimal of num " + n + " = " + binNum );
    }
    public static void main(String[] args) {
        decTOBin(15);
    }
}


