package br.com.rsinet.hub_tdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;

public class PaginaInicial {

	public WebDriver driver;

	private static MobileElement element;

		public void HomePage (WebDriver driver) {
			this.driver = driver;
		}

	public static MobileElement btnMenu(WebDriver driver) {
		element = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));
		return element;
	}

	public static WebElement btnLogin(WebDriver driver) throws Exception{
		element = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutLogin"));
		return element;
	}
	
	public static WebElement btnCriarConta(WebDriver driver) throws Exception{
		element = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/textViewSingUpToday"));
		return element;
	}
}
