package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vandy\\eclipse-workspace\\libs\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://learn.letskodeit.com";
		driver.get(baseURL);
		}
	}