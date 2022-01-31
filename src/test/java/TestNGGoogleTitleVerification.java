import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.WebDriverFactory;

import java.lang.annotation.Annotation;
import java.security.Key;

public class TestNGGoogleTitleVerification {

    WebDriver driver;

    @BeforeMethod
    public void webDriverDeclaration() throws InterruptedException {
        driver = WebDriverFactory.getDriver("Chrome");

        Thread.sleep(1000);
        driver.manage().window().maximize();
    }

    @Test
    public void googleWebSite() {

        driver.get("http://www.google.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle, "Google Title verification");
    }

    @Test
    public void appleSearch() {
        driver.get("http://www.google.com");

        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

        String expectedTitle = "cimbom";
        String realTitle = driver.getTitle();

        Assert.assertTrue(realTitle.contains(expectedTitle), "Apple Title");
    }
}
