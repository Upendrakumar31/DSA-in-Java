package ArrayList;

import java.util.ArrayList;

public class pairSum1 {         
    // Brute Force - O(n^2) //


    // public static boolean pairSum1(ArrayList<Integer> list, int target){
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //              if(list.get(i) + list.get(j) == target){
    //                 return true;
    //              }
    //         }
    //     }
    //     return false;
    // }



    // Optimize Approach (2 Pointer Approach) //

    public static boolean pairSum1(ArrayList<Integer> list, int target){
        int LP = 0;
        int RP = list.size()-1;
        while (RP != LP) {
            // Case 1 //
            if(list.get(LP) + list.get(RP) == target){
                return true;
            }
            // Case 2 //
            else if (list.get(LP) + list.get(RP) < target){
                LP++;
            }
            // Case 3 //
            else if(list.get(LP) + list.get(RP) > target){
                RP--; 
            }
        }
        return false;
    }


    public static void main(String[] args) {
        // Sorted //
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 89;
        System.out.println(pairSum1(list, target));
    }
}
