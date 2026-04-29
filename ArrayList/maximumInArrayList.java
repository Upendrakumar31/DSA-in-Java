package ArrayList;

import java.util.ArrayList;

public class maximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(4);
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(largest<list.get(i)){
                largest = list.get(i);
            }
        }
        System.out.println("Largest element in the arraylist is = " + largest);
    }
}

// Time complexity is O(n); // 