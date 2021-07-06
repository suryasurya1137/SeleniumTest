package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithCheckbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/checkbox.html");

		driver.manage().window().maximize();
		driver.findElementByXPath("((//div[@class='example'])[1]//input)[1]").click();
		driver.findElementByXPath("((//div[@class='example'])[1]//input)[3]").click();

		boolean selected = driver.findElementByXPath("(//div[@class='example'])[2]//input").isSelected();

		if (selected) {
			System.out.println("Selenium is Checked");
		}

		boolean selected2 = driver.findElementByXPath("((//div[@class='example'])[3]//input)[1]").isSelected();

		if (selected2) {
			driver.findElementByXPath("((//div[@class='example'])[3]//input)[1]").click();
		}
		boolean selected3 = driver.findElementByXPath("((//div[@class='example'])[3]//input)[2]").isSelected();
		if (selected3) {
			driver.findElementByXPath("((//div[@class='example'])[3]//input)[2]").click();
		}

		for (int i = 1; i < 6; i++) {
			driver.findElementByXPath("((//div[@class='example'])[4]//input)[" + i + "]").click();
		}
	}

}
