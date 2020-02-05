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

	public static WebElement btnMenu(WebDriver driver) {
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
	
	public static WebElement btnBarra(WebDriver driver) {
		element = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));
		return element;
	}
	
	public static WebElement btnLupa(WebDriver driver) {
		element = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));
		return element;
	}
	
	public static WebElement btnLaptops(WebDriver driver) {
		element = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView"));
		return element;
	}
}
