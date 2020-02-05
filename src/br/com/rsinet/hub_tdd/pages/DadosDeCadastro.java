package br.com.rsinet.hub_tdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DadosDeCadastro {

	public WebDriver driver;
	private static WebElement element;
	
	public void eltsCadastro(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement txtUsuario (WebDriver driver) {
		element = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView"));
		return element;
	}
	
	public static WebElement txtemail (WebDriver driver) {
		element = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView"));
		return element;
	}
	public static WebElement txtSenha (WebDriver driver) {
		element = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView"));
		return element;
	}
	
	public static WebElement txtConfirmaSenha (WebDriver driver) {
		element = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView"));
		return element;
	}
	public static WebElement txtPrimeiroNome (WebDriver driver) {
		element = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView"));
		return element;
	}
	public static WebElement txtSobrenome (WebDriver driver) {
		element = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView"));
		return element;
	}
	public static WebElement txtTelefone (WebDriver driver) {
		element = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
		return element;
	}
	public static Select cbxPais (WebDriver driver) {
		Select select = new Select(driver.findElement(By.id("com.Advantage.aShopping:id/textViewCountries")));
		select.selectByVisibleText("Brazil");
		return select;
	}
	
	public static WebElement txtCidade (WebDriver driver) {
		element = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView"));
		return element;
	}
	
	public static WebElement txtEndereco (WebDriver driver) {
		element = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
		return element;
	}
	
	public static WebElement txtEstado (WebDriver driver) {
		element = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView"));
		return element;
	}
	
	public static WebElement txtCep (WebDriver driver) {
		element = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.TextView"));
		return element;
	}
//	public static WebElement btnAceito (WebDriver driver) {
//		element = driver.findElement(By.name("i_agree"));
//		return element;
//	}
	
	public static WebElement btnRegistrar (WebDriver driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister\r\n" + 
				""));
		return element;
		
	}
}
