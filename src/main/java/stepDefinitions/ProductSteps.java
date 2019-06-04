package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

public class ProductSteps extends DriverFactory {

    @Given("^User navigates to \"([^\"]*)\" website$")
    public void user_navigates_to_website(String url){
        driver.get(url);
    }

    @When("^User click on \"([^\"]*)\"$")
    public void user_click_on(String button){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector(button)));
        driver.findElement(By.cssSelector(button)).click();
    }

    @Then("^User should be presented with a promo alert$")
    public void user_should_be_presented_with_a_promo_alert() throws  Exception{
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        ;
    }
}
