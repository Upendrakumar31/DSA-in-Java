package Recursion;

public class fibonacci {
    public static int fibonacciSum(int n){
         if ( n==0 || n==1){
            return n;
         }
         int fnm1 = fibonacciSum(n-1);
         int fnm2 = fibonacciSum(n-2);
         int fn = fnm1 + fnm2;
         return fn; 
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacciSum(n));
    }
}
