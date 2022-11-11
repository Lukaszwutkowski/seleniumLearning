import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class test15 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/social-icon.html";

        driver.get(baseUrl);
        WebElement confirm = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
        confirm.click();

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("ZrzutEkranu.png"));
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        driver.close();
    }
}
