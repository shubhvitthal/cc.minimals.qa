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

public class LoginPageTest1 extends TestBase {

	
	@BeforeClass
	public void setup() {
		CrossBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}



	@Test
	public void loginPageTestWithwrongpass() {
		
		LoginPage lp= new LoginPage(driver);
		lp.VerifyLoginPageWlcomBakText();
		lp.VerifyLoginPageImage();
		lp.VerifyLoginPageloginMinimalText();
		lp.VerifyLoginPageCreatenewAccLink();
		lp.VerifyLoginPageForgotPassLink();
		lp.VerifyLoginPageFooterSocialBtn();
		lp.VerifyLoginPageSettingsBtn();
		lp.VerifyLoginPageFooterSocialBtn();
		lp.VerifyLoginPageDummyEmailPass();
		lp.setLoginPageEmailId("demo@minimals.cc");
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
