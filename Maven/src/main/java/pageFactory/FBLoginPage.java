package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import jxl.read.biff.BiffException;
import reusable_Methods.Exceloutput;
import reusable_Methods.FbLoginInputs;;


public class FBLoginPage {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement UserName;
	
	@FindBy(id="pass")
	WebElement Password;
	

	@FindBy(id = "loginbutton")
	WebElement LoginButton;
	
	@FindBy(css="#login_link > div._wp9 > a")
	WebElement verifyText;
	
	public FBLoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void EnterUserDeatils() throws BiffException, IOException{
		
		FbLoginInputs inputs = new FbLoginInputs();
		
		Exceloutput[] outputs = inputs.Excel();
		
		for(int i = 0;i<outputs.length;i++){
			
			UserName.sendKeys(outputs[i].UserName);
			Password.sendKeys(outputs[i].Password);
			
			LoginButton.click();
		}
		
		
	}
	
	public void verifingText(){
		SoftAssert softassert = new SoftAssert();
		
		if(verifyText.isDisplayed()){
			softassert.assertTrue(true);
			System.out.println("pass");
		}else{
			softassert.fail("fail");
			System.out.println("Fail");
		}
	}
	
	
	
	
	

}
