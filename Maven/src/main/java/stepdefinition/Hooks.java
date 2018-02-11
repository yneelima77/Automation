package stepdefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;

public class Hooks {

    WebDriver driver;
	
	@After
	public void CloseBrowser(){
		System.out.println("After each scenario");
	}
}
