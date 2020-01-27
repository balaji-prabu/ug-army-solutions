package src.com.utls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Driver extends PageFactory{
	
	protected static WebDriver driver;
	
	@BeforeTest
	public void start() {
		initialize();
		init();
		launch();
	}
	
	public static WebDriver initialize() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		return driver;
	}
	
	public void launch() {
		driver.get("https://www.googloe.com");
	}

}
