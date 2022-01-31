import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.WebDriverFactory;

public class ZeroBank {
    public static void main(String[] args) {
        //  WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://zero.webappsecurity.com/");
        driver.findElement(By.id("signin_button")).click();
        String signInText = "Zero Bank";
        String actualSignInText = driver.findElement(By.className("brand")).getText();

        if (actualSignInText.equals(signInText)) {
            System.out.println("Correct Sing In Text");
        } else {
            System.out.println("NOT Correct Sing In Text");

        }

        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.id("user_remember_me")).click();
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();

        System.out.println(actualSignInText);
        System.out.println(signInText);
    }
}
