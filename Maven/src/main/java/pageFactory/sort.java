package pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sort {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.name("field-keywords")).sendKeys("Apple");
		driver.findElement(By.xpath("//div[@id='nav-search']//input[contains(@value,'Go')]")).click();

		
		WebElement selectDropdown = driver.findElement(By.xpath("//select[@id='sort']"));
		//selectDropdown.click();

		Select ss = new Select(selectDropdown);

		List<WebElement> sortoptions = ss.getOptions();

		for (int i=0;i<sortoptions.size();i++) {
			sortoptions.get(i).click();
			
			if (sortoptions.get(i).getText().matches("Low to High")) {
				sortoptions.get(i).click();
				Thread.sleep(2000);
				System.out.println("clicked");
				break;
			}
		}

		/*
		 * for (int i = 0; i < sortoptions.size(); i++) { WebElement lowtohigh =
		 * sortoptions.get(i); System.out.println(lowtohigh); if
		 * (lowtohigh.getText() == "Low to High") { sortoptions.get(i).click();
		 * Thread.sleep(1000); break; } }
		 */
		driver.quit();
	}
}
