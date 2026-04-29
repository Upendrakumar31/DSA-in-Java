package DivideAndConquer;

public class quickSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){
        // Base case //
        if(si >= ei){
            return;
        }
        // Last element //
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); // To sort the left part of the pivot idx //
        quickSort(arr, pIdx+1, ei); // To sort the right part of the pivot idx //
    }

    public static int partition (int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                // To swap we are creating the temp variable 
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i; 
    }
    public static void main(String[] args) {
        int arr [] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
