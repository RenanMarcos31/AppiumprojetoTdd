package br.com.rsinet.hub_tdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DadosDeCadastro {

	public static AndroidDriver driver;
	public static MobileElement element;
	
	public void eltsCadastro(AndroidDriver<?> driver) {
		DadosDeCadastro.driver = driver;
	}
	
	public static MobileElement txtUsuario (AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"));
	}
	
	public static MobileElement txtemail (AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
	}
	public static MobileElement txtSenha (AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));
	}
	
	public static MobileElement txtConfirmaSenha (AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
	}
	public static MobileElement txtPrimeiroNome (AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText"));
	}
	public static MobileElement txtSobrenome (AndroidDriver<?> driver) {
		return  (MobileElement) driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText"));
	}
	public static MobileElement txtTelefone (AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
	}
	
	public void descerPage() {
		((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "REGISTER" + "\").instance(0))");
	}
	
	public static MobileElement listboxPaís(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutCountry"));
	}
	
	public static MobileElement txtCidade (AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText"));
	}
	
	public static MobileElement txtEndereco (AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
	}
	
	public static MobileElement txtEstado (AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
	}
	
	public static MobileElement txtCep (AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText"));
	}
	
	public static MobileElement btnRegistrar (AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister"));
	}
}
