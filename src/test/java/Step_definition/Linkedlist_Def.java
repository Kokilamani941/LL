package Step_definition;

import static org.testng.Assert.assertEquals;

import PageObject.LinkedlistPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Loggerload;

public class Linkedlist_Def {
	LinkedlistPage ll=new LinkedlistPage();
	String Excelpath = ConfigReader.getexcelfilepath();
	static String expectedMsg;
	

	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String string) {
	
	}

	@When("The user is selecting the linked list item from the drop down")
	public void the_user_is_selecting_the_linked_list_item_from_the_drop_down() {
		Loggerload.info("The user select Linked List from the drop down menu");
		ll.dropdown_LinkedList();
	}

	@Then("The user is redirected into {string} page")
	public void the_user_is_redirected_into_page(String string) {
		Loggerload.info("User redirected to linked list data structure Page ");
		String Title = ll.getLinkedListPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		
	}


	@When("The user clicks the introduction link")
	public void the_user_clicks_the_introduction_link() {
		ll.click_introduction();
	}



	@When("The user clicks the {string} button on the {string} page")
	public void the_user_clicks_the_button_on_the_page(String string, String string2) {
		
	}

	@Then("The user redirected into tryEditor page with run button to test")
	public void the_user_redirected_into_try_editor_page_with_run_button_to_test() {
		Loggerload.info("User redirected to a page having an tryEditor with a Run button to test");
		String Title = ll.getLinkedListPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}

	@Given("The user is in the try here page to run the python code in tryEditor")
	public void the_user_is_in_the_try_here_page_to_run_the_python_code_in_try_editor() {
		Loggerload.info("The user is in a page having an tryEditor with a Run button to test");
		ll.navigateTotryEditor();
		String Title = ll.getLinkedListPageTitle();
		Loggerload.info("Title of current page is :" + Title);
	}

	@When("user clicks the run button")
	public void user_clicks_the_run_button() {
		ll.clickOnRunButton();
	}

	@Then("The user redirected into creating linked list page")
	public void the_user_redirected_into_creating_linked_list_page() {
		ll.click_creatingLinkedList();
	}

	@When("The user clicks {string} button in the {string} page")
	public void the_user_clicks_button_in_the_page(String string, String string2) {
		ll.click_typesOflLinkedList();
	}

	@When("The user clicks the Implement Linked List in Python button")
	public void the_user_clicks_the_implement_linked_list_in_python_button() {
		ll.click_implementlinkedListInPython();
	}

	@Then("The user should be directed to {string} of Linked List Page")
	public void the_user_should_be_directed_to_of_linked_list_page(String string) {
		ll.click_typesOflLinkedList();
	}

	@When("The user clicks the Traversal button")
	public void the_user_clicks_the_traversal_button() {
		ll.click_traversal();
	}

	@When("The user clicks the Insertion button")
	public void the_user_clicks_the_insertion_button() {
		ll.click_insertion();
	}

	@When("The user clicks the Deletion button")
	public void the_user_clicks_the_deletion_button() {
		ll.click_deletion();
	}



	@When("The user clicks on the Practice Questions")
	public void the_user_clicks_on_the_practice_questions() {
		ll.click_practiceQuestion();
	}

	@Then("The user should be directed to Practice Questions of Linked List Page")
	public void the_user_should_be_directed_to_practice_questions_of_linked_list_page() {
		String Title = ll.getLinkedListPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Practice Questions", "Title do not match");
		Loggerload.info("NO questions found ");
	}

}
