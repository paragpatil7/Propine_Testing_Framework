 package pom.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DateParserHomePageLocators {

	
	@FindBy(how =How.NAME,using="date")
	public WebElement TextBox_Search;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div[1]/form/input")
	public WebElement Button_SearchTxt;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div[2]/div")
	public WebElement TextArea_getmessage;
	
	
}
