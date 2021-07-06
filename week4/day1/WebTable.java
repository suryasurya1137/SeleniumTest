package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		// get table locator
		WebElement webTable = driver.findElementByXPath("//table[@id='table_id']");
		// get no of rows in a table
		List<WebElement> noOfRows = webTable.findElements(By.tagName("tr"));
		WebElement row1 = noOfRows.get(0);
		System.out.println(row1.getText());
		int rowsize = noOfRows.size();
		System.out.println(rowsize);

		// to get no of columns
		List<WebElement> firstRowValues = row1.findElements(By.tagName("th"));
		System.out.println(firstRowValues.size());

		for (int i = 1; i <rowsize; i++) {
			WebElement row = noOfRows.get(i);
			List<WebElement> findElements = row.findElements(By.tagName("td"));
			System.out.println(findElements.get(4).getText());

		}
		
		List<WebElement> findElements = noOfRows.get(3).findElements(By.tagName("td"));
		String text2 = findElements.get(1).getText();
		System.out.println(text2);
		
		List<Integer> a = new ArrayList<Integer>();
		
		List<WebElement> secondRowValues = driver.findElementsByXPath("//table[@id='table_id']//tr/td[2]");
		for (WebElement listVariable : secondRowValues) {
			String text = listVariable.getText().replaceAll("%", "");
			a.add(Integer.parseInt(text));
			
		}
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Integer lowest = a.get(0);
		driver.findElementByXPath("//td[contains(text(),'"+lowest+"')]/following-sibling::td/input").click();
		

//		String text = driver.findElementByXPath("(//table[@id='table_id']//tr)[3]/td[2]").getText();
//		System.out.println(text);

		//List<Integer> a = new ArrayList<Integer>();

	}

}
