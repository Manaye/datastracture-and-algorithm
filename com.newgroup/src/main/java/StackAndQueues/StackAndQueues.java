package StackAndQueues;

import java.util.EmptyStackException;
import java.util.*;

public class StackAndQueues {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> stack = new Stack<Integer>();
     stack.push(17);
    int a = stack.pop();

    Stack collection = new Stack();

//        for (String s : stack)
//            StdOut.println(s);

        static void push(java.util.Stack st, int a) {
            st.push(new Integer(a));
            System.out.println("push(" + a + ")");
            System.out.println("stack: " + st);
        }

        static void pop(java.util.Stack st) {
            System.out.print("pop -> ");
            Integer a = (Integer) st.pop();
            System.out.println(a);
            System.out.println("stack: " + st);
        }
        public static void main(String args[]) {

            java.util.Stack st = new java.util.Stack();
            System.out.println("stack: " + st);
            push(st, 42);
            push(st, 66);
            push(st, 99);
            pop(st);
            pop(st);
            pop(st);
            try {
                pop(st);
            } catch (EmptyStackException e) {
                System.out.println("empty stack");
            }
        }
    }



}
