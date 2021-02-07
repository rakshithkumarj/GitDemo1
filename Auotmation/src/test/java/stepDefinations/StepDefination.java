package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {

	@Given("^User is on the Netbanking  landing page$")
	public void user_is_on_the_netbanking_landing_page() throws Throwable {
		System.out.println("User is on the Netbanking  landing page");
	}

	@When("^User loging into the application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_loging_into_the_application_with_something_and_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println("logged in with username and pw");
		System.out.println(strArg1);
		System.out.println(strArg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Home page is populated");
	}

	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.out.println(arg1);

	}

}
