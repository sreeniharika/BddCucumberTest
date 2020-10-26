import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AfterHooks
{
    public static WebDriver driver;
    @After
    public void tearDown(Scenario scenario)
    {
       // byte[] screenShotByte = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        //scenario.embed(screenShotByte,"image/png");
        scenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)
        ,"image/png","image");
        driver.quit();
    }
}
