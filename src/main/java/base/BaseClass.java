package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.TestUtilClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class BaseClass {
     public static WebDriver driver;
     public static Properties prop;
    //constructor
     public BaseClass(){
            try {
                prop = new Properties();
                FileInputStream ip = new FileInputStream("C:\\Users\\Mughda Bansal\\IdeaProjects\\Framework Designing\\src\\main\\java\\config\\config.properties");
                prop.load(ip);
            }
            catch (IOException e ){
                e.printStackTrace();
            }
    }
    public static  void initialization(){
         driver  = new EdgeDriver();
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtilClass.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtilClass.IMPLICIT_WAIT));

        driver.get(prop.getProperty("url"));
    }
}
