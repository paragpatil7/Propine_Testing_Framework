package stepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

import pom.actions.*;
public class DateParser {

	public WebDriver driver=SeleniumDriver.getDriver();
	// SeleniumDriver obj=new SeleniumDriver();
	public WebElement element;
	
	DateParserHomePageActions DateParserHomePageActions=new DateParserHomePageActions();
	
	@Given("I am on Propine date parser page")
	public void open_dateParser_Page() throws InterruptedException
	{
		SeleniumHelper.waitForPageToLoad();
		DateParserHomePageActions.check_we_are_on_Parser_Page();			    
		
	}

	
	
	@When("^I Enter the \"([^\"]*)\" in text box and click Submit button$")
	public void i_Enter_the_in_text_box_and_click_Submit_button(String dateToEnter) throws Throwable {
	    
	   
		//DateParserHomePageActions.search_text(dateToEnter);
		DateParserHomePageActions.Enter_date(dateToEnter);
	    SeleniumHelper.waitForPageToLoad();
		DateParserHomePageActions.submit_search();
		
	    
	}

	@Then("^I should see a \"([^\"]*)\" on the form\\.$")
	public void i_should_see_a_on_the_form(String message) throws Throwable {
	    
		SeleniumHelper.waitForPageToLoad();
		DateParserHomePageActions.Check_Validation_Message(message);

		
	}




}
