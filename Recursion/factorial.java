package Recursion;

public class factorial {
    public static Integer factorial(int n){
        if(n ==  0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * factorial(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorial(n));
    }
}
