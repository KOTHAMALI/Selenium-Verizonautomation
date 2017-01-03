package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import VerizonAutomation.Verizonautomation.WebDriverFactory;

public class Screenshot extends WebDriverFactory {

	   public  void screenshot(String filename) throws Exception {
				try {
					
					TakesScreenshot ts=(TakesScreenshot)getDriver();
					File src = ts.getScreenshotAs(OutputType.FILE);
					
					String timeStamp = new SimpleDateFormat("MM_dd_yyyy HH_mm_ss").format(Calendar.getInstance().getTime());
					FileUtils.copyFile(src, new File( "./ScreenshotsStore/"+timeStamp + filename+".png"));
					
				} catch (IOException e) {
					
				System.out.println("Exception during screenshot capturing" +e.getMessage());
				} 
				}
}
