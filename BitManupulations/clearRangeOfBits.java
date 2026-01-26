package BitManupulations;

public class clearRangeOfBits {
    public static int clearRangeOfBits(int n, int i, int j ){
        int a = ((~0)<<(j+1));
        int b = ((i<<1)-1);
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(10, 1, 2));
    }
}
