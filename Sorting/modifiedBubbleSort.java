package Sorting;

public class modifiedBubbleSort {
    public static void modifiedBubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    // swap //
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,9,7,5,4};
        modifiedBubbleSort(arr);
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

// In worst case time complexity is O(n^2) //
// In best case time complexity is O(n) //