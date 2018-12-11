
package StackAndQueues;

public class Stack {
    public Node top;

    public Stack() {
        this.top = null;
    }
    public void push(int data) {
        Node node = new Node(data);
        node.next = this.top;
        this.top = node;
    }

        public Node pop(){
            Node temp = this.top;
            this.top = this.top.next;
            temp.next = null;
            return temp;
        }
        public Node peek () {
            return this.top;
        }
        public int length (Node head){
            if (head == null) {
                return 0;
            }
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
        public int[] toArray () {
            Node current = this.top;
            int[] arr = new int[length(this.top)];
            int i = 0;
            while ((current != null)) {
                arr[i++] = this.top.data;
                this.top = this.top.next;
            }
            return arr;

        }
    }






