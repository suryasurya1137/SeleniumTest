package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://leafground.com/pages/Edit.html");
		//driver.get("http://leafground.com/pages/Edit.html");
		
		driver.findElementByXPath("//input[@id='email']").sendKeys("rjsurya1137@gmail.com");
		WebElement webEleMent = driver.findElementByXPath("//input[@value='Append ']");
		String text = webEleMent.getText();
		
		webEleMent.sendKeys(text+"the sentence");
		webEleMent.sendKeys(Keys.TAB);
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String text2 = driver.findElementByXPath("//input[@name='username']").getText();
		System.out.println(text2);
		
		driver.findElementByXPath("//label[text()='Clear the text']/following-sibling::input").clear();
		
		boolean enabled = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[5]/input").isEnabled();
		
		System.out.println(enabled);
	
		
		
		
		
		
		
		
		
		

	}

}
