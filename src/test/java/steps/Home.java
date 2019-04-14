package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
	public static WebDriver driver;
	
	public WebDriver getId() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KASTHURI\\eclipse workspce\\kasuma\\JavaProgram\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 return driver;
	}
	
	public void loadUrl(String url) {
	driver.get(url);
	
	}
	
	public void quitBrowser() {
		driver.quit();

	}
}

