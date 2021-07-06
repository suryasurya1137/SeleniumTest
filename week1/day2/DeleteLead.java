package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//a[@class='x-tab-right'])[2]").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		driver.findElementByXPath("(//button[text()='Find Leads'])").click();
		Thread.sleep(3000);
		WebElement leadIDElement = driver
				.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String leadID = leadIDElement.getText();
		System.out.println(leadID);
		leadIDElement.click();
		driver.findElementByXPath("//a[text()='Delete']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByName("id").sendKeys(leadID);
		driver.findElementByXPath("(//button[text()='Find Leads'])").click();
		
		Thread.sleep(4000);
		
		  String text2 =
		  driver.findElementByClassName("x-paging-info").getText();
		  System.out.println(text2);
		  
		  if (text2.equals("No records to display")) 
		  {
		  System.out.println("Lead ID is successfully deleted");
		  
		  }else System.out.println("Lead ID is not deleted");
				  
		  /*String text = driver.findElementByClassName("x-paging-info").getText();
			System.out.println(text);
			if (text.equals("No records to display")) {
				System.out.println("Text matched");
			} else {
				System.out.println("Text not matched");
		 */
		/*
		 * String pageSource = driver.getPageSource(); System.out.println(pageSource);
		 * 
		 * if (pageSource.contains("No records to display")) {
		 * System.out.println("Lead ID is successfully deleted"); } else
		 * System.out.println("Lead ID is not deleted");
		 */

	}

	}

