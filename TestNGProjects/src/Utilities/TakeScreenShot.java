package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot extends BaseClass {

	public static void Screenshot(String filename) throws IOException {

		Date dt = new Date();
		int year = dt.getYear();
		int month = dt.getMonth();
		int date = dt.getDate();
		int hour = dt.getHours();
		int minutes = dt.getMinutes();
		int seconds = dt.getSeconds();
		// Date time = new Date(date.getTime()+(60*60*1000*24*5));

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\welcome\\eclipse-workspace\\GroTechMindsSelenium\\TestNGProjects\\target\\" + filename + "_"
						+ year + month + date + hour + minutes + seconds + ".png");
		FileHandler.copy(source, destination);

	}

}
