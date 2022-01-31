import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.WebDriverFactory;

public class AmazonCssPractice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone" + Keys.ENTER);
        // driver.findElement(By.id("nav-search-submit-button")).click();

        // WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));


    }


}
