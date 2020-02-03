package br.com.rsinet.hun_tdd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	static WebDriver driver;
	
	public static WebDriver createChrome() {
		if (driver == null) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.advantageonlineshopping.com/#/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static WebDriver fecharChrome() {
		if (driver != null)
			driver.close();
		return driver = null;
	}
}
