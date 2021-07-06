package week1.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeranListBoxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		WebElement drpDown1 = driver.findElementByXPath("(//div[@class='example'])[1]/select");
		Select dd1 =  new Select(drpDown1);
		dd1.selectByIndex(2);
		int size = dd1.getOptions().size();
		System.out.println(size);
		
		WebElement drpDown2 = driver.findElementByXPath("(//div[@class='example'])[2]/select");
		Select dd2 =  new Select(drpDown2);
		dd2.selectByVisibleText("Loadrunner");
		
		WebElement drpDown3 = driver.findElementByXPath("(//div[@class='example'])[3]/select");
		Select dd3 =  new Select(drpDown3);
		dd3.selectByValue("3");
		
		WebElement drpDown4 = driver.findElementByXPath("(//div[@class='example'])[4]/select");
		Select dd4 =  new Select(drpDown4);
		int size2 = dd4.getOptions().size();
		System.out.println(size2);
		
		driver.findElementByXPath("(//div[@class='example'])[5]/select").sendKeys("UFT/QTP");
		
		WebElement drpDown5 = driver.findElementByXPath("(//div[@class='example'])[6]/select");
		
		Select dd5= new Select(drpDown5);
		dd5.selectByIndex(4);
		dd5.selectByIndex(3);
		dd5.selectByIndex(2);
		
		
		
	}

}
