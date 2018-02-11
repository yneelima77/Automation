package reusable_Methods;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class FbLoginInputs {

	public Exceloutput[] Excel() throws BiffException, IOException {
		String path = "C:\\Users\\yneel\\Desktop\\FBLogin.xls";
		FileInputStream file = new FileInputStream(path);
		Workbook book = Workbook.getWorkbook(file);
		Sheet sh = book.getSheet("Sheet1");

		/*
		 * for (int k = 1; k < sh.getRows(); k++) { for (int j = 0; j <
		 * sh.getColumns(); j++) { String str = sh.getCell(j, k).getContents();
		 * System.out.println(str); }
		 * 
		 * }
		 */
		Exceloutput output = new Exceloutput();
		Exceloutput[] datafromexcel = new Exceloutput[sh.getRows()];

		for (int i = 0; i < sh.getRows(); i++) {
			output.UserName = sh.getCell(0, i).getContents();
			output.Password = sh.getCell(1, i).getContents();
			datafromexcel[i] = output;

		}
		return datafromexcel;

	}
}
