package selenium.utils;

import org.openqa.selenium.WebDriver;

import pageObjects.MenuPage;
import pageObjects.MyAccountPage;

public class BasePage extends SeleniumWrappers{

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public MenuPage menu = new MenuPage(driver);
	public MyAccountPage myAccPage = new MyAccountPage(driver);


	
	
	
	
}