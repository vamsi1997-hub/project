package com.qt.driverinit;

import com.qt.propertyfile.ProjectConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverInit {
   public WebDriver driver;

   public WebDriver getCurrentDriver(){
       return driver;
   }

    public void launchApplication() {
        try {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
            String brower = ProjectConfig.getPropertyValue("browser");
            if (brower.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
            } else if (brower.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            } else if (brower.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }
            driver.manage().window().maximize();
            driver.get(ProjectConfig.getPropertyValue("url"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
