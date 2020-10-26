package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObjects.HomePage;



import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class TestBase
{
    public static WebDriver driver;
    public static Properties prop;
    public static HomePage homePage;

    public static final String USERNAME = "nihan7";
    public static final String AUTOMATE_KEY = "gLpmZSCQtB4P9yxXERnp";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

   @BeforeAll
    public static void setUp() throws MalformedURLException
    {
        try{
            prop = new Properties();
            FileInputStream fs = new FileInputStream("./src/main/java/config/data.properties");

            prop.load(fs);
        }
        catch(Exception e){
             e.printStackTrace();
        }

       /* WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        */
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "latest-beta");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.5.2");
        driver = new RemoteWebDriver(new URL(URL), caps);

        homePage = new HomePage(driver);

    }

    @AfterAll
    public static void tearDown()
    {
        driver.quit();
    }


    public void navigateToUrl(String url)
    {
        driver.navigate().to(url);
    }

    public void pageRefresh()
    {
        driver.navigate().refresh();
    }
}
