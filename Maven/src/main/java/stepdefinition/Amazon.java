package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.AmazonPage;

public class Amazon {

	WebDriver driver = new ChromeDriver();

	AmazonPage page = PageFactory.initElements(driver, AmazonPage.class);

	@Given("^user is on Amazon search page$")
	public void user_is_on_Amazon_search_page() throws Throwable {
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

	}

	@When("^user enters \"(.*)\" in search bar$")
	public void user_enters_in_search_bar(String products) throws Throwable {
		driver.findElement(By.name("field-keywords")).sendKeys(products);
		
	}

	@When("^user clicks on the search button$")
	public void user_clicks_on_the_search_button() throws Throwable {
		page.clickOnSearchButton();

	}

	@Then("^user validates the search result$")
	public void user_validates_the_search_result() throws Throwable {
		page.validate_SearchResults();

	}
	
	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
	    driver.quit();
	  
	}

	@When("^user selects Price:Low to High from sort Dropdown$")
	public void user_selects_Price_Low_to_High_from_sort_Dropdown() throws Throwable {
		driver.findElement(By.name("field-keywords")).sendKeys("dell");
		page.clickOnSearchButton();
		Thread.sleep(1000);
		page.ClickOn_SortByAnd_SelectOptions();

	}

	@Then("^user validates the sortBy functionality results by checking the products price order$")
	public void user_validates_the_sortBy_functionality_results_by_checking_the_products_price_order()
			throws Throwable {
		page.Validate_SortByResult();

	}

}
