package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {
	
	
	public static void main(String[] args) {
		int a = 0;
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.findElementById("yes").click();
		boolean selected = driver.findElementById("yes").isSelected();
		System.out.println(selected);

		boolean selected2 = driver.findElementByXPath("(//input[@value='0'])[2]").isSelected();
		boolean selected3 = driver.findElementByXPath("(//input[@value='1'])[2]").isSelected();

		if (selected2) {
			System.out.println("First option is selected");

		} else if (selected3) {
			System.out.println("Second option is selected");
		} else
			System.out.println("None of the options are sleected");

		for (int i = 1; i < 4; i++) {

			boolean selected4 = driver.findElementByXPath("//input[@name='age'][" + i + "]").isSelected();
			if (selected4) {
				System.out.println(i+"This option is being selected");
				a++;
			}

		}

		if (a == 0) {

			driver.findElementByXPath("//input[@name='age'][3]").click();

		}

	}

}
