package Recursion;

public class xPowerOFN {
    // Brute force T.C = O(n) //
    public static int isPower(int x , int n){
        if( n == 0){
            return 1 ;
        }
        int xnm1 = isPower(x,n-1);
        int xn = x * xnm1;
        return xn;
    }

    // Optimized code T.C = O(logn) //
    public static int optimizedPower( int a , int n){
        // Base case // 
        if(n == 0){
            return 1;
        }
        // If n is even //
        int halfPower = optimizedPower(a , n/2);
        int halfPowerSq =  halfPower * halfPower;
        // If n is odd //
        if(n % 2 != 0){
        halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(isPower(2, 10));
        System.out.println(optimizedPower(2, 9));
    }
}
