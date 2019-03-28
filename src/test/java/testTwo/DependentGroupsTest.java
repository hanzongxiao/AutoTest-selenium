package testTwo;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DependentGroupsTest {

    @Test(groups = {"funtest"})
    public void testCase1(){
        assertEquals(3+1, 5);
    }

    @Test(groups = {"funtest"})
    public void testCase2(){
        assertEquals(3+2,5);
    }

    @Test(dependsOnGroups = {"funtest"})
    public void testCase3(){
        assertEquals(1+1,2);
    }
}
