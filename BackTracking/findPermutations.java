package BackTracking;

public class findPermutations {
    public static void findPermutations(String str , String ans){
        // Base Case //
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // Recursion //
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            // To remove the char which is already included we follow the steps in which we add two string first before the i^th element and after the i^th element //
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(newStr, ans+curr); 
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
