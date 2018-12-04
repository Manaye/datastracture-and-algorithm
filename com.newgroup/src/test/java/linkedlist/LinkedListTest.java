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
        onelist.insert(26);

        assertTrue("expect true for oneList,6" ,onelist.includes(6));
        assertFalse("expect true for oneList,0" ,onelist.includes(0));
        ArrayList<Integer> one = new ArrayList<>();
        one.add(3);
        one.add(5);
        one.add(6);


        LinkedList twoList = new LinkedList();
        twoList.insert(0);
        ArrayList<Integer> two = new ArrayList<>();
        two.add(0);



        LinkedList threelist = new LinkedList();
        threelist.insert(2);
        threelist.insert(2);
        threelist.insert(2);

        ArrayList<Integer>three = new ArrayList<>();
        three.add(2);
        three.add(2);
        three.add(2);

        assertEquals(one,onelist.print());
        assertEquals(two,onelist.print());
        assertEquals(two,onelist.print());

    }

    @Test
    public void testprint() {
        LinkedList oneList = new LinkedList();
        oneList.insert(3);
        oneList.insert(10);

        ArrayList<Integer> one = new ArrayList<>();
        one.add(3);
        one.add(5);
        one.add(6);

        LinkedList twoList = new LinkedList();
        twoList.insert(0);

        ArrayList<Integer> two = new ArrayList<>();
        two.add(0);

        assertEquals(one,oneList.print());
        assertEquals(two,oneList.print());

    }
}
