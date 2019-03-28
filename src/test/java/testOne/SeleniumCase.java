package testOne;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCase {
    public static void main(String[] args) throws InterruptedException {

        //定位到浏览器
        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com");
        //driver.findElement(By.name("wd"));
        //driver.findElement(By.id("kw"));

        //浏览器最大化
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //设置浏览器大小
        driver.manage().window().setSize(new Dimension(200,200));
        Thread.sleep(5000);
        System.out.println("测试页面的标题: " + driver.getTitle());
        //driver.close();

        //第二个浏览器窗口
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("http://www.suning.com");
        driver1.manage().window().maximize();
        Thread.sleep(5000);

        System.out.println("测试页面的标题: " + driver1.getTitle());

        //关闭浏览器
        driver.close();
        Thread.sleep(5000);
        driver1.close();
    }
}
