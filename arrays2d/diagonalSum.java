package arrays2d;

public class diagonalSum {
    public static int diagonalSum(int Matrix[][]){      //Time complexity = O(n^2)
        int sum = 0;                                    //Brute Force
        for(int i=0; i<Matrix.length; i++){
            for(int j=0; j<Matrix[0].length; j++){
                if(i==j){
                    sum += Matrix[i][j];
                }
                else if(i+j == Matrix.length-1){
                    sum += Matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int diagonalSum2(int Matrix [][]){    //Time complexity = O(n) 
        int sum = 0;                                    //Optimal Approach
        for(int i=0; i<Matrix.length; i++){
            //primary diagonal
            sum+= Matrix[i][i];
            //secondary diagonal
            if(i !=Matrix.length-1-i){
                sum+= Matrix[i][Matrix.length -i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int Matrix[][] = {{1,2,3,4},
                          {5,6,7,8,},
                          {9,10,11,12},
                          {13,14,15,16}};
        int result = diagonalSum2(Matrix);   
        System.out.println("Diagonal sum is :" + result);               
    }
}
