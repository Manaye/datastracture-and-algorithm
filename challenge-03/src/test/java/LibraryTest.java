/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;


public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test public void testSomeLibraryMethod2() {

        Library li = new Library();
        int arr[] = {4, 8, 15, 16, 23, 42};
        int n = arr.length;
        int x = 15;
        assertEquals(2,li.binarySearch(arr, x));

    }



    }





