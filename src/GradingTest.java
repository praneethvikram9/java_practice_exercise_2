import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradingTest {


    Grading temp;

    @Before
    public void setUp() throws Exception {
        temp= new Grading();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }

    @Test

    public void gradingPositive(){
        int n = 4 ;
        int[] array = { 86 , 65 , 98 , 77};
        double[] result = temp.Grades(n,array);
        assertEquals(result[0],81.50,0.0001);
        assertEquals((int)result[1],65);
        assertEquals((int)result[2],98);
    }
}