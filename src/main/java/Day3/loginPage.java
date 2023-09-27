package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {
    WebDriver driver =null;
    WebDriverWait wait;

    @FindBy(xpath="//input[@id='login-username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='login-password']")
    WebElement password;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement submit_btn;

    @FindBy(xpath = "//div[@class='error-box round']")
    WebElement error_message;

    public loginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void setPassword(String pwd) {
        username.sendKeys(pwd);
    }

    public void setUsername(String uname) {
        password.sendKeys(uname);
    }

    public void clickSubmit()
    {
        submit_btn.click();
    }

    public boolean isErrorMessageDisplayed()
    {
        wait= new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOf(error_message)).isDisplayed();

    }
}
