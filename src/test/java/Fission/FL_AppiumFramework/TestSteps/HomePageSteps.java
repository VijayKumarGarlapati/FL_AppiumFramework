package Fission.FL_AppiumFramework.TestSteps;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import Fission.FL_AppiumFramework.locators.HomePageLoc;

import com.google.common.base.Verify;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps implements HomePageLoc {
	public static AndroidDriver adriver;
	WebDriverWait wait;

	@Given("^Launch Twitter$")
	public void launchApp() throws InterruptedException, MalformedURLException {

		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/");
		System.out.println(appDir);
//		File app = new File(appDir, "twitter.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Seema");
		capabilities.setCapability("platformVersion", "5.1.1");
		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.twitter.android");
		capabilities.setCapability("appActivity",
				"com.twitter.android.LoginActivity");
		adriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);

		Thread.sleep(2000);
	}

	@Then("^Veify elements on Home Page$")
	public void veify_elements_on_Home_Page() throws InterruptedException {
		WebElement login = adriver.findElement(By.name(LOGIN));
		Verify.verify(login.isDisplayed());
		WebElement signUp = adriver.findElement(By.name(SIGNUP));
		Verify.verify(signUp.isDisplayed());
	}

}
