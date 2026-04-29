package Recursion;

public class firstOccurence {
    public static int firstOccur(int arr[], int key, int i){
         if(i == arr.length){
            return -1;
        }
        if(arr [i] == key){
            return i;
        } 
        return firstOccur(arr,key,i+1);
       
    }
    public static void main(String[] args) {
        int arr [] = {3,7,5,1,9,4,6,5};
        System.out.println(firstOccur(arr,2 ,0));
    }
}
