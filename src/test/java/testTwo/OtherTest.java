package testTwo;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class OtherTest {

    //该条用例跳过执行
    @Test(enabled = false)
    public void testCase1(){
        System.out.println("123");
    }

    //设定用例超时时间
    @Test(timeOut = 3000)
    public void testCase2() throws InterruptedException {
        Thread.sleep(4000);
    }

    //预设用例抛出的异常类型
    @Test(expectedExceptions = RuntimeException.class)
    public void testCase3(){
        assertEquals(2/0,1);
    }
}
