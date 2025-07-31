package Utilities;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Cometing
@CucumberOptions(
        features = "src/test/java/datatable.feature",
        glue = "stepdefenitions",
        monochrome = true,
        dryRun = false
)

public class Runner extends AbstractTestNGCucumberTests  {

}
