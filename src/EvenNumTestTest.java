import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    EvenNumTest temp;

    @Before
    public void setUp() throws Exception {

        temp=new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }

    @Test

    public void EventestPositive(){
        boolean result=temp.isEven(4);
        assertTrue(result);
    }
}