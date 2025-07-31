package Utilities;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Commenting...
@CucumberOptions(
        features = "src/test/java/datatable.feature",
        glue = "stepdefenitions",
        monochrome = true,
        dryRun = false
)

public class Runner extends AbstractTestNGCucumberTests  {

}
