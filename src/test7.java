import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test7 {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/register.php";

        driver.get(baseUrl);
        WebElement confirm = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
        confirm.click();
        Select country = new Select(driver.findElement(By.name("country")));
        country.selectByVisibleText("BARBADOS");

    }
}
