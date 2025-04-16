package DSA.Data_Structure.LinkedList;

public class LinkedList {
    public static Node head = null;
    public static Node tail = null;
    public static int size;
    public static int loop; // To Calculate no of counts of loop

    public static void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public static int deleteAtHead() {
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static void insertAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public static int deleteAtTail() {
        int val;
        if (head == tail) {
            val = head.data;
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            val = tail.data;
            tail = temp;
            tail.next = null;
        }
        size--;
        return val;
    }

    public static void insertNode(int val, int pos) {
        Node newNode = new Node(val);
        if (pos == 0) {
            head = tail = newNode;
        } else {
            Node temp = head;
            while (--pos != 0) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public static int deleteNode(int pos) {
        int val;
        if (pos == 0) {
            val = deleteAtHead();
        } else {
            Node temp = head;
            while (--pos != 0) {
                temp = temp.next;
            }
            val = temp.next.data;
            temp.next = temp.next.next;
            size--;
        }
        return val;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null \nSize=" + size);
    }

    // Returns Index
    public static int findEle(int ele) { // Iterative Method
        Node temp = head;
        int i = 0;
        while (i < size) {
            if (temp.data == ele) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    /* Working Codes
    // Returns boolean
    public static boolean findEle(int ele) { // Iterative Method
        Node temp = head;
        int i = 0;
        while (i < size) {
            if (temp.data == ele) {
                return true;
            }
            temp = temp.next;
            i++;
        }
        return false;
    }

    public static boolean findElement(int ele,Node head1){ // Recursive Method
        boolean bb = false;
        System.out.println("loop no :" + (++loop));
        if(head1.data == ele) {
            return true;
        } else if(head1.next == null){
            return false;
        } else {
            bb = findElement(ele,head1.next);
        }
        return bb;
    }

    */

    public static int findElement(int ele, Node head1) { // Recursive Method
        if (head1 == null) {
            return -1;
        } else if (head1.data == ele) {
            return 0;
        }
        int idx = findElement(ele, head1.next);

        if (idx == -1) {
            return -1;
        } else {
            return idx + 1;
        }
    }

    public static void Reverse() {
        Node prev, curr, next;
        prev = null;
        curr = head;

        while (curr != null) {
            next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    /* TO-Do
        public static Node recRev(Node head1){
            if(head1.next == null){
                return head1;
            }

        }
    */
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
        insertAtTail(6);
        insertAtTail(7);
        insertAtTail(8);
        insertAtTail(9);
        insertAtTail(10);
        insertAtTail(12);
        insertAtHead(5);

        insertNode(2, 2);
        display();

        System.out.println("tail = " + tail.data);
        System.out.println("head = " + head.data);


        System.out.println();

        int val1 = deleteAtHead();
        System.out.println("\nremoved " + val1);
        display();

        int val2 = deleteAtTail();
        System.out.println("\nremoved " + val2);
        display();

        int val3 = deleteNode(2);
        System.out.println("\nremoved " + val3);
        display();

        System.out.println("Element index = " + findEle(11));
        System.out.println("Element index = " + findElement(9, head));

        Reverse();
        display();

        /*
        // For Iterative Method
        if (findEle(0)) {
            System.out.println("Element Found !");
        } else
            System.out.println("Element Not Found !");


        // For Recursive Method
        if (findElement(6,head)) {
            System.out.println("Element Found !");
        } else
            System.out.println("Element Not Found !");

        */
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
}
