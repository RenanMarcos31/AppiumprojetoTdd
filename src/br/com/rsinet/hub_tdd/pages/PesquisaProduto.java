package br.com.rsinet.hub_tdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;

public class PesquisaProduto {

	public WebDriver driver;
	
	private static MobileElement element;

	public void PesquisaPLupa(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement btnProduto(WebDriver driver) {
		element = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/imageViewProduct"));
		return element;
	}
	
	public static WebElement btnNoteBook(WebDriver driver) {
		element =(MobileElement) driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Laptops\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.ImageView"));
		return element;
	}
	
	public static WebElement btnAddCarrinho(WebDriver driver) {
		element = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart"));
		return element;
	}
	
	public static WebElement btnUserName(WebDriver driver) {
		element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.TextView"));
		return element;
	}
	

	public static WebElement btnPassword(WebDriver driver) {
		element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.TextView"));
		return element;
	}
	
	public static WebElement btnRegistro(WebDriver driver) {
		element = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/buttonLogin"));
		return element;
	}
}
