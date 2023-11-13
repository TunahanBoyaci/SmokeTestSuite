package Pages;

import Utilities.MyMethods;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavBar extends MyMethods {
    public LeftNavBar(){
        PageFactory.initElements(ParameterDriver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Input Forms']")
    public WebElement inputForms;

    @FindBy(xpath = "(//a[text()='Simple Form Demo'])[2]")
    public WebElement simpleFormDemo;


}
