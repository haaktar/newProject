import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.WebDriverFactory;

public class RadioButton {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.name("checkbox1"));

        if (checkBox1.isSelected()) {

            System.out.println("Check Box 1 is  Selected");
        } else {

            System.out.println("Check Box 1 is NOT Selected");
        }

        WebElement checkBox2 = driver.findElement(By.id("box2"));

        if (checkBox2.isSelected()) {

            System.out.println("Check Box 2 is  Selected");

        } else {
            System.out.println("Check Box 2 is NOT Selected");

        }

        checkBox1.click();

        checkBox2.click();

        if (checkBox1.isSelected()) {

            System.out.println("Check Box 1 is  Selected");
        } else {

            System.out.println("Check Box 1 is NOT Selected");
        }


        if (checkBox2.isSelected()) {

            System.out.println("Check Box 2 is  Selected");
        } else {

            System.out.println("Check Box 2 is NOT Selected");
        }

    }


}
