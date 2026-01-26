package BitManupulations;

public class oddEven {
    public static void oddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
        oddEven(3);
        oddEven(4);
    }
}
