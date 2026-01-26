package Arrays;

public class maxSubArraySum {
    //Normal method with Maximum time complexity;
    public static void maxSubArraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum of subArrays = "+ maxSum);
    }
    //time complexity is O(n^2);(Prefix Method)
    public static void maxSubArraySum2(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix [] = new int [numbers.length];
        
        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }


        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];   
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum of subArrays = "+ maxSum);
    }

    //In kadanes algorithm time complexity is minimum;

    public static void kadanes(int numbers []){
        int mxSum = Integer.MIN_VALUE;
        int crSum = 0;
        for(int i=0; i<numbers.length; i++){
            crSum = crSum + numbers[i];
            if(crSum < 0){
                crSum = 0;
            }
            mxSum = Math.max(crSum, mxSum);
        }
        System.out.println("Max sum of subArrays is : " + mxSum);
    }
    public static void main(String[] args) {
        int numbers [] = {-2,-3,4,-1,-2,1,5,-3};
        maxSubArraySum(numbers);
        maxSubArraySum2(numbers);
        kadanes(numbers);
    }
}
