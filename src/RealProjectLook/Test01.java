package RealProjectLook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {

    public static void main(String[] args){

        DriverFactory drf = DriverFactoryProvider.getDriverFactory("chrome");
        WebDriver driver = drf.getDriver();

        String baseUrl = "http://demo.guru99.com/test/social-icon.html";

        driver.get(baseUrl);
        WebElement confirm = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
        confirm.click();
    }
}
