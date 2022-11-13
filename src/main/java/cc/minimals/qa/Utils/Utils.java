package cc.minimals.qa.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cc.minimals.qa.Base.TestBase;

public class Utils extends TestBase {

//  1. Utility for screenshot
	
	public static void getscreenshot(WebDriver driver,String websitename) throws IOException {
		//webname  on which website you taking screenshot
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d= new Date();  //for naming use date and time Thu Jul 28 12:31:27 IST 2022
		String filename = d.toString().replace(" ", "_").replace(":", "_")+".png";
		
		File destination =new File("F:\\company test\\cc.minimals.qa\\screenshot\\"+websitename+filename);
		FileUtils.copyFile(source, destination);
	
	}
	
	// 2. Utility for Excel sheet
	
	public static String datafromexcel(String Sheetname, int row, int colm) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("F:\\company test\\cc.minimals.qa\\src\\main\\java\\cc\\minimals\\qa\\TestData\\TestData.xlsx");
		String value = WorkbookFactory.create(file).getSheet(Sheetname).getRow(row).getCell(colm).getStringCellValue();
		
		return value;
	
	}
	
}
