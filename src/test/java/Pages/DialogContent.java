package Pages;

import Utilities.MyMethods;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends MyMethods {
    public DialogContent() {
        PageFactory.initElements(ParameterDriver.getDriver(), this);
    }

    @FindBy(css = "input[id='user-message']")
    public WebElement enterMessage;

    @FindBy(xpath = "//button[text()='Show Message']")
    public WebElement showMessage;

    @FindBy(css = "input[placeholder=\"Username\"]")
    public WebElement usernameInbox;

    @FindBy(css = "input[placeholder=\"Password\"]")
    public WebElement passwordInbox;

    @FindBy(xpath = "//span[normalize-space()='LOGIN']")
    public WebElement loginButton;

    @FindBy (xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Dashboard')]")
    public WebElement dashboardButton;

}
