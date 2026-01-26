package Strings;

public class subString {
    public static String subString(String str , int si, int ei){
        String subStr = "";
        for(int i=si;i<ei;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.substring(1, 5)); // inbuilt function //
        System.out.println(subString(str, 0, 5));   // full code //
    }    
}

//We have an function in java that is || str.substring(0,5) || in this also we will get the same answer