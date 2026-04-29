package Stack;
import java.util.*;

public class stackBasic {
    static class InnerstackBasic {
    static ArrayList<Integer> list = new ArrayList<>();
    // If the stack is empty // 
    public static boolean isEmpty(){
        return list.size() == 0;
    }

    // Push operation (add to the top) //
    public static void push(int data){
        list.add(data);
    }

    // Pop operation (remove from the top) 
    public static int pop(int data){
        if(isEmpty() ){
            return Integer.MIN_VALUE; 
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top; 
    }

    // Peek operation (to see the top element)
    public static int peek(){
        if(isEmpty() ){
            return Integer.MIN_VALUE; 
        }
        return list.get(list.size()-1);
    }

    }
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
