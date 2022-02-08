package de.quandoo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/de.quandoo",
        plugin = {"json:target/cucumber-report.json", "pretty"},
        glue = "de.quandoo",
        tags = "@regression and @smoke"
)

public class RunTests {
}
