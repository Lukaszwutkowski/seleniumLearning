import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/facebook.html");

        WebElement confirm = driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
        confirm.click();
        WebElement chk = driver.findElement(By.id("persist_box"));
        for (int i = 0; i < 1; i++){
            chk.click();
            System.out.println("TC1: Przycisk zapamietania logowania: " + chk.isSelected());
        }
    }
}
