package automation_Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Automation_Feature/Register User.feature", glue = "Automation_StepDefinition",
        monochrome = true, dryRun = false, publish = true)

public class runnerAuto {

    public static WebDriver driver;
    @BeforeClass

    public static void browser() {
        driver = new ChromeDriver();

    }




}
