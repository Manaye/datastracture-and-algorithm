package linkedlist;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {


    @Test
    public void testinsert() {
        LinkedList oneList = new LinkedList();
        oneList.insert(3);
        oneList.insert(10);
        oneList.insert(9);

        LinkedList twoList = new LinkedList();
        twoList.insert(0);

        assertTrue("expect true for oneList,3" ,oneList.includes(3));
        assertFalse("expect true for oneList,0" ,oneList.includes(0));
    }

    @Test
    public void includes() {

        LinkedList onelist = new LinkedList();
        onelist.insert(6);
        onelist.insert(16);

        assertTrue("expect true for oneList,6" ,onelist.includes(6));
        assertFalse("expect true for oneList,11" ,onelist.includes(11));

    }

    @Test
    public void testprint() {
        LinkedList oneList = new LinkedList();
        oneList.insert(3);
        oneList.insert(10);


        ArrayList<Integer> one = oneList.print();
        assertTrue(one.size()>0);

    }
}

