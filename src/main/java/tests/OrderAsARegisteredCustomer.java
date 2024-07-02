package tests;

import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import selenium.utils.BaseTest;

public class OrderAsARegisteredCustomer extends BaseTest{
	
	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");
	
	@Test
	public void orderTest() {
		
		app.click(app.menu.myAccountLink);
		app.myAccPage.loginInApp(USER, PASS);
		
	}
}
