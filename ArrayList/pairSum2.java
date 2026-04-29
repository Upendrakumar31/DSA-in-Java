package ArrayList;

import java.util.ArrayList;

public class pairSum2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int BreakingPoint = -1;
        int n = list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>list.get(i+1)){
                BreakingPoint = i;
                break; 
            }
        }
        int LP = BreakingPoint + 1;
        int RP = BreakingPoint;
        while (RP  != LP) {
             // Case 1 //
             if(list.get(RP)+ list.get(LP) == target){
                return true;
             } 
             // Case 2 //
             if(list.get(RP) + list.get(LP) <  target){
                LP = (LP+1)%n;
             }
             // Case 3 //
             else{
                RP = (RP+n-1) % n;
             }
        }
        return false;
    }
    public static void main(String[] args) {
        // Sorted and rotated //
        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 81;
        System.out.println(pairSum2(list, target));
    }
}
