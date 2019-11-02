package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookLoginPage {

    WebDriver driver;

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Using FindBy for locating elements
    @FindBy(name = "email")
    private WebElement emailData;

    @FindBy(name = "pass")
    private WebElement password;

    @FindBy(name = "login")
    private WebElement loign;


    // This method is to set Email in the email text box
    public void setEmail(String strEmail) {
        emailData.sendKeys(strEmail);
    }

    // This method is to set Password in the password text box
    public void setPassword(String strPassword) {
        password.sendKeys(strPassword);
    }

    // This method is to click on Next Button
    public void loginButtion() {
        loign.click();
    }
}
