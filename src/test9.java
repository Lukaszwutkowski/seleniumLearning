import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test9 {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/delete_customer.php";

        driver.get(baseUrl);
        WebElement confirm = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
        confirm.click();
        driver.findElement(By.name("cusid")).sendKeys("53929");
        driver.findElement(By.name("submit")).submit();

        /*
        Alert a = driver.switchTo().alert();

        String alertM = driver.switchTo().alert().getText();

        System.out.println(alertM);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        a.accept();
         */

    }
}
