package LinkedList;

import BackTracking.nQueens;

public class doubleLL {
    public class  Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
        // Add opertion (addFirst) //
        public void addFirst(int data){
            size++;
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        // Add opertion (addLast) //
        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
        }
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;

        }
        // To print the o/p //
        public void print(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "<->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        // Remove operation(removeLast) // 
        public int removeFirst(){
            if(head == null){
                System.out.println("dLL is empty");
                return Integer.MIN_VALUE;
            }
            if(size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }
        public int removeLast(){
            if(head == null){
                System.out.println("dLL is empty");
                return Integer.MIN_VALUE;
            }
            if(size == 1){
                int val = tail.data;
                head = tail = null;
                return val;
            }
            int val = tail.data;
            tail = tail.prev;
            tail.next = null;
            size--;
            return val;
        }
        // How to reverse doubleLL //
        public void reverse(){
            Node curr = head;
            Node prev = null;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                curr.prev = next;
                prev = curr;
                curr = next;
            }
            head = prev; 
        }
    public static void main(String[] args) {
        doubleLL dLL = new doubleLL();
        dLL.addFirst(6);
        dLL.addFirst(5);
        dLL.addFirst(4);
        dLL.addFirst(3);
        dLL.addFirst(2);
        dLL.addFirst(1);
        dLL.addLast(7);
        dLL.print();
        dLL.reverse();
        dLL.print();
    }
}
