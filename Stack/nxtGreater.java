package Stack;
import java.util.*;

public class nxtGreater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];
        
        for(int i=arr.length-1; i>=0; i--){
            // Step 1 -: To run the while loop //
            while (!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // Step 2 -: To check if else statement //
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            } else{
                nxtGreater[i ] = arr[s.peek()];
            }

            // Step 3 -: To push in s // 
            s.push(i);
        }
        for(int i=0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}


// Ye code nxtGreater from right nikalne bola hai //
// Agar left greater nikalne bolta to loop left se chalate upar wale loop //
// Next Smaller right me bs sign change krna h taki bade numbers ko remove kr paye //
// Next Smaller left k liye loop bhi left se start hoga pr sign bhi change hoga // 