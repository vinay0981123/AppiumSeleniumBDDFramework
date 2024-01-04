package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Email Address\"]")
    WebElement email;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
    WebElement password;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Login\"]")
    WebElement btnlogin;
    public LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver , this);
    }
    public boolean is_Email_Field_Visible(){
        return email.isDisplayed();
    }
    public boolean is_password_field_visible(){
        return password.isDisplayed();
    }
    public void cl_btnLogin(){
        btnlogin.click();
    }

}
