package QueueWithStacks;
import org.junit.Test;

import java.util.Stack;

import static QueueWithStacks.PseudoQueue.deQueue;
import static QueueWithStacks.PseudoQueue.enQueue;
import static org.junit.Assert.*;
public class PseudoQueueTest {


    PseudoQueue.Queue q = new PseudoQueue.Queue();

    @Test
    public void queueTest(){
        q.stack1 = new Stack<>();
        q.stack2 = new Stack<>();
        enQueue(q, 1);
        assertEquals(1,q.stack1.size()>0);
        assertEquals(1,q.stack2.size()>0);
    }
@Test
    public void enqueueTest(){
    q.stack1 = new Stack<>();
    q.stack2 = new Stack<>();
    enQueue(q, 1);
    assertEquals(1,q.stack1.peek().toString());
}
@Test
    public void dequeueTest(){
    deQueue(q);
    assertEquals(1,q.stack1.peek().toString());
}

}
