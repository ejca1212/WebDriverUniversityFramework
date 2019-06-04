package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.DriverFactory;

public class ProductSteps extends DriverFactory {

    @Given("^User navigates to \"([^\"]*)\" website$")
    public void user_navigates_to_website(String url){
        driver.get(url);
    }

    @When("^User click on \"([^\"]*)\"$")
    public void user_click_on(String button) throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.id(button)).click();
    }

    @Then("^User should be presented with a promo alert$")
    public void user_should_be_presented_with_a_promo_alert() throws  InterruptedException{
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
    }
}
