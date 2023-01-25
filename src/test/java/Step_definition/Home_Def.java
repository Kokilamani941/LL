package Step_definition;

import static org.testng.Assert.assertEquals;

import PageObject.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

public class Home_Def {
	HomePage home=new HomePage();
	
	//ds algo page
	@Given("User open the dsalgo portal link")
	public void user_open_the_dsalgo_portal_link() {
	  Loggerload.info("User is launding the ds algo project");
	  home.dsalgopage();
	}

	@When("User clicks the {string} button")
	public void user_clicks_the_button(String string) {
		Loggerload.info("User clicks on the \"Getstarted link\" on main page");
		home.getStarted_link(string);
	   
	}

	@Then("User will be redirected to home page")
	public void user_will_be_redirected_to_home_page() {
		String Title = home.getPageTitle();
		Loggerload.info("Title of current page is ***** " + Title + " ****");
		assertEquals(Title, "NumpyNinja", "Title do not match");


	}

	@Given("User in the home page")
	public void user_in_the_home_page() {
		Loggerload.info("The user is on the home page");
		home.homepage();
	   
	}

	@When("User clicks on dropdown {string}")
	public void user_clicks_on_dropdown(String string) {
		Loggerload.info("The user is on the \"dropdown\" home page");
		home.getStarted_home(string);


	}
	 
	@Then("User to get Warning message {string}")
	public void user_to_get_warning_message(String string) {
		String alert = home.alert();
		Loggerload.info("Actual Message : " + alert);
		assertEquals(alert, string, "Title do not match");
	}


	@When("The user clicks on dropdown {string}")
	public void the_user_clicks_on_dropdown(String string) {
		
		Loggerload.info("User clicks on dropdown without login");
		home.dropdown(string);
	}

	@Then("User get a warning message {string}")
	public void user_get_a_warning_message(String string) {

	}

	@When("User clicks the sign in link")
	public void user_clicks_the_sign_in_link() {
		Loggerload.info("User clicks on Sign in ");
		home.signin_link();
	    
	}

	@Then("User goes to the Login page")
	public void user_goes_to_the_login_page() {

		Loggerload.info("User redirected to login page ");
		String Title = home.login_page();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Login", "Title do not match");

	}

	@When("User clicks the register link")
	public void user_clicks_the_register_link() {
		Loggerload.info("User cliks on registration");
		home.register_link();
	  
	}

	@Then("The user redirected to Registration page")
	public void the_user_redirected_to_registration_page() {
		Loggerload.info("User redirected to Registraion page ");
		String Title = home.register_page();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Registration", "Title do not match");
	}



}
