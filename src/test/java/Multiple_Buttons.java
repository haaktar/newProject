import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.WebDriverFactory;

public class Multiple_Buttons {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // driver.findElement(new By.ByXPath("//*[@id=\"content\"]/div[1]/button[1]")).click();

        driver.findElement(By.xpath("http://practice.cybertekschool.com/multiple_buttons"));
    }
}
