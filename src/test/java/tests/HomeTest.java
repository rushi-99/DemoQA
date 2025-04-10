package tests;

import base.BaseTest;
import pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    private HomePage homePage;

    @BeforeMethod
    public void setUpTest() {
        homePage = new HomePage(driver);
    }

    @Test(priority = 1)
    public void verifyElementNavigation(){
        homePage.pressElement();
        homePage.validateNavigation();
    }

    @Test(priority = 2)
    public void verifyFormNavigation(){
        homePage.pressForm();
        homePage.validateNavigation();
    }

    @Test(priority = 3)
    public void verifyAlertNavigation(){
        homePage.pressAlert();
        homePage.validateNavigation();
    }

    @Test(priority = 4  )
    public void verifyWidgetNavigation(){
        homePage.pressWidget();
        homePage.validateNavigation();
    }

    @Test(priority = 5  )
    public void verifyInterationsNavigation(){
        homePage.pressInterations();
        homePage.validateNavigation();
    }

    @Test(priority = 6)
    public void verifyBookStoreApplicationNavigation(){
        homePage.pressBookStoreApplication();
    }


}
