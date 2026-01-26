package Arrays;

public class printPairs {

    public static void printPairs(int numbers[]){
           int totPairs = 0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                totPairs++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs is :" + totPairs);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
}
