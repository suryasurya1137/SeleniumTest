package week1.day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonsPage {

	private static int height;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://leafground.com/pages/Button.html");
		
		//driver.findElementById("home").click();
		Point location = driver.findElementById("position").getLocation();
		System.out.println(location);
		Class<? extends Point> class1 = driver.findElementById("position").getLocation().getClass();
		System.out.println(class1);
		int x = driver.findElementById("position").getLocation().getX();
		System.out.println(x);
		String cssValue = driver.findElementById("color").getCssValue("background-color");
		System.out.println(cssValue);
		Dimension size = driver.findElementById("size").getSize();
		System.out.println(size);
		int b = driver.findElementById("size").getSize().getHeight();
		System.out.println(b);
		

	}

}
