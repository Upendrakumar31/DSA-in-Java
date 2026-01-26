package BitManupulations.Assignments;

public class swapValues {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        System.out.println("The numbers before swapping" + "x = " + x + " and y = " + y );

        // Swap using XOR property //

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("The numbers after swapping" + "x = " + x + " and y = " + y );

    }
}
