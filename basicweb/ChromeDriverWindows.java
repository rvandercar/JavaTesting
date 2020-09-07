package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {
	
	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\vandy\\eclipse-workspace\\libs\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://www.letskodeit.com";
		driver.get(baseURL);
	}
}
