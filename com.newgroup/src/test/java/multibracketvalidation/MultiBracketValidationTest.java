package multibracketvalidation;
import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {


   @Test
    public void testMultiBracketValidation(){

       assertTrue(MultiBracketValidation.multiBracketValidation("{}"));
       assertTrue(MultiBracketValidation.multiBracketValidation("{}(){}"));
       assertTrue(MultiBracketValidation.multiBracketValidation("(){}[[]]"));
       assertFalse(MultiBracketValidation.multiBracketValidation("){"));
   }
    @Test
    public void testMultiBracketValidationWithOtherCharacters(){

        assertTrue(MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
        assertTrue(MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));
        assertFalse(MultiBracketValidation.multiBracketValidation("{hello(123)"));
    }

}
