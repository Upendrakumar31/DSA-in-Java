package DivideAndConquer;

public class search {
    public static int search(int arr[] , int tar, int si, int ei){
        // Base case //
        if(si > ei){
            return -1;
        }
        // Kaam //
        int mid = si+(ei-si)/2;

        // case FOUND //
        if(arr[mid] == tar){
            return mid; 
        }

        // mid on L1 //
        if(arr[si] <= arr[mid]){
            // case a :- search on left side of the line //
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{
            // case b :- search on the right side of the line means from mid to the ei //
                return search(arr, tar, mid+1, ei);
            }
        }
        // mid on L2 //
        else{
            // case c :- search on the right side of the mid in the line L2 //
            if(arr[mid] <= tar && tar <= ei){
                return search(arr, tar, mid, ei);
            }else{
            // case d :- search on the left side of the mid in the line L2 to si(L1) //
            return search(arr, tar, mid-1, si);    
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 6;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
