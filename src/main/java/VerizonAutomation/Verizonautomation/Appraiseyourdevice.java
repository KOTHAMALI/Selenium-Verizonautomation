package VerizonAutomation.Verizonautomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Appraiseyourdevice extends Tradedevice {
	
	public void verifyid() throws InterruptedException{
		
		//apraise your device and click on all the radio buttons page
		
		webDriverFluentWait(By.xpath(".//input[@name='device-id'] [@placeholder='Device ID']")).sendKeys("123654987154");
		webDriverFluentWait(By.xpath(".//*[@id='not-now-tradein-overlay']//preceding::input[12]")).click();
		
		webDriverFluentWait(By.xpath(".//h1[text()='Appraise Your Device']//following::ins[1]")).click();
		webDriverFluentWait(By.xpath(".//h1[text()='Appraise Your Device']//following::ins[3]")).click();
		webDriverFluentWait(By.xpath(".//h1[text()='Appraise Your Device']//following::ins[5]")).click();
		webDriverFluentWait(By.xpath(".//h1[text()='Appraise Your Device']//following::ins[7]")).click();
		webDriverFluentWait(By.xpath(".//*[@id='selectTradInDeviceId']/div[2]/div[1]/div/a")).click();
		
		//comparing the cost with original price on the page
		String actual = getDriver().findElement(By.xpath(".//h3[text()='Your appraised device value']//following::span[1]")).getText();
	    String expected = "$23100";
		if(actual==expected)
		{
			System.out.println("the price expected is found");
		}
		else
		{
			System.out.println("the price expected is not found ");
		}
Thread.sleep(1000);
		
		
		webDriverFluentWait(By.xpath(".//h1[text()='Appraise Your Device']//following::input[18]")).click();
		
		webDriverFluentWait(By.xpath("//h2[text()='Trade In Options']//following::a[1]")).click();

		
	}

}
