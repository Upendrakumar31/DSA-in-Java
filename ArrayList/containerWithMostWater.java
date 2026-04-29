package ArrayList;

import java.util.ArrayList;

public class containerWithMostWater {
    // Brute Force - O(n^2) //
    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;
    //     for(int i=0; i<height.size(); i++){
    //         for(int j=i+1; j<height.size(); j++){
    //             int ht = Math.min(height.get(i), height.get(j ));
    //             int wt = j-i;  
    //             int currWater = ht*wt;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;   
    // }


    // 2 pointer approach - O(n) //

    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int LP = 0;
        int RP = height.size()-1;
        while (LP<RP) {
             // Calculate water area //
            int ht = Math.min(height.get(LP), height.get(RP));
            int wth = RP - LP;
            int currWater = ht*wth;
            maxWater = Math.max(maxWater, currWater);    
             // Update pointer //
             if(height.get(LP) < height.get(RP)){
                LP++;
             }else{
                RP--;
             }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}
