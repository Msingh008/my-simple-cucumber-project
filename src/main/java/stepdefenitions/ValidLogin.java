package stepdefenitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class ValidLogin {
   static WebDriver driver=null;
    @Given("user is on login page.")
    public void user_is_on_login_page() {
       driver=new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @When("user enters {string} as userID.")
    public void user_enters_as_user_id(String userID) {
    driver.findElement(By.name("username")).sendKeys(userID);
    }
    @When("{string} as password.")
    public void as_password(String password) {
        driver.findElement(By.name("password")).sendKeys(password);

    }
    @When("clicks on login Button.")
    public void clicks_on_login_button() {
driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
    @Then("user should be navigated to homepage.")
    public void user_should_be_navigated_to_homepage() {
        String homePageText = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
        Assert.assertEquals(homePageText,"Dashboard");
    }

}
