package stepDefination;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) // optional
public class StepDefinition {

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("Navigated to login url");
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
		System.out.println("logged in success");
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Navigated to home page");
	}

	@And("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {
		System.out.println("Cards are displayed");
	}
	
	 @And("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg1) throws Throwable {
	        System.out.println(strArg1);
	    }

	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println("User logged in with name "+strArg1);
	}

	@And("^Cards are not displayed$")
	public void cards_are_not_displayed() throws Throwable {
		System.out.println("Cards are not displayed");
	}
	
	 @When("^User sign up with following details$")
	    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
		 List<String> asList = data.asList();
		 for (String string : asList) {
			System.out.println(string);
		}
	    }
	 
	 @When("^User login in to application with (.+) and password (.+)$")
	    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
	       System.out.println("USERNAME: "+username+"Password: "+password);
	    }

	 @And("^Cards display are (.+)$")
	    public void cards_displayed_are(String status) throws Throwable {
	       System.out.println("STATUS: -"+status);
	    }
	 @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
	        System.out.println("Browser validation");
	    }

	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	        System.out.println("Browser triggered");
	    }

	    @Then("^check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	        System.out.println("Browser is started");
	    }

}
