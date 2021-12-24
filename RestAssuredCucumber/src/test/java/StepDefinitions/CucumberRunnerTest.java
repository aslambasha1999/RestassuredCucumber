package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
 
@CucumberOptions(features= {"src\\test\\java\\Features\\getmethods.feature"},
glue= {"StepDefinitions"},monochrome = true,tags= "@GetUserDetails")
public class CucumberRunnerTest {
 
}
