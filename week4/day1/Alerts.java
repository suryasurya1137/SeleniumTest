package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		Alert a1 = driver.switchTo().alert();
		String text = a.getText();
		a1.sendKeys("Surya");
		a1.accept();
		System.out.println(text);
		
		

	}

}
