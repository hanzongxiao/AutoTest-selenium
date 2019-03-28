package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCase2 {
    public static void main(String[] args) throws InterruptedException {
        //定位浏览器
        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");

        WebDriver driver = new FirefoxDriver();

        //get到百度首页
        driver.get("http://www.baidu.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println("当前网址：" + driver.getCurrentUrl());

        //点击“新闻”链接
        driver.findElement(By.linkText("新闻")).click();
        Thread.sleep(2000);
        System.out.println("当前网址：" + driver.getCurrentUrl());

        //执行浏览器后退
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("当前网址："+driver.getCurrentUrl());

        //执行浏览器前进
        driver.navigate().forward();
        Thread.sleep(2000);
        System.out.println("当前网址："+driver.getCurrentUrl());

        //刷新页面
        driver.navigate().refresh();
        Thread.sleep(2000);

        //关闭浏览器
        driver.close();
    }
}
