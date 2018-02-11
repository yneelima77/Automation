package com.AmazonDataDriven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import jxl.read.biff.BiffException;
import pageFactory.FBLoginPage;


public class FBLoginUsingPOM {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		FBLoginPage login = PageFactory.initElements(driver,FBLoginPage.class);
		
		login.EnterUserDeatils();
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
