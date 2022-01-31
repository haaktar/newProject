import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.WebDriverFactory;

import java.util.Set;

public class TabSwitchPractices {

    WebDriver driver;

    @Test
    public void handleWindows() {

        driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/windows");
        String firstPage = driver.getTitle();
        System.out.println("firstPage = " + firstPage);

        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();

        String mainHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current Title = " + driver.getTitle());

        }
        Assert.assertTrue(driver.getTitle().equals("New Window"));
        driver.close();


        driver.switchTo().window(mainHandle);
        System.out.println(driver.getTitle());
    }

    @Test
    public void moreWindows(){


    }

}
