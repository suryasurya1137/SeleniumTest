package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCalender {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		driver.findElementById("datepicker").click();
		/*
		 * WebElement table = driver.findElementByXPath("//table"); List<WebElement>
		 * rowWebelements = table.findElements(By.tagName("tr"));
		 * System.out.println(rowWebelements.size()); List<WebElement> cellvalues =
		 * rowWebelements.get(2).findElements(By.tagName("td"));
		 * System.out.println(cellvalues.size()); cellvalues.get(6).click();
		 */
		
		driver.findElementByXPath("//table[@class='ui-datepicker-calendar']//tr[2]/td[7]").click();

	}

}
