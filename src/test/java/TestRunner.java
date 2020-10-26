import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/java/features/Register.feature"},
        glue = {"stepDefinitions" },
        plugin = {"pretty","html:target/report.html"}
)


@RunWith(Cucumber.class)
public class TestRunner
{

}







