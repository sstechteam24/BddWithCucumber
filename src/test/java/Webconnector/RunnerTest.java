package Webconnector;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/MyApplication.feature", glue= {"StepDef"})
public class RunnerTest {

}
