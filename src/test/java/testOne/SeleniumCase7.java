package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCase7 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com");

        System.out.println("查询前：");

        //获取当前的url和title
        System.out.println("当前title:"+driver.getTitle());
        System.out.println("当前url:"+driver.getCurrentUrl());

        //百度搜索
        WebElement search = driver.findElement(By.id("kw"));
        search.sendKeys("selenium");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        System.out.println("搜索后：");

        //获取当前的url和title
        System.out.println("当前title:"+driver.getTitle());
        System.out.println("当前url:"+driver.getCurrentUrl());

        //获取第一条搜索结果的标题
        WebElement result = driver.findElement(By.xpath("//div[@id='content_left']/div/h3/a"));
        System.out.println(result.getText());

        driver.close();
    }
}
