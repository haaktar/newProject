import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.WebDriverFactory;


public class DropDown {

    WebDriver driver;

    @BeforeMethod

    public void setDriver() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void simpleDropdownMethod() {

        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
        String actualSimpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        String expectedSimpleDropdown = "Please select an option";

        Assert.assertEquals(actualSimpleDropdown, expectedSimpleDropdown, "Simple Dropdown");

        Select stateSelection = new Select(driver.findElement(By.id("state")));
        String actualStateSelection = stateSelection.getFirstSelectedOption().getText();
        String expectedStateSelection = "Select a State";

        Assert.assertEquals(actualStateSelection, expectedStateSelection, "State Selection");


    }

    @Test
    public void selectStateMethod() {

        Select selectState = new Select(driver.findElement(By.id("state")));
        selectState.selectByVisibleText("Illinois");
        selectState.selectByVisibleText("Virginia");
        selectState.selectByVisibleText("California");
    }

    @Test
    public void date() {
        Select year = new Select(driver.findElement(By.id("year")));
        Select month = new Select(driver.findElement(By.id("month")));
        Select day = new Select(driver.findElement(By.id("day")));

        year.selectByValue("1923");
        month.selectByIndex(11);
        day.selectByVisibleText("31");

        String actualYear = year.getFirstSelectedOption().getText();
        String actualMonth = month.getFirstSelectedOption().getText();
        String actualDay = day.getFirstSelectedOption().getText();

        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "31";

        Assert.assertEquals(actualYear, expectedYear, "year");
        Assert.assertEquals(expectedMonth, actualMonth, "Month");
        Assert.assertEquals(expectedDay, actualDay, "Day");

        driver.findElement(By.id("dropdownMenuLink")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a[4]")).click();



    }

    public void regularDropdown() {


    }


}




