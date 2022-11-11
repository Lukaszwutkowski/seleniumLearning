import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://www.wskz.pl/";
        driver.get(baseUrl);

        WebElement button = driver.findElement(By.id("comp-ils2cggy3label")); // kontakt
        button.click();
        System.out.println("TC1: Kliknieto w przycisk komtakt");
        driver.navigate().back(); // wstecz
        driver.navigate().forward(); // do przodu
        driver.navigate().refresh(); // odswiez

    }

    public static class test15 {
        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "chromedriver");
            WebDriver driver = new ChromeDriver();

            String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";

            driver.get(baseUrl);
            WebElement confirm = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
            confirm.click();

            String innerText = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
            System.out.println(innerText);
            driver.close();
        }
    }
}
