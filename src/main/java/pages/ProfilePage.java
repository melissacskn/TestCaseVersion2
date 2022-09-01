package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    private WebDriver driver;


    private By loggedInAs=By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a");

    public ProfilePage(WebDriver driver){
        this.driver=driver;

    }
    public String getloggedInAs(){
        return driver.findElement(loggedInAs).getText();

    }
    private By deleteButton= By.cssSelector("a[href=\"/delete_account\"]");
    public DeleteAccount clickingdelete(){
         driver.findElement(deleteButton).click();
         return new DeleteAccount(driver);

    }


}
