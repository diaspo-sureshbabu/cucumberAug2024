package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =  {"src/test/resources/testdesign"},
        glue = {"Stepdefinitions"},
        tags = "@wiki_sc01"

)
public class Runner {

}
