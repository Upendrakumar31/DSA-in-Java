package Recursion;

public class friendsPairing {
    public static int friendsPairing(int n){
        // Base case //
        if(n == 1 || n == 2){
            return n;
        }

        // Kaam //
        // Choice //

        // Single //
        int fnm1 = friendsPairing(n-1);

        // Pair //
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        // Total ways //
        int totWays = fnm1 + pairWays;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
  