package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TextBoxPage {
    private WebDriver driver;

    @FindBy(id = "item-0")
    private WebElement textBoxTab;

    @FindBy(id = "userName")
    private WebElement txtUsername;

    @FindBy(id = "userEmail")
    private WebElement txtUserEmail;

    @FindBy(id = "currentAddress")
    private WebElement txtCurrentAddress;

    @FindBy(id = "permanentAddress")
    private WebElement txtPermanentAddress;

    @FindBy(id = "submit")
    private WebElement btnSubmit;

    public TextBoxPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickTextBoxTab(){
        textBoxTab.click();
    }

    public void enterUsername(String username){
        txtUsername.sendKeys(username);
    }

    public void enterUserEmail(String userEmail){
        txtUserEmail.sendKeys(userEmail);
    }

    public void enterCurrentAddress(String currentAddress){
        txtCurrentAddress.sendKeys(currentAddress);
    }

    public void enterPermanentAddress(String permanentAddress){
        txtPermanentAddress.sendKeys(permanentAddress);
    }

    public void clickSubmit(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        btnSubmit.click();
    }
}
