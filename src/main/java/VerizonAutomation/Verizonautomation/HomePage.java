package VerizonAutomation.Verizonautomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends WebDriverFactory {
	
	public void verizonhome() throws InterruptedException{
		getDriver().get("http://www.verizon.com/home/verizonglobalhome/ghp_landing.aspx");
		getDriver().manage().window().maximize();
		getDriver().findElement(By.xpath(".//*[@id='display_popup_portal_book_1']/div/div/div[1]/div[1]/div/div[1]/ul/li[1]/a")).click();
	}
}