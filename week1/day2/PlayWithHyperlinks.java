package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithHyperlinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();

		driver.findElementByLinkText("Go to Home Page").click();
		
		driver.findElementByXPath("//h5[text()='HyperLink']").click();
		
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		
		  String attribute = driver.
		  findElementByLinkText("Find where am supposed to go without clicking me?").
		  getAttribute("href");
		  //driver.get(attribute); 
		  System.out.println(attribute);
		  
		  
		  
		  
		  driver.findElementByLinkText("Verify am I broken?").click(); 
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  String title =  driver.getTitle(); 
		  if (title.contains("404 – Not Found")) {
		  System.out.println("This is broken image");
		  
		  }else { System.out.println("Not a broken image"); }
		  
		 
		

	}

}
