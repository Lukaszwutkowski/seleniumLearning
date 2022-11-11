import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.pl");
        System.out.println("Test1: Site loaded property");
        driver.findElement(By.id("L2AGLb")).click();
        System.out.println("Test2: Button cookies was clicked");
        driver.findElement(By.name("q")).sendKeys("WSKZ");
        System.out.println("Test3: Wrote word WSKZ to searchbar");
        driver.findElement(By.name("q")).submit();
        System.out.println("Test4: Used searchbar successfully");
        driver.close();

        /*
        po identyfikatorze - By.id
        po nazwie - By.name
        po sciezce - By.xpath
        po selektorze CSS - By.cssSelector
        po nazwie klasy - By.className
        po tekscie lacza - By.linkText
        po nazwie znacznika - By.tagName
        po fragmencie tekstu lacza - By.partialLinkText

        driver.findElement(By.typ("sciezka");

        id > name > css > xpath >
         */


    }
}
