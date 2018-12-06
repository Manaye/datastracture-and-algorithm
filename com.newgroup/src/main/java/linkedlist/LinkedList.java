package linkedlist;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;

public class LinkedList {
//    public static LinkedList merge(LinkedList one, LinkedList two){
//        public void mergeLists{


     private int data;
     private LinkedList next;
    //merge
//     public ListNode(int data){
//         this.data = data;
//         this.next = null;
//     }
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


    public  class append {


            private  class ListNode{
                private int data;
                private ListNode next;
                public ListNode(int data){
                    this.data = data;
                    this.next = null;
                }

            }
            //insertBefore

            public ListNode insertAtBeginning(ListNode head, int data) {
                ListNode newNode = new ListNode(data);
                if(head == null){
                    return newNode;

                }
                newNode.next = head;
                head = newNode;
                return head;
            }
            //insertAtEnd

            public  ListNode insertAtEnd(ListNode head, int data){

                ListNode newNode = new ListNode(data);
                if(head == null){
                    return newNode;
                }
                ListNode current = head;
                while (null !=current.next){
                    current = current.next;

                }
                current.next = newNode;
                return  head;

            }
            //insertAfter
            public  void insertAfter(ListNode previous, int data){
                if(previous == null){
                    System.out.println("the given previous node cannot be null.");
                    return;
                }
                ListNode newNode = new ListNode(data);
                newNode.next = previous.next;
                previous.next = newNode;
            }
            //insertBefore

            public void insertBefore(ListNode next, int data){
                if(next == null){
                    System.out.println("the given next node cannot be null.");
                    return;
                }
                ListNode newNode = new ListNode(data);
                newNode.next = next.next;
                next.next = newNode;
            }
            //
            //display
            public  void display(ListNode head){
                if(head == null){
                    return;
                }
                ListNode current = head;
                while(current != null){
                    System.out.println(current.data + " -->");
                    current = current.next;
                }
                System.out.println(current);
            }


            public  void main(String[] args) {

                ListNode head = new ListNode(10);
                ListNode first = new ListNode(20);
                ListNode second = new ListNode(5);
                ListNode third = new ListNode(18);
                ListNode fourth = new ListNode(11);
                //form a list
                head.next = second;
                second.next = third;
                third.next = fourth;
                append ap = new append();
                ap.display(head);
                ListNode newHead = ap.insertAtEnd(head, 15);
                ap.display(newHead);
                ListNode newHead2 = ap.insertAtBeginning(head, 99);
                ap.display(newHead2);
                ap.insertAfter(second,88);
                ap.insertBefore(third, 33);

            }
        }

    }







