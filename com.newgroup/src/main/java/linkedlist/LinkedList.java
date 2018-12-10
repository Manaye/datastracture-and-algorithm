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





