package pageFactory;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPage {

	WebDriver driver;
	String Products;

	@FindBy(name = "field-keywords")
	WebElement searchbar;

	@FindBy(xpath = "//div[@id='nav-search']//input[contains(@value,'Go')]")
	WebElement SearchButton;

	@FindBy(xpath = "//span[@id='sort_by_text']")
	WebElement SortBy;
	
	@FindBy(xpath="//select[@id='sort']")
	WebElement selectDropdown;

	@FindBy(xpath = "//span[@class='sx-price-whole']")
	List<WebElement> price;


	public void webdriver(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Enter_ProductIn_SearchBar() {
		searchbar.click();
	}

	public void clickOnSearchButton() throws InterruptedException {
		SearchButton.click();
		Thread.sleep(1000);
	}

	public void validate_SearchResults() {
		/*WebDriverWait wait = new WebDriverWait(this.driver, 10);
		WebElement searchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='topRefinementsContainer']//div[1]")));*/
		String Result = SortBy.getText();
		String Actual = "Sort by ";
		Assert.assertEquals(Result, Actual);
		System.out.println("Pass");
	}

	public void ClickOn_SortByAnd_SelectOptions() throws InterruptedException {
		selectDropdown.click();
		Select ss = new Select(selectDropdown);
		List<WebElement> sortoptions = ss.getOptions();
		System.out.println(sortoptions);
		
		for (int i = 0; i < sortoptions.size(); i++) {
			WebElement lowtohigh = sortoptions.get(i);
			System.out.println(lowtohigh);
			if(lowtohigh.getText()=="Low to High"){
				sortoptions.get(i).click();
				Thread.sleep(1000);	
				break;
			}
		}

	}

	public void Validate_SortByResult() {
		boolean result = false;
	
		for (int i = 0; i < price.size() - 1; i++) {
			int price1 = Integer.parseInt(price.get(i).getText());
			int price2 = Integer.parseInt(price.get(i + 1).getText());
			if (price1 < price2) {
				result = true;

			} else {
				result = false;
				break;
			}
		}
		Assert.assertEquals(true, result);
	}
	
	

}
