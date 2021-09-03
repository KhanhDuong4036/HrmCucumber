package pageObject;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.LoginPageUIs;

public class LoginPO extends BasePage {
    WebDriver driver;

    public LoginPO(WebDriver driver) {
        this.driver = driver;

    }

    public void inputToUsernameTextbox(String username) {
        waitForElementVisible(driver, LoginPageUIs.EMAIL_TEXTBOX);
        sendkeyToElement(driver, LoginPageUIs.EMAIL_TEXTBOX, username);
    }

    public void inputToPasswordTextbox(String password) {
        waitForElementVisible(driver, LoginPageUIs.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, LoginPageUIs.PASSWORD_TEXTBOX, password);
    }

    public void clickToLoginButton() {
        waitForElementClickable(driver,LoginPageUIs.lOGIN_BUTTON);
        clickToElement(driver,LoginPageUIs.lOGIN_BUTTON);
    }
}
