package cc.minimals.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import cc.minimals.qa.Base.TestBase;

public class MinimalUIPage extends TestBase {

	
	@FindBy(xpath="//button[contains(@class,'10v8o86')]")  private WebElement ProfileButton;
	@FindBy(xpath="//div[contains(@class,'1y19tqg')]/p") private WebElement AccEmail;
	@FindBys({@FindBy(xpath="//div[contains(@class,'1kxe5pk')]/li")})private List<WebElement> AccPagelinksHPS;
	@FindBy(xpath="//li[contains(@class,'p9n58v')]") private WebElement logoutBtn;
	

	public MinimalUIPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyMinimalUICurrentUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://minimals.cc/dashboard/app");
		Reporter.log("verifyHomePageCurrentUrl",true);
	}
	
	public void verifyMinimalUIAccountEmail() {
		Assert.assertTrue(ProfileButton.isDisplayed(), "MinimalUI profile button is not displayed");
		ProfileButton.click();
		Reporter.log("verifyHomePageCurrentUrl",true);
	}

	
	public void clickMinimalUIProfileBtn() {
		Assert.assertEquals(AccEmail.getText(),"demo@minimals.cc");
		Reporter.log("clickMinimalUIProfileBtn",true);
	}
	
	public void ChooseMinimalUIAnyPage(String EnterPageName) {
		
		for(int i=0; i<AccPagelinksHPS.size();i++) {
			if(AccPagelinksHPS.get(i).getText().equalsIgnoreCase(EnterPageName)) {
				AccPagelinksHPS.get(i).click();
				break;
			}
		}
	}
	
	
	public void clickMinimalUIlogoutBtn() {
		logoutBtn.click();
		Reporter.log("clickMinimalUIlogoutBtn",true);
	}

	
	
	

}
