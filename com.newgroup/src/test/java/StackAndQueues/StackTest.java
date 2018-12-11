package StackAndQueues;

import org.junit.Test;
import static org.junit.Assert.*;
public class StackTest {
    @Test
    public void pushtest() {
        Stack Stack = new Stack();
        Stack.push(4);
        int[] expected = {4};
        int[] act = Stack.toArray();

        assertArrayEquals(expected, act);
    }

    @Test
    public void popTest() {
        Stack Stack = new Stack();
        Stack.push(4);
        Stack.push(2);
        Stack.pop();
        int[] expected = {2, 4};
        int[] act = Stack.toArray();
        assertArrayEquals(expected, act);
    }

    @Test
    public void peekTest() {
        Stack Stack = new Stack();
        Stack.push(4);
        Stack.push(2);
        Stack.peek();
        int[] expected = {2, 4};
        int[] act = Stack.toArray();

        assertArrayEquals(expected, act);
    }
}
