import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome temp;

    @Before
    public void setUp() throws Exception {
        temp = new Palindrome();

    }

    @After
    public void tearDown() throws Exception {
        temp = null;

    }

    @Test

    public void reversePositive(){

        String expected="tset";
        String result=temp.reverse("test");
        assertEquals(expected,result);

    }

    @Test

    public void palindromePositive(){
        String expected="true";
        String result=temp.check_palindrome("malayalam");
        assertEquals(expected,result);
    }
}