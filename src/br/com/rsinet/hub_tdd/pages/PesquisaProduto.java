package br.com.rsinet.hub_tdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaProduto {

	
	private static MobileElement element;
	private static AndroidDriver<?> driver;

	public void PesquisaPLupa(AndroidDriver<?> driver) {
		PesquisaProduto.driver = driver;
	}
	
	public static MobileElement btnProduto(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]"));
	}
	
	public static MobileElement btnNoteBook(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Laptops\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.ImageView"));
	}
	
	public static MobileElement btnQuantidade(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutProductQuantity"));
	}
	
	public static MobileElement btnQtd(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
	}
	
	public static MobileElement btnAplly(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/textViewApply"));
	}
	
	public static MobileElement btnAddToCart(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart"));
	}
	
}
