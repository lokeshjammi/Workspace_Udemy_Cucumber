package StepDefinition;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;

public class StepDefinition extends base{

	WebDriver driver;
	LoginPage lp;
	
	@Before
	public void beforeScenario() {
		System.out.println("This will run before every scenario");
	}
	
	@After
	public void afterScenario() {
		System.out.println("This will run after every scenario");
	}
	
	@Given("^Initialize drive with chrome browser$")
	public void initialize_drive_with_chrome_browser() throws Throwable {
		driver = initializeDriver();
	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.get(strArg1);
	}

	@And("^Click on Login link in homepage to land on secure sign in page$")
	public void click_on_login_link_in_homepage_to_land_on_secure_sign_in_page() throws Throwable {
		LandingPage l=new LandingPage(driver);
		lp=l.getLogin();
	}
	
	@When("^User enters (.+) and (.+) and login$")
    public void user_enters_and_and_login(String Username, String Password) throws Throwable {
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();
    }

    @Then("^Verify the user is successfully login$")
    public void verify_the_user_is_successfully_login() throws Throwable {
    	PortalHomePage p = new PortalHomePage(driver);
    	Assert.assertTrue(p.getSearchText().isDisplayed());
    }
    
    @And("^Close the browser$")
    public void close_the_browser() throws Throwable {
    	driver.quit();
    }

}
