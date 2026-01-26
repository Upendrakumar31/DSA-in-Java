package Strings;

public class largestString {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana","papaya","grapes"};
        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        } 
        System.out.println(largest);
    }
}

// Here it check the first alphabet and match with the others words first alphabet and whichever is large it print like our roll number. //