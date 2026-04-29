package Recursion;

public class tiling {
    public static int tilingProblem(int n){         // 2 * n (floor size)
        //Base case //
        if(n==0 || n==1){
            return 1;
        }
        // Kaam //

        // Vertical placement of the tiles //
        int VerticalPlaced = tilingProblem(n-1);

        // Horizontal placement of the tiles //
        int HorizontalPlaced = tilingProblem(n-2);
        
        int totWays = VerticalPlaced + HorizontalPlaced;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
