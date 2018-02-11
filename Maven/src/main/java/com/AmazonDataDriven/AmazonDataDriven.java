package com.AmazonDataDriven;

import java.io.IOException;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class AmazonDataDriven {
	static String Filepath1 = "C:\\Users\\yneel\\Desktop\\Amazon_Data.xls";

	public static void main(String[] args)
			throws BiffException, IOException, InterruptedException, RowsExceededException, WriteException {

		

	}

	/*
	 * FileInputStream file = new FileInputStream(Filepath1);
	 * 
	 * Workbook book = Workbook.getWorkbook(file); Sheet sh =
	 * book.getSheet("Amazon_Data");
	 * 
	 * FileOutputStream fo = new
	 * FileOutputStream("C:\\Users\\yneel\\Desktop\\data.xls", true);
	 * WritableWorkbook wwb = Workbook.createWorkbook(fo); WritableSheet ws =
	 * wwb.createSheet("Amazon_Data2", 0);
	 * 
	 * int numofcol = sh.getColumns(); int numofrows = sh.getRows();
	 * 
	 * 
	 * int rowcnt = ws.getRows(); int colcnt = ws.getColumns();
	 * 
	 * 
	 * WebDriver driver = new ChromeDriver();
	 * driver.navigate().to("https://www.amazon.com/");
	 * 
	 * String[] result = "this is a test".split("\\s"); for (int x = 0; x <
	 * result.length; x++) System.out.println(result[x]);
	 * 
	 * StringTokenizer st = new StringTokenizer(Filepath1, "\\ "); while
	 * (st.hasMoreTokens()) { System.out.println(st.nextToken()); }
	 * 
	 * for (int i = 0; i < numofrows; i++) { for (int j = 0; j < numofcol; j++)
	 * { String values = sh.getCell(i, j).getContents(); WebElement searchbar =
	 * driver.findElement(By.name("field-keywords")); searchbar.clear();
	 * searchbar.sendKeys(values); searchbar.submit(); Thread.sleep(1000);
	 * 
	 * WebElement freeshiping = driver.findElement(By.className("a-text-bold"));
	 * Thread.sleep(2500);
	 * 
	 * if (freeshiping.isDisplayed()) {
	 * 
	 * } else {
	 * 
	 * }
	 * 
	 * } }
	 * 
	 * driver.quit();
	 * 
	 * }
	 */}

/*
 * * FileOutputStream fo = new
 * FileOutputStream("C:\\Users\\yneel\\Desktop\\data.xls", true);
 * WritableWorkbook wwb = Workbook.createWorkbook(fo); WritableSheet ws =
 * wwb.createSheet("Amazon_Data2", 0); Label l1 = new Label(0, 0, "Result");
 * ws.addCell(l1); Label l2 = new Label(1, 0, "pass"); ws.addCell(l2);
 * wwb.write(); wwb.close();
 */
