package src.com.utls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UiUtils extends Driver{
	
	protected WebDriver driver;
	
	protected void appLaunch(String url) {
		driver.get(url);
	}
	
	protected void clickElement(By ele) {
		driver.findElement(ele).click();
	}

}
