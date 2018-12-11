

package linkedlist;


import java.util.ArrayList;
public class LinkedList {

    private Node head;
    private LinkedList next;
    public LinkedList() {
        this.head = null;
    }

    public LinkedList mergeList(LinkedList one, LinkedList two){
        LinkedList first; LinkedList second;
        LinkedList next1;
        LinkedList next2;
        first = one;
        second= two;

        while (one != null && two != null){
            next1 = one.next;
            one.next = two;
            one = next1;

            next2 = two.next;
            two.next = next1;
            two = next2;
        }
        return second = two;

    }
  
// find K

      public int getKFromEnd(int k)  {
        Node current = this.head;
        while (current !=null) {
            Node kAway = current;
            for (int i = 0; i < k; i++) {
                if(kAway.next == null && i != k-1) {
                   throw new IndexOutOfBoundsException(" entered value  is greater than total linked list length");
                }
                kAway = kAway.next;
            }
            if (kAway.next == null) {
                return current.value;
            }
            current = current.next;
        }
        throw new IndexOutOfBoundsException(" entered value is greater than total linked list length");
    }

    public void insert(int value) {
        Node newNode = new Node(value, this.head);
        this.head = newNode;
    }

    public boolean includes(int value) {
        Node current = this.head;
        while (current != null) {
            if (value == current.data) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }
    public ArrayList<Integer> print() {
        Node current = this.head;
        ArrayList<Integer> printArr = new ArrayList<>();
        while (current != null) {
            printArr.add(current.data);
            current = current.next;
        }
        System.out.println(printArr.toString());
        return printArr;
    }


    // Linkedlist insertion before and after
    public void append(int value) {
        Node current = this.head;
        while (current != null) {
            if (current.next == null) {
                current.next = new Node(value, null);
                break;
            }
            current = current.next;
        }
    }

    public void insertBefore(int value, int newVal) {
        if (!includes(value)) {
            return;
        }
        Node current = this.head;
        if(value == current.value) {
            insert(newVal);
            return;
        }

        while (current.next != null) {
            if (current.next.value == value) {
                current.next = new Node(newVal, current.next);
                break;
            }
            current = current.next;
        }
    }

    public void insertAfter(int value, int newVal) {
        if (!includes(value)) {
            return;
        }


        Node current = this.head;


        while (current != null) {
            if (current.value == value) {
                current.next = new Node(newVal, current.next);
                break;
            }
            current = current.next;
        }
    }
}










