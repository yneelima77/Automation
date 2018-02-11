package excecises;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise_10_ValidationEachLinkinPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		int listSize = linksList.size();

		System.out.println("Total number of links : " + listSize);

		try {
			for (int i = 0; i < listSize; i++) {
				if (!(linksList.get(i).getText().isEmpty())) {
					linksList.get(i).click();
					driver.navigate().back();
					linksList = driver.findElements(By.tagName("a"));
				} else if (linksList.get(i).getText().isEmpty()) {
					System.out.println("failed links: " + linksList.get(i).getAttribute("href"));
				}

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			driver.quit();
		}
		driver.quit();

	}

}
