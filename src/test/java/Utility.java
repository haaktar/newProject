import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {

    private static Properties properties = new Properties();


    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

            System.out.println("Properties File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyWord) {

        return properties.getProperty(keyWord);
    }

}

