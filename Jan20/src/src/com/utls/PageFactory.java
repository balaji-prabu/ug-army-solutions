package src.com.utls;

import src.com.Objects.Home;

public class PageFactory {
	
	protected static Home hmeobj;
	
	public static void init() {
		hmeobj = new Home();
	}
	
	protected Home retunHome() {
		
		return hmeobj;
	}
	

}
