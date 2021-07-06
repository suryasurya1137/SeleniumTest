package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * driver.manage().window().maximize(); Alert alert = driver.switchTo().alert();
		 * alert.accept();
		 */
		driver.manage().window().maximize();
	

		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='OK']").click();
		driver.findElementByXPath("//a[text()=' FLIGHTS ']").click();
		Thread.sleep(3000);

		Set<String> secondWindow = driver.getWindowHandles();
		List<String> secondWindow1 = new ArrayList<String>(secondWindow);
		driver.switchTo().window(secondWindow1.get(1));
		
		String text = driver.findElementByXPath("(//a[text()=' flights@irctc.co.in'])[1]").getText();
		System.out.println(text);
		driver.close();
		driver.switchTo().window(secondWindow1.get(0));
		System.out.println(driver.getTitle());

		Date date = new Date();
		String replace = date.toString().replace(":", "");

		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/LG" + replace + ".png");
		FileUtils.copyFile(screenshotAs, target);

		/*
		 * WebElement webEle = driver.findElementByXPath("//h5[text()='Edit']");
		 * 
		 * File screenshotAs2 = webEle.getScreenshotAs(OutputType.FILE); File target2 =
		 * new File("./snaps/webelement.png"); FileUtils.copyFile(screenshotAs2,
		 * target2);
		 */

	}

}
