package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchDataFromExcel {

	public static String getDataMethod1(String filelocation, int sheetindex, int rowindex, int cellindex)
			throws IOException {

		FileInputStream fs = new FileInputStream(filelocation);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheetAt(sheetindex);
		XSSFCell cellvalue = sheet.getRow(rowindex).getCell(cellindex);
		String urlValue = cellvalue.toString();

		return urlValue;
	}

	public static String getDataMethod2(String filelocation, int sheetindex, int rowindex, int cellindex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fs = new FileInputStream(filelocation);
		Workbook wb = WorkbookFactory.create(fs);
		String cellvalue = wb.getSheetAt(sheetindex).getRow(rowindex).getCell(cellindex).toString();

		return cellvalue;

	}

}
