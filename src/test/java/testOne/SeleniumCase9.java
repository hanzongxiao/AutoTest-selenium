package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumCase9 {
    public static void main(String[] args) {


        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");

        WebDriver driver = new FirefoxDriver();

        //页面加载超时时间给5S
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");

        //定位对象时间给5S，5S定位不到则抛异常
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("kw")).sendKeys("selenium");

        //异步脚本的超时时间设置为3S
        driver.manage().timeouts().setScriptTimeout(3,TimeUnit.SECONDS);

        driver.close();
    }
}
