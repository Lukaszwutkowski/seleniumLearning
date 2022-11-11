package tests;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class Test01 {

    WebDriver driver;

    public void setUp(){
        // ustawienia drivera i adres strony logowania
    }

    public void correctLogin(){
        String correctUsername = "user1212";
        String correctPassword = "3873234";

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(correctUsername);
        loginPage.enterPassword(correctPassword);
        loginPage.login();
    }
}
