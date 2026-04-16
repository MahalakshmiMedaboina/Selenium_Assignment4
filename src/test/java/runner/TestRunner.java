package test.java.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "test/java/stepDefinitions",
    plugin = {"pretty"},
    monochrome = true,
    tags = "@smoke"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}