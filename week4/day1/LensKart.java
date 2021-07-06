package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LensKart {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver(options);

		driver.navigate().to("https://www.lenskart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement webElement = driver.findElementByXPath("//a[text()='Computer Glasses']");
		//WebElement mensTab = driver.findElementByXPath("//*[@id=\"cssmenu\"]/div[2]/div/div/div/div/div[3]");

		Actions builder = new Actions(driver);
		builder.moveToElement(webElement).perform();
		//WebElement mensTab = driver.findElementByXPath("//div[@class='gender'][1]");
		//builder.moveToElement(mensTab).click().perform();
		driver.findElementByXPath("(//span[text()='PREMIUM RANGE'])").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='Round']").click();
		WebElement noOfFrameColour = driver.findElementByXPath("//span[text()='Black(14)']");
		String noOfFrame = noOfFrameColour.getText().replaceAll("\\D", "");
		noOfFrameColour.click();
		System.out.println(noOfFrame);
				
		Thread.sleep(3000);
		List<WebElement> noOfElements = driver.findElementsByXPath("//div[@class='productWidgetBox_widgetImage']");
		int size = noOfElements.size();
		System.out.println(size);
		WebElement sizeWeb = driver.findElementByXPath("//div[@class='col-md-5 no-padding text-left'][1]");
		builder.moveToElement(sizeWeb).perform();
		String text = driver.findElementByXPath("//*[@id=\"categoryPage\"]/div[8]/div[1]/div/div/div[1]/div[1]/div/div/div/div[3]/p/span").getText();
		System.out.println(text);
		
		
		
		

	}

}
