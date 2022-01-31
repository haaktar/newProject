import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.WebDriverFactory;

public class AlertPractices {

    WebDriver driver;

    @BeforeMethod
    public void setDriver() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void alertPractice() throws InterruptedException {
        WebElement jsAlert = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[1]"));
        jsAlert.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        WebElement message = driver.findElement(By.id("result"));
        String expectedMessage = "You successfuly clicked an alert";
        Assert.assertEquals(message.getText(), expectedMessage, "You successfuly clicked an alert");

        WebElement jsConfirm = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[2]"));
        jsConfirm.click();
        alert.accept();

        WebElement massageTwo = driver.findElement(By.xpath("//*[@id=\"result\"]"));
        String expectedMessageTwo = "You clicked: Ok";

        Assert.assertEquals(massageTwo.getText(), expectedMessageTwo, "You clicked: Ok");

    }
}
