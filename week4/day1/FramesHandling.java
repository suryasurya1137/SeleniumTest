package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandling {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		driver.findElementByXPath("//b[@id='topic']/following::input").sendKeys("Testing");
		WebElement frame3 = driver.findElementByXPath("//iframe[@id='frame3']");
		driver.switchTo().frame(frame3);
		driver.findElementById("a").click();
		driver.switchTo().parentFrame();
		driver.findElementByXPath("//b[@id='topic']/following::input").sendKeys("TestLeaf");
		driver.switchTo().defaultContent();
		String text = driver.findElementByXPath("//span[text()='Not a Friendly Topic']").getText();
		System.out.println(text);
		
		driver.switchTo().frame(1);
		System.out.println(driver.findElementByXPath("//b[text()='Animals : ']").getText());
		WebElement dropDown = driver.findElementByXPath("//select[@id='animals']");
		Select dd = new Select(dropDown);
		List<WebElement> options = dd.getOptions();
		
		System.out.println(options.get(1));
		System.out.println(dd.getOptions().size());
		dd.selectByValue("babycat");
		

	}

}
