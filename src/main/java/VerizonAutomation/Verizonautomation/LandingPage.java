package VerizonAutomation.Verizonautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LandingPage extends HomePage {

	public void landingpage() throws InterruptedException{
		
	Actions actions = new Actions(getDriver());
     	WebElement shops = webDriverFluentWait(By.id("onavmenu1"));
		//WebElement shops = webDriverFluentWait(By.xpath(".//*[@id='onavmenu1'][@href='https://www.verizonwireless.com/landingpages/shop-phones-devices/']"));
		//WebElement shops = webDriverFluentWait(By.id(".//a[text()='Shop']"));
		actions.moveToElement(shops).build().perform();
		
		WebElement phonesdevices = webDriverFluentWait(By.xpath(".//a[text()='Shop']//following::a[1]"));
		//WebElement phonesdevices = webDriverFluentWait(By.xpath(".//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/a/span"));
		//WebElement phonesdevices = webDriverFluentWait(By.xpath(".//*[@title='Phones & Devices']"));
		actions.moveToElement(phonesdevices).build().perform();
		
		webDriverFluentWait(By.xpath(".//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[3]/td[2]/span[1]/img")).click();
		webDriverFluentWait(By.xpath(".//*[@id='color-wrapper']/label[2]")).click();
		
		
		WebElement memory = getDriver().findElement(By.xpath(".//select[@id='device-capacity-select']"));
		Select dropdownM= new Select(memory);
		dropdownM.selectByVisibleText("128GB");
	
	
		
	}
}
