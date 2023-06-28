package extentreport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Results {
	
	public void Demo() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://omayo.blogspot.com/");
		String actualText = driver.findElement(By.id("pah")).getText();
		
		if(actualText.equals("PracticeAutomationHere")) {
			
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}
		driver.close();
		
	}
	

}
