package pom.actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumDriver;
import utils.SeleniumHelper;
import pom.locators.*;

public class DateParserHomePageActions {

	
	DateParserHomePageLocators DateParserHomePageLocators=null;
	public WebDriver driver=SeleniumDriver.getDriver();
	
	public DateParserHomePageActions()
	{
		this.DateParserHomePageLocators=new DateParserHomePageLocators();
		PageFactory.initElements(driver, DateParserHomePageLocators);
	}
	
	
	public void search_text(String SearchText)
	{
		boolean elepresent=SeleniumHelper.IsElementPresent(DateParserHomePageLocators.TextBox_Search);
		if(elepresent)
		{
			System.out.println("Page Open Successfully");
			DateParserHomePageLocators.TextBox_Search.sendKeys(SearchText);
		}
		else
		{
			System.out.println("Element not found");
		}
		
	}
	public void Enter_date(String SearchText)
	{
		DateParserHomePageLocators.TextBox_Search.sendKeys(SearchText);
	}
	
	public void submit_search()
	{
		DateParserHomePageLocators.Button_SearchTxt.click();
	}
	
	public void Check_Validation_Message(String message)
	{
		String pageDate=DateParserHomePageLocators.TextArea_getmessage.getText();
		System.out.println("Page Date"+pageDate);
		System.out.println("validation Date"+message);
		if (pageDate.contains(message))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
	}
	
	
	public void check_we_are_on_Parser_Page()
	{
		boolean elepresent=SeleniumHelper.IsElementPresent(DateParserHomePageLocators.TextBox_Search);
		if(elepresent)
		{
			System.out.println("Page Open Successfully");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Element not found");
			Assert.assertTrue(false);
		}
		
	}

	
}
