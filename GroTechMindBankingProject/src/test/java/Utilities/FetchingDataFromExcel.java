package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchingDataFromExcel {

	public static String getURL(int sheetindex, int rowindex, int cellindex) throws IOException {

		FileInputStream fs = new FileInputStream("C:\\Users\\welcome\\Downloads\\GTMBankingApp.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheetAt(sheetindex);
		XSSFCell cellvalue = sheet.getRow(rowindex).getCell(cellindex);
		String urlValue = cellvalue.toString();
		
		return urlValue;
	}

}
