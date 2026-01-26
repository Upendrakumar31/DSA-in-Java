package BitManupulations;

public class getIthBit {
    public static void IthBit(int n , int i ){
        int bitMask = 1<<i ;
        if((n & bitMask) == 0){
            System.out.println("The number is 0");
        }else{
            System.out.println("The number is 1");
        }
    }
    public static void main(String[] args) {
        IthBit(15,4);
    }
}
