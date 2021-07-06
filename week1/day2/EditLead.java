package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gopi");
		Thread.sleep(3000);
		driver.findElementByXPath("(//button[text()='Find Leads'])").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		String title = driver.getTitle();
		if (title.contains("View Lead")) {
			System.out.println(" We are in" + title + "page");

		}
		driver.findElementByXPath("//a[text()='Edit']").click();
		WebElement a = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
		a.clear();
		a.sendKeys("Accenture");
		driver.findElementByXPath("//input[@name='submitButton']").click();
		Thread.sleep(5000);

		String cmpanyName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		if (cmpanyName.contains("Accenture")) {
			System.out.println("Company Name has been updated");
		} else
			System.out.println("Company Name has not been updated");

		//driver.close();

	}

}
