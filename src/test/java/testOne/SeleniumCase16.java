package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCase16 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().setSize(new Dimension(800,800));
        driver.get("http://www.baidu.com");

        //进行百度搜索
        driver.findElement(By.id("kw")).sendKeys("webdriver api");
        driver.findElement(By.id("su")).click();
        Thread.sleep(3000);

        //将页面滚动条拖到底部
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(100,700);");
        Thread.sleep(3000);

        driver.close();
    }
}
