package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailAddressField = By.cssSelector("input[data-qa=\"login-email\"]");
    private By passwordField= By.cssSelector("input[data-qa=\"login-password\"]");
    private By loginButton= By.cssSelector("button[data-qa=\"login-button\"]");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setEmailAddressField(String email){
        driver.findElement(emailAddressField).sendKeys("melissacskn@gmail.com");
    }
    public void setPasswordFieldField(String password){
        driver.findElement(passwordField).sendKeys("mel30cos");
    }

    public String loginAccountTest(){
       return driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > h2")).getText();
    }
    public ProfilePage clickOnLoginButton(){
        driver.findElement(loginButton).click();
        return new ProfilePage(driver);
    }





}
