package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.ParameterDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WEB_1 {
    LeftNavBar leftNavBar = new LeftNavBar();
    DialogContent dialogContent = new DialogContent();

    @Given("I am on the web page")
    public void iAmOnTheWebPage() {
        ParameterDriver.getDriver().get("https://demo.seleniumeasy.com/");
    }

    @And("I navigate to the SimpleFormDemo")
    public void iNavigateToTheSimpleFormDemo() {
        leftNavBar.clickMethod(leftNavBar.inputForms);
        leftNavBar.clickMethod(leftNavBar.simpleFormDemo);
    }

    @And("I enter the {string} to the Enter Message section")
    public void iEnterTheToTheEnterMessageSection(String text) {
        dialogContent.sendKeysMethod(dialogContent.enterMessage, text);
    }

    @When("I click to Show Message button")
    public void iClickToShowMessageButton() {
        dialogContent.clickMethod(dialogContent.showMessage);
    }

    @Then("I am able to see {string} at the Your Message section")
    public void iAmAbleToSeeAtTheYourMessageSection(String text) {
        WebElement inbox = ParameterDriver.getDriver().findElement(By.cssSelector("input[id='user-message']"));

        Assert.assertTrue(inbox.getAttribute("value").equals(text));
    }
}
