package stepDefinitions;

import commons.GlobalConstants;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pageObject.LoginPO;
import pageObject.PageGenerator;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver;
    LoginPO loginPage;

    public LoginSteps() {
        driver = Hooks.openAndQuitBrowser();
    }

    @Given("^Open Hrm application$")
    public void openHrmApplication() {

    }

    @Given("^I input Admin username with \"([^\"]*)\"$")
    public void iInputAdminUsernameWith(String username)  {
        loginPage = PageGenerator.getLoginPage(driver);
        loginPage.inputToUsernameTextbox(username);
    }

    @And("^I input Admin password with \"([^\"]*)\"$")
    public void iInputAdminPasswordWith(String password)  {
        loginPage.inputToPasswordTextbox(password);
    }

    @When("^I click on Login button$")
    public void iClickOnLoginButton() {
        loginPage.clickToLoginButton();
    }
}
