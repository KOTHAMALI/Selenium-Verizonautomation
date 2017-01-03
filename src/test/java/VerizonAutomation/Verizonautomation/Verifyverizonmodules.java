package VerizonAutomation.Verizonautomation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import utilities.Screenshot;

public class Verifyverizonmodules {
	
	WebDriverFactory Web = new WebDriverFactory();
	HomePage home = new HomePage();
	LandingPage page = new LandingPage();
	Tradedevice trade = new Tradedevice();
	Appraiseyourdevice appraise = new Appraiseyourdevice();
	Customizeyourdevice customize = new Customizeyourdevice();
	Screenshot Screen = new Screenshot();
	@Test
	public void verifymodule() throws Exception{
		//Web.setup();
		Web.intializeWebDriver();	
		home.verizonhome();	
		page.landingpage();	
		trade.tradeindevice();	
		appraise.verifyid();	
		customize.customizeyourdevice();
		Screen.screenshot("screenshot1");
		Web.tearDown();
		
	}
	
	

}
