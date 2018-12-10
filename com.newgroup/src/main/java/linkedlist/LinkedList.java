package linkedlist;

import java.util.ArrayList;
public class LinkedList {

    private Node head;

    public LinkedList() {
        this.head = null;
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
}





