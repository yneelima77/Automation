package com.AmazonDataDriven;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import jxl.read.biff.BiffException;
import pageFactory.FBLoginPage;

@FixMethodOrder(MethodSorters.DEFAULT)
public class FBLoginjunit {
	WebDriver driver;
	@BeforeClass
	public static void beforeclass(){
		System.out.println("before class");
	}

	@Before
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void InValidCredentials() throws BiffException, IOException {
		FBLoginPage login = PageFactory.initElements(driver, FBLoginPage.class);
		login.EnterUserDeatils();
	}

	@Test
	public void Test2() throws BiffException, IOException {
		FBLoginPage login = PageFactory.initElements(driver, FBLoginPage.class);
		login.EnterUserDeatils();
		login.verifingText();

	}

	@After
	public void after() {
		driver.quit();
	}

}
