package Recursion;

public class lastOccurence {
    public static int lastOccur(int arr [], int key, int i){
        if( i == arr.length){
            return -1;
        }
       int isFound = lastOccur(arr,key,i+1);
       if(isFound == -1 && arr[i] == key){
        return i;
       }
       return isFound;
    }
    public static void main(String[] args) {
        int arr [] = {3,7,5,1,9,4,6,5};
        System.out.println(lastOccur(arr, 5, 0));
    }
}
