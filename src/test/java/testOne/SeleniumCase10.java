package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumCase10 {
    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement search_text = driver.findElement(By.id("kw"));
        search_text.sendKeys("selenium");
        search_text.submit();

        //匹配第一页搜索结果的所有标题的元素
        List<WebElement> search_result = driver.findElements(By.xpath("//div/div/h3"));

        //打印所有元素的个数
        System.out.println(search_result.size());

        //循环打印获得的所有元素的内容，即所有的标题
        for (WebElement result :search_result){
            System.out.println(result.getText());
        }

        System.out.println("------------------------------------------");

        //打印第n结果的标题
        WebElement text = search_result.get(search_result.size() - 10);
        System.out.println(text.getText());

        driver.close();
    }
}
