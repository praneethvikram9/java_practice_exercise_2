import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UppercaseTest {

    Uppercase temp;

    @Before
    public void setUp() throws Exception {
        temp=new Uppercase();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }

    @Test

    public void filetestPositive(){
        String expected = "Hello length of file is 5";
        String result;
        result = temp.text_read("news.txt");
        assertEquals(expected,result);

    }
}