package br.com.rsinet.hub_tdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PesquisaLupa {

public WebDriver driver;
	
	private static WebElement element;
	
	public void PesquisaPelaLupa(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement barraPesquisa(WebDriver driver) {
		element = driver.findElement(By.id("autoComplete"));
		return element;
	}
	
	public static WebElement clickProducto(WebDriver driver) {
		element = driver.findElement(By.id("16"));
		return element;
	}
}
