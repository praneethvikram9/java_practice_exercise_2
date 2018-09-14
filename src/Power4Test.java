import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Power4Test {

    Power4 temp;

    @Before
    public void setUp() throws Exception {
        temp=new Power4();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }


    @Test

    public void power4Positive(){
        int expected=1;
        int result=temp.check_power4(256);
        assertEquals(result,expected);

    }

}