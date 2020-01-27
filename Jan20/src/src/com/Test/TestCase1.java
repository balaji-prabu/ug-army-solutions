package src.com.Test;

import org.testng.annotations.Test;

import src.com.Objects.Home;
import src.com.utls.PageFactory;

public class TestCase1 extends PageFactory{
	
	@Test
	public void test1() {
		retunHome().searchKeyWord();		
	}

}
