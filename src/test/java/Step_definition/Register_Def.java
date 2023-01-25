package Step_definition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import PageObject.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

public class Register_Def {
	RegisterPage register=new RegisterPage();
	
	
	@Given("The user opens the Register page")
	public void the_user_opens_the_register_page() {
		Loggerload.info("The user opens Register page");
		register.navigatetoRegisterPage();
	}

	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String string) {

       Loggerload.info("The user do not enter any values");
       register.clickOnRegisterButton();
	}

	@Then("It display  an error message {string} .below user name text box")
	public void it_display_an_error_message_below_user_name_text_box(String expErrormsg) {
		Loggerload.info("error message is displayed" +register.getEmptyfieldErrormsgUser()+"error message in below Username textbox");
		assertTrue(register.getEmptyRequiredUser(),"Username field is empty-required attribute is validated");
		assertEquals(register.getEmptyfieldErrormsgUser(),expErrormsg);
	}

	@When("The user clicks {string} button after entering username with other fields empty")
	public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string,
			io.cucumber.datatable.DataTable dataTable) {
		Loggerload.info("The user enter valid username with other fields empty");
		register.entervalidUsername(dataTable);
	}

	@Then("It display an error message {string} .below password text box")
	public void it_display_an_error_message_below_password_text_box(String  expErrormsg) {
		Loggerload.info("Error message is displayed " + register.getEmptyfieldErrormsgCofmPswd()
		+ " an error below Password textbox");
   assertTrue(register.getEmptyRequiredPswd(), "Username Field is Empty - required attribute is validated");
    assertEquals(register.getEmptyfieldErrormsgPswd(), expErrormsg);
	}

	
	@When("The user enters a {string} with characters other than Letters, digits and {string}")
	public void the_user_enters_a_with_characters_other_than_letters_digits_and(String string, String string2,
			io.cucumber.datatable.DataTable dataTable) {
		register.entervalidUsername(dataTable);
		register.entervalidPassword(dataTable);
		register.entervalidConfmPassword(dataTable);
		register.clickOnRegisterButton();
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String expErrormsg) {
		Loggerload.info("Expected Error message is as : " + expErrormsg);
		Loggerload.info("Error message is displayed as : " + register.getErrormsg());
		assertEquals(register.getErrormsg(), expErrormsg);
	}

	// @TS_register_06
	@When("The user clicks {string} button after entering valid {string} and different passwords in {string} and {string} fields")
	public void the_user_clicks_button_after_entering_valid_and_different_passwords_in_and_fields(String string,
			String string2, String string3, String string4, io.cucumber.datatable.DataTable dataTable) {
		register.entervalidUsername(dataTable);
		register.entervalidPassword(dataTable);
		register.entervalidConfmPassword(dataTable);
		register.clickOnRegisterButton();
	}
	// @TS_register_07

	@When("The user enters a valid {string} and {string} with characters less than {int}")
	public void the_user_enters_a_valid_and_with_characters_less_than(String string, String string2, Integer int1,
			io.cucumber.datatable.DataTable dataTable) {
		register.entervalidUsername(dataTable);
		register.entervalidPassword(dataTable);
		register.entervalidConfmPassword(dataTable);
		register.clickOnRegisterButton();
	}
	// @TS_register_08

	@When("The user enters a valid {string} and {string} with only numbers")
	public void the_user_enters_a_valid_and_with_only_numbers(String string, String string2,
			io.cucumber.datatable.DataTable dataTable) {
		register.entervalidUsername(dataTable);
		register.entervalidPassword(dataTable);
		register.entervalidConfmPassword(dataTable);
		register.clickOnRegisterButton();
	}

	// @TS_register_09
	@When("The user enters a valid {string} and {string} similar to username")
	public void the_user_enters_a_valid_and_similar_to_username(String string, String string2,
			io.cucumber.datatable.DataTable dataTable) {
		register.entervalidUsername(dataTable);
		register.entervalidPassword(dataTable);
		register.entervalidConfmPassword(dataTable);
		register.clickOnRegisterButton();
	}

	// @TS_register_10
	@When("The user enters a valid {string} and commonly used password {string}")
	public void the_user_enters_a_valid_and_commonly_used_password(String string, String string2,
			io.cucumber.datatable.DataTable dataTable) {
		register.entervalidUsername(dataTable);
		register.entervalidPassword(dataTable);
		register.entervalidConfmPassword(dataTable);
		register.clickOnRegisterButton();
	}

	// @TS_register_11
	@When("The user enters a valid {string} and {string} and {string}")
	public void the_user_enters_a_valid_and_and(String string, String string2, String string3,
			io.cucumber.datatable.DataTable dataTable) {
		register.entervalidUsername(dataTable);
		register.entervalidPassword(dataTable);
		register.entervalidConfmPassword(dataTable);
		register.clickOnRegisterButton();
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
		Loggerload.info("User redirected to Homepage ");
		String Title = register.getPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "NumpyNinja", "Title do not match");
	}

	// @TS_register_12
	@When("The user enters a valid existing {string} with {string} and {string}")
	public void the_user_enters_a_valid_existing_with_and(String string, String string2, String string3,
			io.cucumber.datatable.DataTable dataTable) {
		register.entervalidUsername(dataTable);
		register.entervalidPassword(dataTable);
		register.entervalidConfmPassword(dataTable);
		register.clickOnRegisterButton();
	}
}