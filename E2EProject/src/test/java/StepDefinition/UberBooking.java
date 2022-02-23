package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBooking {

	@Given("Open uber application and land on booking page")
	public void open_uber_application_and_land_on_booking_page() {
		System.out.println("Booking page is opened");
	}

	@When("Booknow button is clicked cartype pop-up need to be displayed")
	public void booknow_button_is_clicked_cartype_pop_up_need_to_be_displayed() {
	    System.out.println("Book now button is click and cartype pop-up is opened");
	}

	@Then("Select cartype as {string} and click on book now button")
	public void select_cartype_as_and_click_on_book_now_button(String string) {
		System.out.println("Select the cartype as "+string+" and click on book now button");
	}
	
}
