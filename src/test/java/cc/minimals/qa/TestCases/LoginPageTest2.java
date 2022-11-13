package cc.minimals.qa.TestCases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cc.minimals.qa.Base.TestBase;
import cc.minimals.qa.Pages.LoginPage;
import cc.minimals.qa.Utils.Utils;

public class LoginPageTest2 extends TestBase{

	@BeforeClass
	public void setup() {
		CrossBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}


	@Test
	public void loginPageTestWithEmail() {
		
		LoginPage lp= new LoginPage(driver);
		lp.setLoginPageEmailId(" demo@minimals.cc");
		lp.setLoginPagePassword("demo1234");
		lp.clickLoginPageLoginBtn();
	}



	@AfterMethod()
	public void Capturess(ITestResult result) throws IOException {
		if(result.FAILURE==result.getStatus()) {
		Utils.getscreenshot(driver, result.getName());
		}
	}

	
	
	
}
