package BitManupulations;

public class updateIthBit {
    public static int updateIthBit(int n , int i , int newBit){
        int bitMask = ~(1<<i);
        // Clear the Ith bit //
        n = n & bitMask;

        // set ith bit according to newBit//
        n = n | ( newBit << i ); 
        return n;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
