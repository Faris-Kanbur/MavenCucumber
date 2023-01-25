package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/java/Features/SFACcountCreate.feature",glue={"StepDefinitons"},
plugin= {"html:target/cucumber.html"})
public class TestRunner {

}
