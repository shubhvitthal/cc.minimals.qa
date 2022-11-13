package cc.minimals.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import cc.minimals.qa.Base.TestBase;

public class RegistrationPage extends TestBase {

	@FindBy(xpath="//h3[contains(@class,'151tm5o')]")  private WebElement managejobTagline;
	@FindBy(xpath="//h4[contains(@class,'sko12q')]") private WebElement getstartfree;
	@FindBy(xpath="//a[text()='Sign in']") private WebElement signinLink;
	@FindBy(xpath="//img[contains(@class,'6jrdpz')]") private WebElement Registerpageimage;
	@FindBy(xpath="//p[text()=' Already have an account? ']") private WebElement alreadyAccText;
	@FindBy(xpath="//button[contains(@class,'1xc6l1x')]") private WebElement createAccBtn;
	@FindBy(xpath="//a[contains(@class,'1cpvl19')]") private WebElement TermService;
	@FindBy(xpath="//a[text()='Privacy Policy']") private WebElement priPolicy;
	@FindBy(xpath="//div[@class='css-128z9w6']/button[1]") private WebElement loginbyGoogle;
	@FindBy(xpath="//div[@class='css-128z9w6']/button[2]") private WebElement loginbyGithub;
	@FindBy(xpath="//div[@class='css-128z9w6']/button[3]") private WebElement loginbyTwitter;
	@FindBy(xpath="//button[contains(@class,' css-12lie7k')]") private WebElement settingBtn;
	@FindBy(xpath="//div[contains(@class,'1xsto0d')]")  private WebElement ErrorMsg;
	@FindBy(xpath="//input[@name='firstName']")  private WebElement firstName;
	@FindBy(xpath="//input[@name='lastName']") private WebElement lastName;
	@FindBy(xpath="//input[@name='email']") private WebElement Email;
	@FindBy(xpath="//input[contains(@class,'1nuss9t')]") private WebElement Pass;
	@FindBy(xpath="//button[contains(@class,'1xc6l1x')]") private WebElement CreateAccBtn;

	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyRegistrationPageTagline() {
		Assert.assertEquals(managejobTagline.getText(), "Manage the job more effectively with Minimal","Text is not as per Requirement");
		Reporter.log("verifyRegistrationPageTagline", true);
	}
	

	public void verifyRegistrationPageGetstartedLine() {
		Assert.assertEquals(getstartfree.getText(), "Get started absolutely free.","Text is not as per Requirement");
		Reporter.log("verifyRegistrationPageGetstartedLine", true);
	}

	public void verifyRegistrationTermsAndService() {
		Assert.assertEquals(TermService.getText(), "Terms of Service","Text is not as per Requirement");
		Reporter.log("verifyRegistrationTermsAndService", true);
	}

	public void verifyRegistrationPrivacyPolicy() {
		Assert.assertEquals(priPolicy.getText(), "Privacy Policy","Text is not as per Requirement");
		Reporter.log("verifyRegistrationTermsAndService", true);
	}

	public void verifyRegistrationPageFooterSocialBtn() {
		Assert.assertTrue(loginbyGoogle.isDisplayed(), "login by google Button is not Displayed");
		Assert.assertTrue(loginbyGithub.isDisplayed(), "login by Github Button is not Displayed");
		Assert.assertTrue(loginbyTwitter.isDisplayed(), "login by Twitter Button is not Displayed");
		Reporter.log("VerifyRegistrationPageFooterSocialBtn", true);
	}

	
	public void VerifyRegistraionPageSettingsBtn() {
		Assert.assertTrue(settingBtn.isDisplayed(), "Setting button is not Displayed");
		Reporter.log("VerifyRegistraionPageSettingsBtn", true);
	}
	
	
	public void VerifyRegistraionPageErrorMsg() {
		Assert.assertEquals(ErrorMsg.getText(), "Firebase: Password should be at least 6 characters (auth/weak-password).","error text as not expected");
		Reporter.log("VerifyRegistraionPageSettingsBtn", true);
	}

	
	public void setRegistrationPagefirstName(String FirstName) {
		Assert.assertTrue(firstName.isDisplayed(), "First Name filed is displayed");
		Assert.assertTrue(firstName.isEnabled(), "First Name filed is enabled");
		firstName.sendKeys(FirstName);
		Reporter.log("setRegistrationfirstName", true);
	}

	public void setRegistrationPageLastName(String LastName) {
		Assert.assertTrue(lastName.isDisplayed(), "Last Name filed is displayed");
		Assert.assertTrue(lastName.isEnabled(), "Last Name filed is enabled");
		lastName.sendKeys(LastName);
		Reporter.log("setRegistrationLastName", true);
	}

	public void setRegistrationPageEmailId(String EmailId) {
		Assert.assertTrue(Email.isDisplayed(), "Email Id filed is displayed");
		Assert.assertTrue(Email.isEnabled(), "Email Id filed is enabled");
		Email.sendKeys(EmailId);
		Reporter.log("setRegistrationEmailId", true);
	}


	public void setRegistrationPagePass(String Password) {
		Assert.assertTrue(Pass.isDisplayed(), "Email Id filed is displayed");
		Assert.assertTrue(Pass.isEnabled(), "Email Id filed is enabled");
		Pass.sendKeys(Password);
		Reporter.log("setRegistrationEmailId", true);
	}

	public void clickRegistrationPageCreateAccBtn() {
		Assert.assertTrue(CreateAccBtn.isDisplayed(), "Email Id filed is displayed");
		Assert.assertTrue(CreateAccBtn.isEnabled(), "Email Id filed is enabled");
		CreateAccBtn.click();
		Reporter.log("clickRegistrationPageCreateAccBtn", true);
	}

	
	
	
}
