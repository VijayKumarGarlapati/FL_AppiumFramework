package Fission.FL_AppiumFramework.TestSteps;

import org.openqa.selenium.WebElement;

import Fission.FL_AppiumFramework.locators.LoginPageLoc;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LoginPageSteps implements LoginPageLoc {

	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void eter_and(String arg1, String arg2) {
		WebElement email  = HomePageSteps.adriver.findElementById(EMAIL);
		email.clear();
		email.sendKeys(arg1);
		WebElement password  = HomePageSteps.adriver.findElementById(PASS);
		password.clear();
		password.sendKeys(arg2);
		
	}

	@And("^Click on \"([^\"]*)\"$")
	public void click_on(String arg1) {
		if(arg1.equalsIgnoreCase("Login")){
			HomePageSteps.adriver.findElementById(LOGIN_BUTTON).click();
		}
	}
}
