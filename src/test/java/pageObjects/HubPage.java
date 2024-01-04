package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubPage {
    WebDriver ldriver;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Ok\"]")
    WebElement txtOK;
    @FindBy(xpath = "((//android.widget.FrameLayout)[5]//(android.view.ViewGroup))[9]")
    WebElement hamburgerMenu;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Logout\"]")
    WebElement btnLogout;
    public HubPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver , this);
    }
}
