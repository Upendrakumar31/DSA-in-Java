package LinkedList;

import java.util.LinkedList;

import DivideAndConquer.mergeSort;

public class linkedListBasic {
    public static class Node{
        int data;
        Node Next;

        public Node (int data){
            this.data = data;
            this.Next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // S-1 Create a new node //
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // S-2 assigning the next of a new node to the head of the existing node which help us to link the node // 
        newNode.Next = head;
        //S-3 head = newNode //
        head = newNode;
    }

    // How to add in last of the LinkedList //

    public void addLast(int data){
        Node newNode =  new Node(data);
        size++;
        if(head == null){
             head = tail = newNode;
             return;
        }
        tail.Next = newNode;
        tail = newNode;
    }
    // To print the linkedList //
    public void print(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.Next;
        }
        System.out.println("null ");
    }

    // How to add a new node at any particular idx //
    public void addAtIdx(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i<idx-1) {
           temp = temp.Next;
           i++;
        }
        // i = idx -1 , temp -> prev 
        newNode.Next = temp.Next;
        temp.Next = newNode;
    }

    // How to remove the first node in the linked list //
    public int removeFirst(){
        if(size == 0){
            System.out.print("Your linkedList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.Next;
        size--;
        return val;
    }

    // How to delete the last node in the linkedList //


    public int removeLast(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
         // prev = idx : size - 2 //
         Node prev = head;
         for(int i=0; i<size-2 ; i++){
            prev = prev.Next;
         }
         int val = prev.Next.data;
         prev.Next = null;
         tail = prev;
         size--;
         return val;
    } 

    // How to apply linear search in linkedList //

    public int itrSearch(int key){ //T.C = O(n) //
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if(temp.data == key){
                return i;
            }
            temp = temp.Next;
            i++;
        }
        return -1;
    }

    // How to search idx using recursive technique //
    public int helper(Node head , int key){    //T.C = O(n) //
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.Next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    // How to reverse an linkedList //
    public void reverse(){
        Node prev = null;
        Node curr = tail = head ;
        Node Next;
        while (curr != null) {
            Next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = Next;
        }
        head = prev;
    }
    // How to remove node of nth position from end //
    public void removeNthFromLast(int n){
        // calculate size //
         int sz = 0;
         Node temp = head;
         while (temp != null) {
            temp = temp.Next; 
            sz++;
         } 
         // case 1 if i have to delete my head only;
         if(n == sz){
             head = head.Next;
             return;
         }
         // case 2 how to delete the actual node  (sz-n(prev of the actual node))//
         int i =1;
         int iToFind = sz-n;
         Node prev = head;
         while (i<iToFind) {
            prev = prev.Next;
            i++;
         }
         prev.Next = prev.Next.Next;
         return;
    }

    // How to check the given linkedList is an pallindrome or not //
    // Step 1 -: First calculate the mid //
    public Node findMid(Node head){ // helper function 
        Node slow = head.Next; // +1 jump
        Node fast = head.Next.Next; // +2 jump

        while (fast !=null && fast.Next !=null) {
            slow = slow.Next;
            fast = fast.Next.Next;
        }
        return slow; // It is the mid of the LinkedList //
    }
    // actual code //
    public boolean checkPalindrome(){
        // Base case //
        if(head == null || head.Next == null){
            return true;
        }
        // Step 1 -: calculate mid //
        Node midNode = findMid(head);

        // Step 2 -: reverse the 2nd half of the LinkedList //
        Node prev = null;
        Node curr = midNode;
        Node Next;
        while (curr !=null) {
            Next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = Next;
        }
        Node right = prev; // right half ka head // 
        Node left = head;

        // Step 3 -: check left half & right half // 
        while (right !=null) {
            if(left.data != right.data){
                return false;
            }
            left = left.Next;
            right = right.Next;
        }
        return true; 
    }

    // How to detect cycle in a linkedList //
     public boolean isCyclic(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.Next != null) {
            slow = slow.Next; // +1
            fast = fast.Next.Next; // +2
            if(slow == fast){
                return true; // cycle exist //
            }
        }
        return false; // cycle doesn't exist //
     }
     public static void removeCycle(){
        // Step 1 -: detect cycle //
        Node slow = head;
        Node fast = head;
        boolean cycle = false; 
        while (fast != null && fast.Next != null) {
            slow = slow.Next; // +1
            fast = fast.Next.Next; // +2
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        // Step 2 -: find the meeting point //
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.Next;
            fast = fast.Next;
        }

        // Step 3 -: break the cycle by making the prev.Next = null //
        prev.Next = null;
     }

     // Question-: How to apply mergeSort in linkedList //

     //Steps to get the mid //

     private Node getMid(Node head){
        Node slow = head;
        Node fast = head.Next;
        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
        }
        return slow;
     }
     // Code to merge the left newLeft and newRight //
    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.Next = head1;
                head1 = head1.Next;
                temp = temp.Next;
            }else{
                temp.Next = head2;
                head2 = head2.Next;
                temp = temp.Next;
            }
        }
        while (head1 != null) {
            temp.Next = head1;
            head1 = head1.Next;
            temp = temp.Next;
        }
        while (head2 !=null) {
            temp.Next = head2;
            head2 = head2.Next;
            temp = temp.Next;
        }
        return mergedLL.Next;
    }
     
     

     public Node mergeSort(Node head){ // TC = O(nlogn)
        //Base case //
        if(head == null || head.Next == null){
            return head;
        }
        // Step 1-: Find the mid node //
        Node mid = getMid(head);

        //Step 2-: left and right mergeSort //
        Node rightHead = mid.Next;
        mid.Next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Step 3-: Finally how to merge the left and right half //
        return merge(newLeft, newRight);
     }

     // Question -: How the convert a normal linkedList into a zig-zag fashion //
     public void zigZag(){
        // Step 1 -: Find the mid using slow-fast pointer //
        Node slow = head;
        Node fast = head.Next;
        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
        }
        Node mid = slow;

        // Step 2 -: Reverse the 2nd half of the linkedList //
        Node curr = mid.Next;
        mid.Next = null;
        Node prev = null;
        Node Next;
        while (curr != null) {
            Next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = Next;
        }

        Node leftHead = head;
        Node rightHead = prev;
        Node nextL , nextR; 

        // Step 3 -: Alt merge(zigZag merge)
        while (leftHead != null && rightHead != null) {
            nextL = leftHead.Next;
            leftHead.Next = rightHead;
            nextR = rightHead.Next;
            rightHead.Next = nextL;

            leftHead = nextL;
            rightHead = nextR;
        }
     }
    public static void main(String[] args) {
        linkedListBasic ll = new linkedListBasic();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.zigZag();
        ll.print();
        

        
    } 
}
