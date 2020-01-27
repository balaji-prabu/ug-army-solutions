package src.com.Objects;

import org.openqa.selenium.By;

import src.com.utls.UiUtils;

public class Home extends UiUtils{
	
	By search = By.name("q");
	
	public void searchKeyWord() {
		clickElement(search);
	}

}
