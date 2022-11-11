import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class test5 {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://www.wskz.pl/";
        driver.get(baseUrl);

        // driver.manage().window().maximize();
        // driver.manage().window().setSize(new Dimension(1600, 768));
        // driver.manage().window().setPosition(new Point(0, 0));

        String selectedLinkOpenNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        WebElement element = driver.findElement(By.linkText("Kontakt"));
        element.sendKeys(selectedLinkOpenNewTab);
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
    }
}
