package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCase3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com");
        driver.manage().window().maximize();

        //获取对象
        WebElement search_text = driver.findElement(By.id("kw"));//输入框
        WebElement search_button = driver.findElement(By.id("su"));//按钮，百度一下

        //动作
        search_text.sendKeys("韩宗啸");
        Thread.sleep(2000);
        search_text.clear();
        search_text.sendKeys("苏宁怎么样");
        //search_button.click();
        search_button.submit();//回车，提交表单
        Thread.sleep(5000);

        //关闭浏览器
        driver.close();
    }
}
