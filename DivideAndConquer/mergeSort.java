package DivideAndConquer;

public class mergeSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr [], int si, int ei){
        // Base case //
        if(si >= ei){
            return;
        }
        // Kaam //

        // Finding the mid //
        int mid = si + (ei -si)/2; // (si + ei)/2 => same formula but it is not good for the big size arr //

        // Calling recursivey to the smaller remaining arr //
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        // Final step to merge all the single elements to get the final sorted arr //
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[],int si, int mid, int ei){
        int temp [] = new int[ei - si + 1]; // creating a temp arr to store the broken sorted arr 
        int i = si; // iterator for the left part 
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr

        while (i<=mid && j<= ei) {
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // If any elements left in the left part and right part is finsihed because in the above loop we are using AND operator //
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        // If any elements left in the right part and left part is finsihed because in the above loop we are using AND operator //
        while (j<=ei) {
            temp[k++] = arr[j++];
        }
        // To copy all the elements from the temp arr to the main arr //
        for(k=0,i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
