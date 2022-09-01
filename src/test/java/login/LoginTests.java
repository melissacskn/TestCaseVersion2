package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage=homePage.clickSignupLogin();
        loginPage.setEmailAddressField("melissacskn@gmail.com");
        loginPage.setPasswordFieldField("mel30cos");
        ProfilePage profilePage= loginPage.clickOnLoginButton();
        assertEquals(profilePage.getloggedInAs(),"Logged in as Melissa Coskun","Logged in as username is invisible");

    }



}
