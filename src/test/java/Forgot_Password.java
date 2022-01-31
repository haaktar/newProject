import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.WebDriverFactory;

public class Forgot_Password {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.findElement(By.name("email")).sendKeys("email@email.com");
        driver.findElement(By.id("form_submit")).click();

        if (driver.getCurrentUrl().contains("email_sent")) {
            System.out.println("Email verification Passed!");
        } else {
            System.out.println("Email verification DID NOT Passed!");

        }
        String textBox = "Your e-mail's been sent!";

        String actualTextBoxContent = driver.findElement(By.name("confirmation_message")).getText();
        if (actualTextBoxContent.equals(textBox)) {

            System.out.println("Text Box Content Passed!!");
        } else {
            System.out.println("Text Box Content DID NOT Pass!!");


        }
    }
}
