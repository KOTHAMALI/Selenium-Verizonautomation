package VerizonAutomation.Verizonautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tradedevice extends LandingPage {

	public void tradeindevice() throws InterruptedException{
		
		//here we will be selecting the tradein device configurations,carrier and manufacture providers.
	    webDriverFluentWait(By.xpath(".//*[@id='shipping-wrapper']/div/div[1]/div[1]/a[1]")).click();
	    webDriverFluentWait(By.xpath("html/body/div[29]/div/div/div/div/div[2]/div[2]/div[2]/a")).click();
		
		WebElement carrier = webDriverFluentWait(By.xpath(".//h3[text()='Choose your device.']//following::select[1]"));
		Select dropdownC= new Select(carrier);
		dropdownC.selectByVisibleText("AT&T");
		
		WebElement manufacture = webDriverFluentWait(By.xpath(".//h3[text()='Choose your device.']//following::select[2]"));
		Select dropdownM= new Select(manufacture);
		dropdownM.selectByVisibleText("Apple");
		
		webDriverFluentWait(By.xpath(".//*[@id='selectTradInDeviceForm']/div[1]/div[1]/div[1]/ul/li[3]/div/div/div/div[1]/a")).click();
		
		WebElement memorysize = webDriverFluentWait(By.xpath(".//select[@name='memory']"));
		Select dropdownmemory= new Select(memorysize);
		dropdownmemory.selectByVisibleText("64GB");
		
		WebElement color = webDriverFluentWait(By.xpath(".//select[@name='color']"));
		Select dropdowncolor= new Select(color);
		dropdowncolor.selectByVisibleText("Silver");
		
		webDriverFluentWait(By.xpath(".//*[@id='selectTradInDeviceForm']/div[1]/div[2]/div/input[1]")).click();
	

	}

}
