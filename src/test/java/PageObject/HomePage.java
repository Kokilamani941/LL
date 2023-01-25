package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.Loggerload;

public class HomePage {
	WebDriver driver=DriverFactory.getdriver(); 	
	String url=ConfigReader.getApllicationUrl();
	String homeurl=ConfigReader.getHomePage();   

	//url dsalgo
	@FindBy (xpath="//a[@href='/home']")WebElement getstart_link;
	@FindBy (xpath="//a[contains(text(),'Get Started')]")WebElement getstart;
	
	@FindBy (xpath="//*[@class='alert alert-primary']")WebElement alert_msg;

	//homepage
	@FindBy(xpath="//a[@href='data-structures-introduction']")WebElement datastructure_getstarted;
	@FindBy (xpath="//a[@href='array']")WebElement getstart_array;
    @FindBy(xpath="//a[@href='linked-list']")WebElement linkedlist_getstarted; 	
	@FindBy (xpath="//a[@href='stack']")WebElement getstart_stack;
    @FindBy(xpath="//a[@href='queue']")WebElement queue_getstarted;
    @FindBy(xpath="//a[@href='tree']")WebElement tree_getstarted;
    @FindBy(xpath="//a[@href='graph']")WebElement graph_getstarted;
    
    @FindBy(xpath="//a[@href='#']")WebElement dropdown;
    @FindBy (xpath="//div[@class='dropdown-menu show']")WebElement dropdown_array;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[2]")WebElement dropdown_linkedlist;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[3]")WebElement dropdown_stack;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[4]")WebElement dropdown_queue;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[5]")WebElement dropdown_tree;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[6]")WebElement dropdown_graph;
	
	//signin
	@FindBy (xpath="//a[href='/login']")WebElement signin;
		
	//register
	@FindBy (xpath="//a[href='/register']")WebElement register;
	
	
	public HomePage() {
		
		PageFactory.initElements(driver,this);
	}
   public void dsalgopage() {
	driver.get(url);
}
   
   public void getStarted_link(String str) {
	   getstart_link.click();
   }
   public String getPageTitle() {
	   String title=driver.getTitle();
	return title;
	   
   }
   public String alert() {

		String msg = alert_msg.getText();
		return msg;

	}
   public void homepage() {
	   driver.get(homeurl);
   }
   public void getStarted_home(String string) {
	   switch(string) {
	   
	   case "Datastructures" :
		   Loggerload.info("click"+datastructure_getstarted.getText()+"link on datastructures");
		   datastructure_getstarted.click();
		   break;
		   
	   case "Arrays" :
		   Loggerload.info("click"+getstart_array.getText()+"link on Arrays");
		   getstart_array.click();
		   break;
		   
	   case "Linkedlist" :
		   Loggerload.info("click"+linkedlist_getstarted.getText()+"link on linkedlist");
		   linkedlist_getstarted.click();
		   break;
	
	   case "Stack" :
		   Loggerload.info("click"+getstart_stack.getText()+"link on Stack");
		   getstart_stack.click();
		   break;
	   case "Queue" :
		   Loggerload.info("click"+queue_getstarted.getText()+"link on queue");
		   queue_getstarted.click();
		   break;	
	   case "tree" :
		   Loggerload.info("click"+tree_getstarted.getText()+"link on Tree");
		   tree_getstarted.click();
		   break;	
		   
	   case "graph" :
		   Loggerload.info("click"+graph_getstarted.getText()+"link on graph");
		   graph_getstarted.click();
		   break;		   
	   }
   }
  //dropdown
   public void dropdown(String string)
   {
	   dropdown.click();
	   
	   switch(string) {
	   
	   case "Arrays":
		   Loggerload.info("user click on " + string);
		   dropdown_array.click();
		   break;
	   case "Linkedlist":
		   Loggerload.info("user click on " + string);
		   dropdown_linkedlist.click();
		    break;   
	   case "stack":
		   Loggerload.info("user click on"+string);
		   dropdown_stack.click();   
		   break;
	   case "Queue":
		   Loggerload.info("user click on"+string);
		   dropdown_queue.click();
		   break;
	   case "Tree":
		   Loggerload.info("user click on"+string);
		   dropdown_tree.click();
		   break;
	   case "Graph":
		   Loggerload.info("user click on"+string);
		   dropdown_graph.click();
		   break;
	   }
   }
   //signin
   public void signin_link() {
	   signin.click();
   }
   
   public String login_page() {
	   String title=driver.getTitle();
	   return title;
   }
   
   public void register_link() {

		register.click();

	}

	public String register_page() {
		String title = driver.getTitle();
		return title;
	}
	
   
}