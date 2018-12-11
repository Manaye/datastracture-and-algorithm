package StackAndQueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueuesTest {
    Node temp = null;
    Queues test = new Queues();

    @Test
    public void enqueueTest() {
         test.enqueue(1);
         assertEquals(1,test.front.data);
    }
    @Test
    public void dequeueTest(){
        test.enqueue(2);
        assertEquals(1,test.dequeue());
    }
    @Test
    public void peekTest(){
        temp = test.peek();
        assertEquals(1,temp.data);
    }
}
