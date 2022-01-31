import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.WebDriverFactory;

public class SmartBearSoftware {
    WebDriver driver;

    @Test
    public void smartBearSoftwareMethod() throws InterruptedException {

        driver = WebDriverFactory.getDriver("Chrome");
        Faker faker = new Faker();


        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        driver.findElement(By.name("ctl00$MainContent$orderGrid$ctl02$OrderSelector")).click();

        String expectedOrderDate = "01/05/2010";
        WebElement actualOrderDate = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[5]"));
        Assert.assertEquals(expectedOrderDate, actualOrderDate.getText(), "Order Date");

        WebElement orderButton = driver.findElement(By.xpath("//a[.='Order']"));
        orderButton.click();

        Select productDropdown = new Select(driver.findElement(By.name("ctl00$MainContent$fmwOrder$ddlProduct")));
        productDropdown.selectByVisibleText("ScreenSaver");

        WebElement quantityOption = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));
        quantityOption.sendKeys(Keys.BACK_SPACE);
        quantityOption.sendKeys("2");

        WebElement calculateButton = driver.findElement(By.className("btn_dark"));
        calculateButton.click();


        WebElement name = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName"));
        name.sendKeys(faker.name().fullName());

        WebElement address = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2"));
        address.sendKeys(faker.address().streetAddress());

        WebElement city = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3"));
        city.sendKeys(faker.address().city());

        WebElement state = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4"));
        state.sendKeys(faker.address().state());

        WebElement zip = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5"));
        zip.sendKeys(faker.address().zipCode().substring(0, 4));

        WebElement visa = driver.findElement(By.name("ctl00$MainContent$fmwOrder$cardList"));
        visa.click();

        WebElement creditCardNumber = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6"));
        creditCardNumber.sendKeys(faker.finance().creditCard().replaceAll("-", ""));

        WebElement expirationDate = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1"));
        expirationDate.sendKeys("12/25");

        WebElement processButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processButton.click();

        WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/div/strong"));
        String actualSuccessMessage = successMessage.getText();
        String expectedSuccessMessage = "New order has been successfully added.";

        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage, "New order has been successfully added.");


    }
}
