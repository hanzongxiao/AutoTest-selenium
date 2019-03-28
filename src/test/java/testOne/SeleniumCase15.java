package testOne;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumCase15 {
    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.bin", "E:\\迅雷\\firefox-sdk\\bin\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");

        Cookie c1 = new Cookie("name1","111");
        Cookie c2 = new Cookie("name2","222");
        driver.manage().addCookie(c1);
        driver.manage().addCookie(c2);

        //获得cookie
        Set<Cookie> coo = driver.manage().getCookies();
        System.out.println(coo);

        driver.close();
    }
}
