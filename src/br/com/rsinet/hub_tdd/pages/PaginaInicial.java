package br.com.rsinet.hub_tdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PaginaInicial {

	public static AndroidDriver<?> driver;
	private static MobileElement element;

		public void HomePage (AndroidDriver<?> driver) {
			PaginaInicial.driver = driver;
		}

	public static MobileElement btnMenu(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));
	}

	public static  MobileElement btnLogin(AndroidDriver<?> driver) throws Exception{
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutLogin"));
	}
	
	public static MobileElement btnUserName(AndroidDriver<?> driver) throws Exception{
		return (MobileElement) driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText"));
	}
	
	public static MobileElement btnPassword(AndroidDriver<?> driver) throws Exception{
		return (MobileElement) driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText"));
	}
	
	public static MobileElement btnLogar(AndroidDriver<?> driver) throws Exception{
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/buttonLogin"));
	}
	
	public static MobileElement btnCriarConta(AndroidDriver<?> driver) throws Exception{
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/textViewSingUpToday"));
	}
	
	public static MobileElement btnBarra(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));
	}
	
	public static MobileElement btnLupa(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));
	}
	
	public static MobileElement btnLaptops(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView"));
	}
	
	public static MobileElement user(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser"));
	}
}
