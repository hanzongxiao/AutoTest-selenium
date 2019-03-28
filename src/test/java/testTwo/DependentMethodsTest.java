package testTwo;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DependentMethodsTest {

    @Test
    public void testCase1(){
        assertEquals(3+1,5);
    }

    @Test(dependsOnMethods = {"testCase1"})
    public void testCase2(){
        assertEquals(1+1,2);
    }
}
