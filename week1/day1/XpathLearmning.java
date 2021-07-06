package week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLearmning {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		/*
		 * driver.findElementByXPath("//input[@id='username']").sendKeys(
		 * "demosalesmanager");
		 * driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys(
		 * "crmsfa");
		 * driver.findElementByXPath("//input[contains(@class,'decorativeSub')]").click(
		 * );
		 * 
		 * driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		 * 
		 * driver.findElementByLinkText("Leads").click();
		 * driver.findElementByLinkText("Create Lead").click();
		 */
		
		WebElement webElement = driver.findElementByXPath("(//div[@class='example'])[5]/select");
		
		Select dd1= new Select(webElement);
		dd1.selectByIndex(2);
		

		WebElement webElement2 = driver.findElementByXPath("(//div[@class='example'])[6]/select");
		
		Select dd2= new Select(webElement2);
		dd2.selectByIndex(4);
		dd2.selectByIndex(3);
		dd2.selectByIndex(2);
		// (//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]
		
		
		
		
		

	}

}
