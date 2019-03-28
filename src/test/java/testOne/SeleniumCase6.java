package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCase6 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com");

        WebElement input = driver.findElement(By.id("kw"));

        //输入框输入内容
        input.sendKeys("seleniumm");
        Thread.sleep(2000);

        //删除多输入的一个m
        input.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);

        //输入空格键+教程
        input.sendKeys(Keys.SPACE);
        input.sendKeys("教程");
        Thread.sleep(2000);

        //全选输入框内容ctrl+a
        input.sendKeys(Keys.CONTROL,"a");
        Thread.sleep(2000);

        //剪切输入框内容ctrl+x
        input.sendKeys(Keys.CONTROL,"x");
        Thread.sleep(2000);

        //粘贴内容到输入框ctrl+v
        input.sendKeys(Keys.CONTROL,"v");

        //通过回车键来代替点击操作
        input.sendKeys(Keys.ENTER);
        //input.submit();

        driver.close();

    }
}
