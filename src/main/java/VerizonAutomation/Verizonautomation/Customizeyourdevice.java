package VerizonAutomation.Verizonautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Customizeyourdevice extends Appraiseyourdevice {
	
	public void customizeyourdevice() throws InterruptedException{
		webDriverFluentWait(By.xpath("//h2[text()='Terms and Conditions']//following::label[1]")).click();
		
		webDriverFluentWait(By.xpath("//h2[text()='Terms and Conditions']//following::input[5]")).click();
		
		webDriverFluentWait(By.xpath(".//*[@id='color-wrapper']/label[2]")).click();
		
		WebElement memory = getDriver().findElement(By.xpath(".//select[@id='device-capacity-select']"));
		
		Select dropdown= new Select(memory);
		dropdown.selectByVisibleText("128GB");
		
		webDriverFluentWait(By.xpath(".//*[@id='myBtn']")).click();
		
		webDriverFluentWait(By.xpath(".//h4[text()='Are you a new or existing customer?']//following::input[1]")).click();
		Thread.sleep(1000);
		
		webDriverFluentWait(By.xpath(".//div[@id='device-info-wrapper']//following::button")).click();
		
		webDriverFluentWait(By.xpath(".//h3[text()='Choose your data.']//following::div[13]")).click();
		
		webDriverFluentWait(By.xpath(".//div[@class='orderSummarySidebarTotals']//following::a[1]")).click();
		
		webDriverFluentWait(By.xpath(".//*[@id='costSummary']/div[1]/a[2]")).click();
		Thread.sleep(1000);
		
	}
	

}
