package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass{
    public static WebDriver driver=null;

    public static WebDriver initialiseBrowser() {
        return driver = new SafariDriver();
    }
}
