package testTwo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DataProviderTest {

    @Test
    @Parameters({"add1","add2","result"})
    public void testCase1(int add1,int add2,int result){
        assertEquals(add1+ add2, result);
    }
}
