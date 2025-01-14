package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/Features",
            glue={"StepDefinition","utilities"} ,
            tags= "@Test1 and not @Test2"
    )

    public class testRunner {

}

