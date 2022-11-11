import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test8 {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/radio.html";

        driver.get(baseUrl);
        WebElement confirm = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
        confirm.click();

        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));

        radio1.click();
        radio2.click();

        WebElement option1 = driver.findElement(By.id("vfb-6-0"));
        option1.click();

        if (option1.isSelected()){
            System.out.println("Checkbox is on");
        } else {
            System.out.println("Checkbos is off");
        }


    }
}
