import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class test4 {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.bing.com/?FORM=Z9FD1";
        driver.get(baseUrl);

        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie ck:cookies){
            System.out.println(ck);
        }
        driver.manage().deleteAllCookies();

        System.out.println(driver.manage().getCookies());
    }
}
