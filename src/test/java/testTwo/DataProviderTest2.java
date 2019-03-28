package testTwo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DataProviderTest2 {

    //定义对象数组
    @DataProvider(name = "add")
    public Object[][] Users(){
        return new Object[][]{
                {3,2,5},
                {4,6,10},
                {3,3,7}
        };
    }

    @Test(dataProvider = "add")
    public void testCase(int add1,int add2,int result){
        assertEquals(add1+add2, result);
    }
}
