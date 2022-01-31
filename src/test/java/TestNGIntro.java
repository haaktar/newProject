import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGIntro {
/*
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

 */

    @Test
    public void test1() {
        System.out.println("Test 1");

    }

    @Test
    public void test2() {
        System.out.println("Test 2");

    }

    @Test
    public void test3() {
        String str1 = "TestNG";
        String str2 = "TestNG";
        String str3 = "Java";
        Assert.assertTrue(str1.equals(str3), "Str1 and Str 2");
      //  Assert.assertEquals(str1, str3);

    }
}
