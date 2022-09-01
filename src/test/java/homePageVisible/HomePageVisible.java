package homePageVisible;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class HomePageVisible extends BaseTests {
    @Test
    public void HomepageVisibleSuccessfully(){
        assertEquals(driver.getTitle(),"Automation Exercise","Home page is not visible");
    }


}
