import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class array_shiftTest {


        @Test
        public void testArray_shiftMethod() {
            array_shift classUnderTest = new array_shift();
            int[] arr = array_shift.shiftArr(new int []{4,8,15,23,42},16);
            int[] expectedArr =  {4,8,15,16,23,42};
            assertEquals(Arrays.toString(expectedArr), Arrays.toString(arr));


        }

    }







