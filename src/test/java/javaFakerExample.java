import com.github.javafaker.Faker;
import org.testng.annotations.Test;


public class javaFakerExample {

    @Test

    public void fakerMethod() {

        Faker faker = new Faker();

        String countries = faker.country().flag();

        System.out.println("countries = " + countries);

        String backToFuture = faker.backToTheFuture().character();

        System.out.println("backToFuture = " + backToFuture);
    }
}
