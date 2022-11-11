import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/login.html";
        driver.get(baseUrl);


        WebElement confirm = driver.findElement(By.xpath("//*[@id=\"authentication\"]/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.name("passwd"));

        confirm.click();
        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefghlkj");
        System.out.println("TC1: Pola tekstowe wypelnione");

        email.clear();
        password.clear();
        System.out.println("TC2: Pola tekstowe wyczyszczone");

        WebElement login = driver.findElement(By.id("SubmitLogin"));
        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefghlkj");
        login.click();
        System.out.println("TC3: Logowanie udane z kliknieciem przycisku");

        driver.get(baseUrl);
        WebElement email2 = driver.findElement(By.id("email"));
        email2.sendKeys("abcd@gmail.com");
        WebElement password2 = driver.findElement(By.name("passwd"));
        password2.sendKeys("abcdefghlkj");
        driver.findElement(By.id("SubmitLogin")).submit();
        System.out.println("TC4: Logowanie udane z metoda submit");
        driver.close();
    }
}
