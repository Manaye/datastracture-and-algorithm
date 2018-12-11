package StackAndQueues;

public class Queues {
    Node front;
    Node rear;

    public Queues() {
        this.front = null;
        this.rear = null;

    }

    public void enqueue(int data) {
        Node node = new Node(data);
        if (this.rear == null) {
            rear = node;
            this.front = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }
        public Node dequeue(){
            if (this.front == null) {
                return null;
            }

            Node temp = front;
            front = front.next;
            temp.next = null;
            return temp;
        }

        public Node peek () {
            return this.front;
        }
        public int length (Node head){
            if (head == null) {
                return 0;
            }
            int count = 0;
            Node current = head;
            while (current != null){
                count++;
                current = current.next;
            }
              return  count;
        }

    public int [] toArray(){
        Node current = this.front ;
        int [] arr = new int [length(this.front)];
        int i = 0;
        while ((current != null)){
            arr[i++]= current.data;
            current = current.next;
        }
        return arr;
    }
}





