package week1.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();

		String title = driver.getTitle();

		if (title.equals("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println("We are in welcome page");
		} else {
			System.out.println("Not in a welcome page");
		}
		
		String welcomeText = driver.findElementByTagName("h2").getText();
		
		if (welcomeText.contains("Welcome")) {
			System.out.println("We are in welcome page");
		} else {
			System.out.println("Not in a welcome page");
		}
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		// xpath for leads tab //a[text()='Leads']
		//   //input[@id='partyIdFrom']/following::img  merge lead --> first icon
		//   //input[@id='partyIdTo']/following::img  second icon
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Surya");
		driver.findElementById("createLeadForm_lastName").sendKeys("R");
		
		WebElement drpDownElement = driver.findElementById("createLeadForm_dataSourceId");
		Select  obj = new Select(drpDownElement);
		obj.selectByValue("LEAD_DIRECTMAIL");
		//obj.selectByIndex(3);
		//obj.selectByVisibleText("Direct Mail");
		
		
		WebElement Market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select  obj2 = new Select(Market);
		obj2.selectByIndex(2);
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Surya");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("R");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Welcome");
		driver.findElementById("createLeadForm_birthDate").sendKeys("30/04/95");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Lead Form");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("1 lakh");
		
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select  obj3 = new Select(industry);
		obj3.selectByVisibleText("Finance");
		
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select  obj4 = new Select(ownership);
		obj4.selectByValue("OWN_PARTNERSHIP");
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("50");
		driver.findElementById("createLeadForm_sicCode").sendKeys("0011");
		driver.findElementById("createLeadForm_description").sendKeys("Description");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Notes");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("L");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("639110");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("1122");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("surya@gmail.com");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("785645677");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Nothing");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("1122");
		
		
		driver.findElementByName("submitButton").click();
		
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementById("createLeadForm_companyName").clear();
		driver.findElementById("createLeadForm_companyName").sendKeys("Organisation");
		
		driver.findElementByName("submitButton").click();
		
		String cmpnyName = driver.findElementById("viewLead_companyName_sp").getText();
		
		System.out.println(cmpnyName);
		
		cmpnyName = cmpnyName.replaceAll("\\d","");   //---> remove integer values
//		cmpnyName = cmpnyName.replaceAll("(","");
//		cmpnyName = cmpnyName.replaceAll(")","");	
//		cmpnyName = cmpnyName.replaceAll("\\s","");
		//cmpnyName = cmpnyName.replaceAll("\\D","");    //----> remove all non integer values
		System.out.println(cmpnyName);
		
		if (cmpnyName.equals("Organisation")) {
			
			System.out.println("Company Name ie correct");
			
		}else {System.out.println("Company Name is not correct");
		
		}
		
		driver.close();
		//driver.quit();

	}

}
