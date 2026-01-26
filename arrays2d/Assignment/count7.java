package arrays2d.Assignment;

public class count7 {
    public static void count7(int array[][]){
        int count7 = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j] == 7){
                    count7++;
                }
            }
        }
        System.out.println("Count of 7 is : " + count7);
    }
    public static void main(String[] args) {
        int array[][] = {{4,7,8},{8,8,7}};
        count7(array);
    }
}


