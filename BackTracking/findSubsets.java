package BackTracking;

public class findSubsets {
     public static void findSubsets(String str, String ans, int i){
        // Base Case //
        if(i == str.length()){
            System.out.println(ans);
            return;
        }


        // No Choice //
        findSubsets(str, ans, i+1);

        // Yes Choice //
        findSubsets(str, ans+str.charAt(i), i+1);

     }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0); 
    }
}
