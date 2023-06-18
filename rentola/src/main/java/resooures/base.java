package resooures;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class base {
    WebDriver driver;

    public WebDriver intallizeDriver() throws IOException {
        Properties prop = new Properties();
        String propPath = System.getProperty("user.dir") + "\\src\\main\\java\\resooures\\data.properties";
        FileInputStream fis = new FileInputStream(propPath);
        prop.load(fis);
        String browsername = prop.getProperty("browser");
        if (browsername.equalsIgnoreCase("ChromeDriver")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("firefox")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }
}
