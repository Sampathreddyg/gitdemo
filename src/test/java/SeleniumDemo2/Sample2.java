package SeleniumDemo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) {

		WebDriver driver =  new ChromeDriver();
		driver.get("https://google.com");
		
		driver.close();
		
	}

}
