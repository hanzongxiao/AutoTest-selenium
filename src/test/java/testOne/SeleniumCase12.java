package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumCase12 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");

        //获得当前窗口句柄
        String search_handle = driver.getWindowHandle();

        //打开百度注册窗口
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.linkText("登录")).click();
        //Thread.sleep(3000);

        driver.findElement(By.linkText("立即注册")).click();

        //获得所有窗口句柄
        Set<String> handles = driver.getWindowHandles();
//        System.out.println(handles);

        //判断是否为注册窗口，并操作注册窗口上的元素
        for (String handle : handles){
            if (handle.equals(search_handle) == false){
                //切换到注册页面
                driver.switchTo().window(handle);
                System.out.println("现在是注册窗口");
                Thread.sleep(2000);
                /*driver.findElement(By.name("username")).clear();
                driver.findElement(By.name("username")).sendKeys("user name");
                driver.findElement(By.name("phone")).clear();
                driver.findElement(By.name("phone")).sendKeys("phone");
                //.....
                Thread.sleep(2000);*/
                //关闭当前窗口
                driver.close();
                Thread.sleep(2000);
            }
        }
        driver.quit();
    }
}
