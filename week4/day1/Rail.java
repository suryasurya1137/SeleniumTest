package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import week1.day1.Array;

public class Rail {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://erail.in/");
		driver.manage().window().maximize();

		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("ms", Keys.ENTER);
		// driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		WebElement toStation = driver.findElementByXPath("//input[@id='txtStationTo']");
		toStation.clear();
		toStation.sendKeys("mdu");
		toStation.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		Thread.sleep(3000);
		// driver.findElementByXPath("//input[@id='buttonFromTo']").click();
		Thread.sleep(5000);
		List<WebElement> listOfTrains = driver.findElementsByXPath("//div[@id='divTrainsList']/table[1]//tr/td[2]");
		System.out.println(listOfTrains.size());

		Set<String> trainstoString = new LinkedHashSet<String>();
		
		for (int i = 0; i < listOfTrains.size(); i++) {
			String text = listOfTrains.get(i).getText();
			trainstoString.add(text);
		}
		System.out.println(trainstoString.size());
		System.out.println(trainstoString);
//
//		for (WebElement trains : listOfTrains) {
//			trainstoString.add(trains.getText());
//
//		}
//
//		Collections.sort(trainstoString);
//
//		System.out.println(trainstoString);

	}

}
