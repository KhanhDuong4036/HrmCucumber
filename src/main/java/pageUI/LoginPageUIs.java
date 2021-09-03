package pageUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageUIs {
    @FindBy(id = "foobar")
    public  WebElement foobar;
    public static final String EMAIL_TEXTBOX = "//input[@id='txtUsername']";
    public static final String PASSWORD_TEXTBOX = "//input[@id='txtPassword']";
    public static final String lOGIN_BUTTON = "//input[@id='btnLogin']";
}
