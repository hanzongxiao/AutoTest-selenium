package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumCase5 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com");
        driver.manage().window().maximize();

        WebElement search_setting = driver.findElement(By.linkText("设置"));
        Actions actions = new Actions(driver);
        //actions.clickAndHold(search_setting).perform();//鼠标点击并控制，悬停
        //Thread.sleep(5000);

        actions.contextClick(driver.findElement(By.linkText("新闻"))).perform();//右击指定的元素

        //actions.doubleClick(driver.findElement(By.linkText("新闻"))).perform();//双击指定的元素
        //actions.click(driver.findElement(By.linkText("新闻"))).perform();
        //driver.findElement(By.linkText("新闻")).click();
        //actions.release().perform();

        driver.close();
    }
}
