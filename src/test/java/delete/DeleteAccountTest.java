package delete;

import base.BaseTests;
import login.LoginTests;
import org.testng.annotations.Test;
import pages.DeleteAccount;
import pages.LoginPage;
import pages.ProfilePage;

public class DeleteAccountTest extends BaseTests {
    @Test
    public void DeleteAccountTesting(){
        LoginPage loginPage=homePage.clickSignupLogin();
        loginPage.setEmailAddressField("melissacskn@gmail.com");
        loginPage.setPasswordFieldField("mel30cos");
        ProfilePage profilepage= loginPage.clickOnLoginButton();
        DeleteAccount deleteAccount =profilepage.clickingdelete();



    }
}
