package testTwo;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class TestNGCase1 {

    @Test
    public void testCase(){
        assertEquals(2+2,4);
        System.out.println("111");
        System.out.println("222");
    }
    @Test
    public void testCase1(){
        System.out.println("333");
    }
}
