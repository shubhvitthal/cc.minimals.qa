package cc.minimals.qa.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cc.minimals.qa.Base.TestBase;
import cc.minimals.qa.Pages.LoginPage;
import cc.minimals.qa.Pages.RegistrationPage;
import cc.minimals.qa.Utils.Utils;

public class RegistrationPageTest2 extends TestBase{

	@BeforeClass
	public void setup() {
		CrossBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}

	
	
	@Test
	public void RegistraionPageTestWithWronginput() {
		LoginPage lp= new LoginPage(driver);
		lp.clickLoginPageCreateNewAccount();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		RegistrationPage rp= new RegistrationPage(driver);
		rp.verifyRegistrationPageTagline();
		rp.verifyRegistrationPageGetstartedLine();
		rp.verifyRegistrationPageFooterSocialBtn();
		rp.verifyRegistrationPrivacyPolicy();
		rp.verifyRegistrationTermsAndService();
		rp.VerifyRegistraionPageSettingsBtn();
		rp.setRegistrationPagefirstName("pqr");
		rp.setRegistrationPageLastName("abc");
		rp.setRegistrationPageEmailId("pqr@gmail.com");
		rp.setRegistrationPagePass("123");
		rp.clickRegistrationPageCreateAccBtn();
		rp.VerifyRegistraionPageErrorMsg();
	}
	
	
	@AfterMethod()
	public void Capturess(ITestResult result) throws IOException {
		if(result.FAILURE==result.getStatus()) {
		Utils.getscreenshot(driver, result.getName());
		}
	}

	
	
	
	
}
