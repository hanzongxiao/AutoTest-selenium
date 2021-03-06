package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SeleniumCase13 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.linkText("设置")).click();
        driver.findElement(By.linkText("搜索设置")).click();

        //<select>标签下的下拉选择
        WebElement el = driver.findElement(By.xpath("//select"));
        Select sel = new Select(el);
        sel.selectByValue("20");
        Thread.sleep(2000);

        driver.close();
    }
}
