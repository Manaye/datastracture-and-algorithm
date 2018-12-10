
package linkedlist;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class LinkedListTest {
    LinkedList test = new LinkedList();
    @Test
    public void testinsert() {
        LinkedList oneList = new LinkedList();
        oneList.insert(3);
        oneList.insert(10);
        oneList.insert(9);
        LinkedList twoList = new LinkedList();
        twoList.insert(0);
        assertTrue("expect true for oneList,3", oneList.includes(3));
        assertFalse("expect true for oneList,0", oneList.includes(0));
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
    @Test
    public void testAppend(){
        test.insert(23);
        test.append(34);
        assertTrue(test.includes(34));
    }
    @Test
    public void testInsertBefore(){
        test.insert(50);
        test.insert(100);
        test.insertBefore(50,70);
        assertTrue(test.includes(50));
    }
    @Test
    public void testInsertAfter(){
        test.insert(90);
        test.insertAfter(90,95);
        assertTrue(test.includes(90));
    }
    @Test
    public void testGetKfromEnd(){
        test.insert(0);
        test.insert(1);
        test.insert(2);
        assertEquals(0,test.getKFromEnd(1));
    }

    @Test
    public void mergeList() {

        LinkedList oneList = new LinkedList();
        oneList.insert(1);
        oneList.insert(3);
        oneList.insert(2);

        LinkedList twoList = new LinkedList();
        twoList.insert(5);
        twoList.insert(9);
        twoList.insert(4);
        //merge
        LinkedList ll = new LinkedList();
        ll.mergeList(oneList, twoList);
        //expected
        LinkedList expectedList = new LinkedList();
        expectedList.insert(1);
        expectedList.insert(5);
        expectedList.insert(3);
        expectedList.insert(9);
        expectedList.insert(2);
        expectedList.insert(4);

        assertTrue("contains the element ", twoList.includes(5));


    }
}

