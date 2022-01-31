import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.WebDriverFactory;

public class CybertekForgotPassword {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");


        WebElement homeLink = driver.findElement(By.xpath("/html/body/nav/ul/li/a\""));

        WebElement forgotPassword = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2"));

        WebElement emailText = driver.findElement(By.xpath("//*[@id=\"forgot_password\"]/div/div/label"));

        WebElement emailInputBox = driver.findElement(By.name("email"));

        WebElement retrievePasswordButton = driver.findElement(By.className("icon-2x icon-signin"));

        WebElement poweredByCybertek = driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div/a"));

        if (homeLink.isDisplayed() && forgotPassword.isDisplayed() && emailText.isDisplayed() && emailInputBox.isDisplayed() &&
                retrievePasswordButton.isDisplayed() && poweredByCybertek.isDisplayed()) {

            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }
}
