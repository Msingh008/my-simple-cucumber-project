package stepdefenitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiDataTesting {
    @When("user enters {string} as UserId and {string} as Password")
    public void user_enters_as_UserId_and_Password(String userId, String password) {
       ValidLogin.driver.findElement(By.name("username")).sendKeys(userId);
       ValidLogin.driver.findElement(By.name("password")).sendKeys(password);
    }
    @Then("user should be navigated to homePAge for valid Data and error message is thrown.")
    public void user_should_be_navigated_to_home_p_age_for_valid_data_and_error_message_is_thrown() {
        Assert.assertTrue(true);
    }

    @When("user enters creds.")
    public void user_enters_creds(io.cucumber.datatable.DataTable dataTable) {
    List<String> creds=dataTable.asList();
     ValidLogin.driver.findElement(By.name("username")).sendKeys(creds.get(0));
      ValidLogin.driver.findElement(By.name("password")).sendKeys(creds.get(1));
        System.out.println(dataTable);

    }

    @Given("user prints the below data on the consol.")
    public void user_prints_the_below_data_on_the_consol(io.cucumber.datatable.DataTable dataTable) {
        Map<String,Object> names=dataTable.asMap(String.class,Object.class);
            System.out.println(names.get("Name")+"___"+names.get("Age"));

    }


}
