package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeScreenPage {

    WebDriver ldriver;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Login \"]")
    WebElement btnLogin;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Sign Up\"]")
    WebElement btnSignup;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Or Connect With\"]/parent::android.view.ViewGroup/android.view.ViewGroup[3]")
    WebElement googleicon;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Or Connect With\"]/parent::android.view.ViewGroup/android.view.ViewGroup[4]")
    WebElement instaicon;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Register Now\"]")
    WebElement lnkRegisterNow;
    public WelcomeScreenPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver , this);
    }
    public void cl_btnLogin(){
        btnLogin.click();
    }
    public void cl_btnSignup(){
        btnSignup.click();
    }
    public void cl_googleIcon(){
        googleicon.click();
    }
    public void cl_instaIcon(){
        instaicon.click();
    }

}
