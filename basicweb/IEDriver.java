package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\vandy\\eclipse-workspace\\libs\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		String baseURL = "http://www.letskodeit.com";
		driver.get(baseURL);
	}

}
