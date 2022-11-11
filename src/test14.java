import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test14 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/social-icon.html";

        driver.get(baseUrl);
        WebElement confirm = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
        confirm.click();

        String expectedTooltip = "Github";
        WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));
        String actualTooltip = github.getAttribute("title");

        System.out.println("Aktualny tytul Tooltip: " + actualTooltip);
        if (actualTooltip.equals(expectedTooltip)){
            System.out.println("TC1: OK!");
        }
        driver.close();

    }
}
