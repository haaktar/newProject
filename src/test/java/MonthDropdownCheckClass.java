import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import util.WebDriverFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.AbstractList;
import java.util.List;

public class MonthDropdownCheckClass {

    @Test

    public void monthDropdownCheckMethod() {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("http://practice.cybertekschool.com/dropdown");

        Select month = new Select(driver.findElement(By.id("month")));
        String dropdownMontText = month.getFirstSelectedOption().getText();

        //  System.out.println("realMontText = " + realMontText);

        String actualMonth = LocalDateTime.now().getMonth().name();
        System.out.println("actualMonth = " + actualMonth);
        Assert.assertEquals(actualMonth.toLowerCase(),dropdownMontText.toLowerCase());


    }
}
