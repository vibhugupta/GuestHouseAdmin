package runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "steps",
        features = "src/test/feature/Login.feature")

public class CucumberRunner{
}
