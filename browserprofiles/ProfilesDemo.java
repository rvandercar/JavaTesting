package browserprofiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class ProfilesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
				"/Users/vandy/eclipse-workspace/libs/drivers/geckodriver.exe");
		String baseURL = "http://www.letskodeit.com";
		WebDriver driver;
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fxProfile = profile.getProfile("automationprofile");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(fxProfile);
		
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get(baseURL);
	}
}