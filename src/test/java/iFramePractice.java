import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.WebDriverFactory;

public class iFramePractice {

    WebDriver driver;

    @BeforeMethod
    public void setDriver() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/iframe");


    }

    @Test
    public void findIFrame() {
        //driver.switchTo().frame("mce_0_ifr");
        //driver.switchTo().frame(0);
        WebElement iframe = driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));
        driver.switchTo().frame(iframe);

        driver.switchTo().defaultContent();
        //driver.switchTo().parentFrame();


    }
}
