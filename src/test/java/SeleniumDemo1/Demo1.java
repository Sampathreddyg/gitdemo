package SeleniumDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {

	public static void main(String[] args) {

		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println("Page title: "+title);
		driver.close();
		
	}

}
