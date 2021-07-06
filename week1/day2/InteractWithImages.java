package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithImages {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/Image.html");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[1]/img").click();
		Thread.sleep(3000);
		driver.navigate().back();
				
		String attribute = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[2]/img").getAttribute("src");
		driver.get(attribute);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  String title =  driver.getTitle(); 
		  if (title.contains("404 – Not Found")) {
		  System.out.println("This is broken image");
		  
		  }else { System.out.println("Not a broken image"); }
		
		/*
		 * WebElement webEle =
		 * driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[3]/img"
		 * ); //webEle.sendKeys(Keys.ENTER); System.out.println(driver.getTitle());
		 */

	}

}
