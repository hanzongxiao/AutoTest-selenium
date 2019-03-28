package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumCase8 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com");

        //显式等待，针对某个元素等待
        /*WebDriverWait wait = new WebDriverWait(driver,10,1);
        wait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver text){
                return text.findElement(By.id("kw"));
            }
        }).sendKeys("selenium");*/

        //显式等待2
        WebElement input = (new WebDriverWait(driver,10,1)).until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));

        //隐式等待

        input.sendKeys("selenium");
        driver.findElement(By.id("su")).click();
        Thread.sleep(2000);

        driver.close();



    }
}
