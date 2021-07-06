package week1.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement from = driver.findElementByXPath("//input[@id='src']");
		from.sendKeys("C");
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement to = driver.findElementByXPath("//input[@id='dest']");
		to.sendKeys("Tri");
		Thread.sleep(2000);
		to.sendKeys(Keys.ENTER);
		driver.findElementByXPath("//input[@id='onward_cal']").click();
		Thread.sleep(2000);

		driver.findElementByXPath("((//tr[@class='rb-monthHeader'])/following-sibling::tr)[6]/td[3]").click();
		//// table[@class='rb-monthTable first last']//tr/td[text()='30']
		Thread.sleep(2000);
		driver.findElementByXPath("//button[@id='search_btn']").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("(//div[@class='close'])/i").click();
		Thread.sleep(2000);
		String noOFBuses = driver.findElementByXPath("(//span[@class='f-bold busFound'])").getText();
		System.out.println(noOFBuses);
		Thread.sleep(2000);
		driver.findElementByXPath("((//input[@id='bt_SLEEPER'])/..)/label[1]").click();
		Thread.sleep(2000);
		String noOFBuses2 = driver.findElementByXPath("(//span[@class='f-bold busFound'])").getText();
		System.out.println(noOFBuses2);
		Thread.sleep(2000);
		String noOFBuses3 = driver.findElementByXPath("((//input[@id='bt_AC'])/..)/label[1]").getText();
		System.out.println(noOFBuses3);
		 

	}

}
