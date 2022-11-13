package cc.minimals.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import cc.minimals.qa.Base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//h3[contains(@ class,'151tm5o')] ")  private WebElement welBackText;
	@FindBy(xpath="//h4[contains(@ class,'sko12q')] ") private WebElement SignintominimalText;
	@FindBy(xpath="//a[text()='Create an account']") private WebElement CreateNewAccLink;
	@FindBy(xpath="//a[text()='Forgot password?']") private WebElement ForgotPasslink;
	@FindBy(xpath="//img[@class='MuiBox-root css-6jrdpz']")  private WebElement loginPageImage;
	@FindBy(xpath="//div[@class='css-128z9w6']/button[1]") private WebElement loginbyGoogle;
	@FindBy(xpath="//div[@class='css-128z9w6']/button[2]") private WebElement loginbyGithub;
	@FindBy(xpath="//div[@class='css-128z9w6']/button[3]") private WebElement loginbyTwitter;
	@FindBy(xpath="//div[@class='MuiAlert-message css-1xsto0d']") private WebElement dumyEmailPass;
	@FindBy(xpath="//button[contains(@class,' css-12lie7k')]") private WebElement settingBtn;
	@FindBy(xpath="//p[contains(@class,' css-1vgir83')]") private WebElement EmailError;
	@FindBy(xpath="//p[contains(@class,'1vgir83')]") private WebElement passerror;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginBtn;
	@FindBy(xpath="//input[@name='email']") private WebElement Email;
	@FindBy(xpath="//input[@name='password']") private WebElement Pass;
	

	
	//===============initialize using the constructor=============

	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	
	public void VerifyLoginPageWlcomBakText() {
		Assert.assertEquals(welBackText.getText(), "Hi, Welcome back","Text is not as per Requirement");
		Reporter.log("VerifyLoginPageWlcomBakText", true);
	}
	
	public void VerifyLoginPageImage() {
		Assert.assertTrue(loginPageImage.isDisplayed(), "Login Page image is not Displayed");
		Reporter.log("VerifyLoginPageImage", true);
	}

	
	public void VerifyLoginPageloginMinimalText() {
		Assert.assertEquals(SignintominimalText.getText(), "Sign in to Minimal","Text is not as per Requirement");
		Reporter.log("VerifyLoginPageloginMinimalText", true);
	}

	
	public void VerifyLoginPageCreatenewAccLink() {
		Assert.assertTrue(CreateNewAccLink.isDisplayed(), "Create new Acc link is not Displayed");
		Assert.assertEquals(CreateNewAccLink.getText(), "Create an account","Text is not as per Requirement");
		Reporter.log("VerifyLoginPageCreatenewAccLink", true);
	}

	public void VerifyLoginPageForgotPassLink() {
		Assert.assertTrue(ForgotPasslink.isDisplayed(), "Forgot Password link is not Displayed");
		Assert.assertEquals(ForgotPasslink.getText(), "Forgot password?","Text is not as per Requirement");
		Reporter.log("VerifyLoginPageForgotPassLink", true);
	}

	
	public void VerifyLoginPageFooterSocialBtn() {
		Assert.assertTrue(loginbyGoogle.isDisplayed(), "login by google Button is not Displayed");
		Assert.assertTrue(loginbyGithub.isDisplayed(), "login by Github Button is not Displayed");
		Assert.assertTrue(loginbyTwitter.isDisplayed(), "login by Twitter Button is not Displayed");
		Reporter.log("VerifyLoginPageFooterSocialBtn", true);
	}

	public void VerifyLoginPageDummyEmailPass() {
		Assert.assertTrue(dumyEmailPass.isDisplayed(), "Dummy Email pass word texts is not Displayed");
		Reporter.log("VerifyLoginPageDummyEmailPass", true);
	}

	public void VerifyLoginPageSettingsBtn() {
		Assert.assertTrue(settingBtn.isDisplayed(), "Setting button is not Displayed");
		Reporter.log("VerifyLoginPageSettingsBtn", true);
	}
	
	public void verifyLoginPageEmailErrorMsg() {
		Assert.assertEquals(EmailError.getText(), "Email must be a valid email address");
		System.out.println(EmailError.getText());
		Reporter.log("verifyLoginPageEmailErrorMsg", true);
	}

	
	public void verifyLoginPagepassErrorMsg() {
		Assert.assertEquals(passerror.getText(), "Email must be a valid email address");
		System.out.println(passerror.getText());
		Reporter.log("verifyLoginPageEmailErrorMsg", true);
	}

	
	

	public void setLoginPageEmailId(String EmailID) {
		Assert.assertTrue(Email.isDisplayed(), "Email id field is not Displayed");
		Assert.assertTrue(Email.isEnabled(),"Email id field is not enabled" );
		Email.sendKeys(EmailID);
		Reporter.log("setLoginPageEmailId", true);
	}

	public void setLoginPagePassword(String Password) {
		Assert.assertTrue(Pass.isDisplayed(), "Password field is not Displayed");
		Assert.assertTrue(Pass.isEnabled(),"Password field is not enabled" );
		Pass.sendKeys(Password);
		Reporter.log("setLoginPagePassword", true);
	}

	public void clickLoginPageLoginBtn() {
		Assert.assertTrue(loginBtn.isDisplayed(), "Email id field is not Displayed");
		Assert.assertTrue(loginBtn.isEnabled(),"Email id field is not enabled" );
		loginBtn.click();
		Reporter.log("clickLoginPageLoginBtn", true);
	}

	public void clickLoginPageCreateNewAccount() {
		Assert.assertTrue(CreateNewAccLink.isDisplayed(), "Email id field is not Displayed");
		Assert.assertTrue(CreateNewAccLink.isEnabled(),"Email id field is not enabled" );
		CreateNewAccLink.click();
		Reporter.log("clickLoginPageCreateNewAccount", true);
	}

	
}
