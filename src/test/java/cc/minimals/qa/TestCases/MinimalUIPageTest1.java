package cc.minimals.qa.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cc.minimals.qa.Base.TestBase;
import cc.minimals.qa.Pages.LoginPage;
import cc.minimals.qa.Pages.MinimalUIPage;
import cc.minimals.qa.Utils.Utils;

public class MinimalUIPageTest1 extends TestBase {

	@BeforeClass
	public void setup() {
		CrossBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}

	@Test
	public void MininmalUIPageLogoutTest() throws EncryptedDocumentException, IOException {
		
		LoginPage lp= new LoginPage(driver);
		lp.setLoginPageEmailId(Utils.datafromexcel("Sheet1", 0, 0));
		lp.setLoginPagePassword(Utils.datafromexcel("Sheet1", 0, 1));
		lp.clickLoginPageLoginBtn();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MinimalUIPage ui= new MinimalUIPage(driver);
		ui.verifyMinimalUICurrentUrl();
		ui.clickMinimalUIProfileBtn();
		ui.verifyMinimalUIAccountEmail();
		ui.clickMinimalUIlogoutBtn();
		
		
	}
	
	@AfterMethod()
	public void Capturess(ITestResult result) throws IOException {
		if(result.FAILURE==result.getStatus()) {
		Utils.getscreenshot(driver, result.getName());
		}
	}

	
	
	
	
}
