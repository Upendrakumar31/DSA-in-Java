package Recursion.Assignment;

public class countSubstrs {
    public static int countSubstrs(String str , int i , int j){
        if(i>j){
            return 0;
        }
        if (i == j) {
            return 1;
        }
        int result = countSubstrs(str, i+1, j)
                    +countSubstrs(str, i, j-1)
                    -countSubstrs(str, i+1, j-1);  
        if(str.charAt(i) == str.charAt(j)){
            result +=1;
        }      
        return result;        
    }
    public static void main(String[] args) {
        String str = "abcab";
        System.out.println(countSubstrs(str, 0, str.length()-1));
        
    }
}
