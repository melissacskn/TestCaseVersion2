package loginaccountvisible;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;

import static org.testng.Assert.assertEquals;

public class LoginAccountVisible extends BaseTests {


    @Test
    public void logInToYourAccountVisible(){
        LoginPage log=homePage.clickSignupLogin();
        assertEquals(log.loginAccountTest(),"Login to your account","'Login in to your account is not visible'");
    }


}
