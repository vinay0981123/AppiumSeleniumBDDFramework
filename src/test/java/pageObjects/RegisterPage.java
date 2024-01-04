package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver ldriver;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Email Address\"]")
    WebElement email;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
    WebElement password;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Your Name\"]")
    WebElement yourName;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Mobile Number\"]")
    WebElement mobileNumber;
    @FindBy(xpath = "//android.view.ViewGroup[8]/android.view.ViewGroup/android.widget.ImageView")
    WebElement selectCountryDropdown;
    @FindBy(xpath = "//android.widget.TextView[@text=\"India\"]")
    WebElement selectIndia;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Search Country\"]")
    WebElement searchCountry;
    @FindBy(xpath = "(//android.widget.TextView[@text=\"Register\"])[2]")
    WebElement btnRegister;
    @FindBy(xpath = "(//android.view.ViewGroup[8]/android.view.ViewGroup[1]/android.widget.ImageView")
    WebElement ch_TermAndCondition;


    public RegisterPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver , this);
    }
    public boolean is_Email_Field_Visible(){
        return email.isDisplayed();
    }
    public boolean is_password_field_visible(){
        return password.isDisplayed();
    }
    public boolean is_your_name_field_visible(){
        return password.isDisplayed();
    }
    public boolean is_mobile_number_field_visible(){
        return password.isDisplayed();
    }
    public void cl_btnRegister(){
        btnRegister.click();
    }
    public void check_TermAndConditions(){
        ch_TermAndCondition.click();
    }
}
