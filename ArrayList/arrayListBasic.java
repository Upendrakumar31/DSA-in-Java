
package ArrayList;

import java.util.ArrayList;

public class arrayListBasic {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Boolean> list3 = new ArrayList<>();
    
    // Add Operation //
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list ); // Output = [1,2,3,4,5]

    // Get Operation //
     int element =  list.get(2);
     System.out.println(element); // Output = 3

     // Remove Operation //
     list.remove(3);
     System.out.println(list); // Output = [1,2,3,5]

     // Set element at Index //
     list.set(1, 7);
     System.out.println(list); // Output = [1,7,3,5 ]

     // Contains element //
     System.out.println(list.contains(3)); // Output = true
     System.out.println( list.contains(11));    // Output = false 

     // Print reverse //
     for(int i=list.size()-1; i>=0; i--){
        System.out.print(list.get(i)+ " ");
     }
     System.out.println();
    }
}
