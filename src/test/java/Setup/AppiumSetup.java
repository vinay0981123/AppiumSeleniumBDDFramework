package Setup;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.HttpClient;

import java.net.MalformedURLException;
import java.net.URL;
class InvalidUrlException extends RuntimeException {
    public InvalidUrlException(String message) {
        super(message);
    }
}
public class AppiumSetup {
    private static boolean isValidUrl(String url) {
        try {
            new URL(url).toURI();
            return true;
        } catch (MalformedURLException | java.net.URISyntaxException e) {
            return false;
        }
    }
    public static URL getRemoteGridURL() {
        String gridUrl = "http://127.0.0.1:4723/wd/hub";

        if (isValidUrl(gridUrl)) {
            try {
                return (new URL(gridUrl));
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new InvalidUrlException("Invalid URL: " + gridUrl);
        }
    }

    public static AndroidDriver launchApp() {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("app", "F:\\AppiumFramework\\src\\test\\resources\\DataFiles&App\\com.arttavo-3.apk");
        dc.setCapability("ignoreHiddenApiPolicyError", true);
        dc.setCapability("noReset", true);
        return new AndroidDriver(getRemoteGridURL(), dc);
    }

}


