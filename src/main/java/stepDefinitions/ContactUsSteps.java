package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.DriverFactory;
import java.util.List;


public class ContactUsSteps extends DriverFactory {

    @Given("^I access webdriveruniversity contact us form$")
    public void i_access_webdriveruniversity_contact_us_form() {
        driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");
    }

    @When("^I enter a valid firstname$")
    public void i_enter_a_valid_firstname() {
        driver.findElement(By.name("first_name")).sendKeys("El Edu");
    }

    @When("^I enter a valid lastname$")
    public void i_enter_a_valid_lastname(DataTable dataTable){
        List<List<String>> data = dataTable.raw();
        driver.findElement(By.name("last_name")).sendKeys(data.get(0).get(1));
    }

    @And("^I enter a vlid email address$")
    public void i_enter_a_vlid_email_address(){
        driver.findElement(By.name("email")).sendKeys("test@test.com");
    }

    @And("^I enter comments$")
    public void i_enter_comments(DataTable dataTable){
        List<List<String>> data = dataTable.raw();
        driver.findElement(By.name("message")).sendKeys(data.get(0).get(1));
    }

    @When("^I click on the submit button$")
    public void i_click_on_the_submit_button() throws Exception{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=“form_buttons”]/input[2]")).click();
    }

    @Then("^The information should successfylly be submitted via the contact us form$")
    public void the_information_should_successfylly_be_submitted_via_the_contact_us_form() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_reply\"]/h1")).getText(), "Thank You for your Message!");
    }
}
