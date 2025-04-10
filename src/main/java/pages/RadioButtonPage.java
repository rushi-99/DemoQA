package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {
    private WebDriver driver;

    @FindBy(id = "yesRadio")
    private WebElement radioBtnYes;

    @FindBy(xpath = "//label[@for='yesRadio']")
    private WebElement yesLabel;

    @FindBy(id = "impressiveRadio")
    private WebElement radioBtnImpressive;

    @FindBy(xpath = "//label[@for='impressiveRadio']")
    private WebElement impressiveLabel;

    @FindBy(id = "noRadio")
    private WebElement radioBtnNo;

    @FindBy(id = "item-2")
    private WebElement radioBtnTab;

    public RadioButtonPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickYes(){
        yesLabel.click();
    }

    public void clickImpressive(){
        impressiveLabel.click();
    }

    public boolean isYesSelected(){
        return radioBtnYes.isSelected();
    }

    public boolean isImpressiveSelected(){
        return radioBtnImpressive.isSelected();
    }

    public boolean isNoSelected(){
        return radioBtnNo.isSelected();
    }

    public boolean isNoDisabled() {
        return !radioBtnNo.isEnabled();
    }

    public void navigateRadioBtnView(){
        radioBtnTab.click();
    }
}