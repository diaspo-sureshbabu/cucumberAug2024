package Cucumfeatures.testRunner;

import io.cucumber.junit.CucumberOptions;



@CucumberOptions (
        features = {"src/test/java/Cucumfeatures/Features/bookcartlogin.feature"},
        dryRun = true,
        glue = "steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class Runner   {


}
