package StepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

    @Given("^User is on net banking landing page$")
    public void user_is_on_net_banking_landing_page() throws Throwable {
    	System.out.println("This is net banking landing page");
    }

    @When("^User login with username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_login_with_username_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

    @Then("^Homepage need to be displayed$")
    public void homepage_need_to_be_displayed() throws Throwable {
    	System.out.println("Homepage is Displayed");
    }

    @And("^Make sure all the cards are displayed \"([^\"]*)\"$")
    public void make_sure_all_the_cards_are_displayed_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }

}