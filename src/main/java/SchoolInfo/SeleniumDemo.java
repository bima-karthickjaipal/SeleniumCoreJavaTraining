package SchoolInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class SeleniumDemo {
    public static WebDriver driver= null;

    public static void main (String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "//Users//user//Downloads//chromedriver-mac-x64//chromedriver");
        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // driver.quit();

    }
}
