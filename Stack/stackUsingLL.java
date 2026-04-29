package Stack;

import java.util.Stack;

import LinkedList.doubleLL.Node;

public class stackUsingLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class InnerstackUsingLL {
        static Node head = null;

        // If the stack is empty // 
        public static boolean isEmpty(){
            return head == null;
        }

        // Push operation (add to the top) //
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;   
        }

        // Pop operation (remove from the top position) //
        public static int pop(){
             if(isEmpty()){
                return Integer.MIN_VALUE;
             }
             int top = head.data;
             head = head.next;
             return top;  
        }

        //  Peek operation (to see the top element) //
        public static int peek(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            int top = head.data;
            return top; 
        }
    }    

    public static void main(String[] args) {
        InnerstackUsingLL.push(1);
        InnerstackUsingLL.push(2);
        InnerstackUsingLL.push(3);

        while (!InnerstackUsingLL.isEmpty()) {
            System.out.println("Top element is " + InnerstackUsingLL.peek());
            InnerstackUsingLL.pop();
        }    
    }
}
