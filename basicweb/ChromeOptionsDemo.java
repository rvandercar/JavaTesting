package basicweb;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
		// http://chromedriver.storage.googleapis.com/index.html
		String baseURL = "http://www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/vandy/eclipse-workspace/libs/drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("load-extension=/Users/vandy/AppData/Local/Google/Chrome/User Data/Profile 1/Extensions/aapocclcgogkmnckokdopfmhonfmgoek/0.10_0");
		options.addArguments("load-extension=/Users/vandy/AppData/Local/Google/Chrome/User Data/Profile 1/Extensions/ljngjbnaijcbncmcnjfhigebomdlkcjo/6.1.4_0/");				
		driver = new ChromeDriver(options);
		driver.get(baseURL);
	}
}