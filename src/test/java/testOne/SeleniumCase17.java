package testOne;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SeleniumCase17 {
    public static void main(String[] args){

        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile,new File("e:\\screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
