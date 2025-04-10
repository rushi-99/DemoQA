package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RadioButtonPage;

public class RadioButtonTest extends BaseTest {
    private RadioButtonPage radioButtonPage;
    private HomePage homePage;

    @BeforeMethod
    public void setUp() {
        homePage = new HomePage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        homePage.pressElement();
        radioButtonPage.navigateRadioBtnView();
    }

    @Test
    public void verifyYesRadioButtonSelection() {
        radioButtonPage.clickYes();
        Assert.assertTrue(radioButtonPage.isYesSelected(), "Yes radio button should be selected");
        Assert.assertFalse(radioButtonPage.isImpressiveSelected(), "Impressive radio button should not be selected");
        Assert.assertFalse(radioButtonPage.isNoSelected(), "No radio button should not be selected");
    }

    @Test
    public void verifyImpressiveRadioButtonSelection() {
        radioButtonPage.clickImpressive();
        Assert.assertTrue(radioButtonPage.isImpressiveSelected(), "Impressive radio button should be selected");
        Assert.assertFalse(radioButtonPage.isYesSelected(), "Yes radio button should not be selected");
        Assert.assertFalse(radioButtonPage.isNoSelected(), "No radio button should not be selected");
    }

    @Test
    public void verifyNoRadioButtonIsDisabled() {
        Assert.assertTrue(radioButtonPage.isNoDisabled(), "No radio button should be disabled");
    }
}