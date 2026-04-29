package Stack;
import java.util.*;

public class duplicateParentheses {
    public static boolean isCntnDup(String str){
         Stack<Character> s = new Stack<>();
         for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // Step 1 -: checking for closing brackets //
            if( ch == ')'){
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; // contains duplicateParentheses //
                }else{
                    s.pop(); // opening pair //
                }
            }else{
                // Step 2 -: checking for open brackets , opertors , operands and push in the stack / 
                 s.push(ch);
            }
         }
         return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; // true because duplicate exist  //
        String str1 = "(a+b)";  // false because duplicate not present //
        System.out.println(isCntnDup(str1));
    }
}
