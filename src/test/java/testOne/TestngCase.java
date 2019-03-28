package testOne;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngCase {

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是beforeClass");
    }

    @Test
    public void test(){
        System.out.println("这是test");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是afterClass");
    }
}
