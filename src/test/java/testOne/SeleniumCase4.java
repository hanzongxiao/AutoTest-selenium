package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCase4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.baidu.com");

        //获得百度输入框的尺寸
        WebElement size = driver.findElement(By.id("kw"));
        System.out.println(size.getSize());

        //返回百度页面底部信息
        WebElement text = driver.findElement(By.id("cp"));
        System.out.println(text.getText());

        //返回元素的属性
        WebElement ty = driver.findElement(By.id("kw"));
        System.out.println(ty.getAttribute("class"));

        //返回元素的结果是否可见
        WebElement display = driver.findElement(By.id("kw"));
        System.out.println(display.isDisplayed());

        //关闭浏览器
        driver.close();
    }
}
