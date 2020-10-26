package stepDefinitions;


import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;


public class StepDefinitions extends TestBase
{

    @Given("I navigate to {string}")
    public void i_navigate_to(String url) throws MalformedURLException {
      setUp();
      navigateToUrl(url);

    }

    @Then("I should see home page")
    public void i_should_see_home_page()
    {
         homePage.clickRegisterLink();
    }

    @When("I click on register link")
    public void i_click_on_register_link()
    {

    }

    @Then("I should be navigated to register page")
    public void i_should_be_navigated_to_register_page()
    {

    }
}
